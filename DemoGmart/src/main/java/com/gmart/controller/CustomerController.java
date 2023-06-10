package com.gmart.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gmart.dao.ProductDao;
import com.gmart.dao.RegisterDao;
import com.gmart.model.UserDetails;

@Controller
public class CustomerController 
{
	@Autowired
	private RegisterDao registerDao;
	
	@Autowired
	ProductDao productDao;
	// show add product form
		@RequestMapping("/register")
		public String addProduct(Model m) {
			m.addAttribute("title", "Add Customer");
			return "register";
		}
		
//		handle add product form
		@PostMapping(value = "/handleCustomer")
		public String handleProduct(HttpServletRequest request,Model m) 
		{
			UserDetails register = new UserDetails();
			
			registerDao.registerUser(register);
			m.addAttribute("msg", "User Register Successfully");
			return "login";
		}
		
		@RequestMapping("/welcomeCustomer")
		public String showCustomerHome()
		{
			return "welcomeCustomer";
		}
		
		}
