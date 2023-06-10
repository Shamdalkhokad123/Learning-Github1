package com.gmart.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.gmart.dao.RegisterDao;

@Controller
public class LoginController 
{
	@Autowired
	RegisterDao registerDao;
	
	private static final String LOGIN = "login";
	
	@RequestMapping("/login")
	public String login()
	{
		return LOGIN;
	}
	
	@PostMapping(value = "/checkUser")
	public String checkUser(@RequestParam("custId") int custId,@RequestParam("passWord") String passWord,HttpServletRequest request,Model m)
	{
		Integer loginId1=1111;
		
		if(loginId1.equals(1111) && passWord.equals("12345678"))
		{
			request.getSession().setAttribute("username", loginId1);
			return "admin";
		}
		else
		{
			if(registerDao.loginUser(custId, passWord))
			{
				
				request.getSession().setAttribute("custId",custId );
				return "welcomeCustomer";
			}
			else
			{
				m.addAttribute("message", "LoginId or Password is wrong");
				return LOGIN;
			}
			    
		}
		
	}
	@RequestMapping("/perform_logout")
	public String performLogout(HttpServletRequest req)
	{
		req.getSession().invalidate();
		
		return LOGIN;
	}
	
	

}
