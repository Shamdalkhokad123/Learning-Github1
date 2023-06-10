package com.gmart.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gmart.dao.CartDao;
import com.gmart.dao.OrderDetailDao;
import com.gmart.dao.ProductDao;
import com.gmart.dao.RegisterDao;
import com.gmart.model.CartItem;
import com.gmart.model.OrderDetail;
import com.gmart.model.UserDetails;

@Controller
public class PaymentController 

{
	private static final String CART = "cartItemList";  
	
	private static final String GTOTAL = "grandTotal";  
	private static final String CID = "custid";  
	@Autowired
	CartDao cartDao;
	@Autowired
	
	ProductDao productDao;
	
	@Autowired
	RegisterDao registerDao;
	
	@Autowired
	OrderDetailDao orderDetailDao;
	
	@RequestMapping("/checkout")
	public String checkout(Model m,HttpSession session)
	{
		
		  Integer custId =  (Integer) session.getAttribute("custId"); 
		  List<CartItem> cartItemList = cartDao.listCartItems();
		  
		  m.addAttribute(CART, cartItemList); 
		  m.addAttribute(GTOTAL,this.getGrandTotal(cartItemList));
		  
		  UserDetails register = registerDao.getUser(custId);
		  
		  String address = register.getAddress(); 
		  m.addAttribute("addr", address);
		 
		return "confirmOrder";
	}
	
	@PostMapping(value="/UpdateAddr")
	public String updateAddr(@RequestParam("address") String address,Model m, HttpSession session)
	{
		Integer custId =  (Integer) session.getAttribute(CID); 
		List<CartItem> cartItemList = cartDao.listCartItems();
		
		m.addAttribute(CART, cartItemList);
		m.addAttribute(GTOTAL, this.getGrandTotal(cartItemList));
		
		UserDetails register = registerDao.getUser(custId);
		register.setAddress(address);
		registerDao.updateUser(register);
		
		String addr = register.getAddress();
		
		m.addAttribute("addr", addr);
		
		return "confirmOrder";
	}
	
	@RequestMapping(value="/payment")
	 public String paymentpage(Model m,HttpSession session)
	 {
		return "Payment";
	 }
	
	
	@PostMapping(value="/receipt" )
	public String generateReceipt(@RequestParam("rd") String rd,Model m,HttpSession session)
	{
		
		  Integer custId =  (Integer) session.getAttribute("custId"); 
          UserDetails register = registerDao.getUser(custId);
		  
		  String address = register.getAddress(); 
		  
		  OrderDetail orderDetail = new OrderDetail(); 
		  orderDetail.setOrderDate(new java.util.Date());
		  orderDetail.setShippingAddr(address);
		  orderDetail.setTrans(rd); 
		  orderDetail.setUsername(custId.toString());
		  
		  List<CartItem> cartItemList= cartDao.listCartItems();
		  m.addAttribute(CART, cartItemList); 
		  m.addAttribute(GTOTAL,this.getGrandTotal(cartItemList));
		  
		  orderDetail.setTotalAmount((int)this.getGrandTotal(cartItemList));
		  
		  orderDetailDao.saveOrder(orderDetail); 
		  orderDetailDao.updateCart(custId.toString());
		  
		  m.addAttribute("orderDetail", orderDetail);
		  m.addAttribute("addr", address);
		 
		return "Receipt";
		
	}
	
	public float getGrandTotal(List<CartItem> cartList)
	{
		float grandTotal=0;
		int count=0;
		
		while(count<cartList.size())
		{
			grandTotal = grandTotal+(cartList.get(count).getQuantity()*cartList.get(count).getPrice());
			count++;
		}
		return grandTotal;
	}

}
