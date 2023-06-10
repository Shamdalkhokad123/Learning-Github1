package com.gmart.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gmart.dao.CartDao;
import com.gmart.dao.ProductDao;
import com.gmart.model.CartItem;
import com.gmart.model.Product;
import com.gmart.model.UserDetails;

@Controller
public class CartItemController
{
	@Autowired
	CartDao  cartDao;
	UserDetails register;
	
	@Autowired
	ProductDao productDao;
	
	private static final String CART = "cartItemList";  
	private static final String USER = "username";  
	private static final String GTOTAL = "grandTotal";  
	private static final String CID = "custid";  
	@RequestMapping("/Cart")
	public String showCart(Model m,HttpSession session)
	{
		
		
		List<CartItem> cartItemList = cartDao.listCartItems();
		Integer username = (Integer) session.getAttribute(CID);
		m.addAttribute(CART, cartItemList);
		m.addAttribute(USER, username);
		m.addAttribute(GTOTAL,this.getGrandTotal(cartItemList));
		
		return "Cart";
	}
	
	@RequestMapping("/productDisplay")
	public String displayAllProduct(Model model,HttpSession session) {
		
		Integer username = (Integer) session.getAttribute(CID);
		List<Product> products = productDao.listProducts();
		model.addAttribute("product", products);
		model.addAttribute(USER, username);
		
		return "productDisplay";
	}

	@RequestMapping("/totalProductDisplay/{productId}")
	public String selectProductDisplay(@PathVariable("productId") int productId, Model m,HttpSession session) {
		
		Integer username = (Integer) session.getAttribute("custId");
		Product product1 = productDao.getProduct(productId);
		
		m.addAttribute("msg", "Succe");
		m.addAttribute(USER, username);
		m.addAttribute("prod", product1);
		return "totalProductDisplay";
		
		

		

	}
	
	
	@RequestMapping(value = "/addToCart/{productId}")
	public String addToCart(@PathVariable("productId") int productId, Model m, @RequestParam("quantity") int quantity,
			HttpSession session) {

		Product product = productDao.getProduct(productId);
		Integer username = (Integer) session.getAttribute(CID);

		CartItem cartItem = new CartItem();
		cartItem.setQuantity(quantity);
		cartItem.setProductId(product.getProductId());
		cartItem.setProductName(product.getProductName());
		cartItem.setPrice(product.getPrice());
		
		cartItem.setPaymentStatus("NP");

		cartDao.addCartItem(cartItem);

		List<CartItem> cartItemList = cartDao.listCartItems();

		m.addAttribute(CART, cartItemList);

		m.addAttribute(GTOTAL, this.getGrandTotal(cartItemList));
		m.addAttribute(USER, username);
		return "Cart";
	}
	
	@RequestMapping(value = "/updateCartItem/{cartItemId}")
	public String updateCart(@PathVariable("cartItemId") int cartItemId, Model m,@RequestParam("quantity")int quantity,HttpSession session)
	{
		
		CartItem cartItem = cartDao.getCartItem(cartItemId);
		cartItem.setQuantity(quantity);
		
		cartDao.updateCartItem(cartItem);
		
		Integer username = (Integer) session.getAttribute(CID);
        List<CartItem> cartItemList = cartDao.listCartItems();
		m.addAttribute(USER, username);
		m.addAttribute(CART, cartItemList);
		m.addAttribute(GTOTAL, this.getGrandTotal(cartItemList));
		
		return "Cart";
	}
	
	@RequestMapping("/deleteCartItem/{cartItemId}")
	public String deleteCartItem(@PathVariable("cartItemId")int cartItemId,Model m,HttpSession session)
	{
		CartItem cartItem = cartDao.getCartItem(cartItemId);
		cartDao.deleteCartItem(cartItem);
		
		String username = (String)session.getAttribute(USER);
        List<CartItem> cartItemList = cartDao.listCartItems();
        m.addAttribute(USER, username);
		m.addAttribute(CART, cartItemList);
		m.addAttribute(GTOTAL, this.getGrandTotal(cartItemList));
		
		return "Cart";
		
		
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
