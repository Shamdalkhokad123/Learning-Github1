package com.gmart.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gmart.dao.ContactDetailDao;
import com.gmart.model.ContcatDetail;

@Controller
public class HomeController 
{
	@Autowired 
	ContactDetailDao contactDetailDao;
	private static final String INDEX = "index";
	@GetMapping("/")
	public String home()
	{
		return INDEX;
	}
	
	@RequestMapping("/index")
	public String index()
	{
		return INDEX;
	}
	
	@RequestMapping("/contact")
	public String contact()
	{
		return "contact";
	}
	@PostMapping(value = "/handleContact")
	public String handleCategory( HttpServletRequest request,Model m) 
	{
		ContcatDetail cat = new ContcatDetail();
		
		contactDetailDao.savedetails(cat);
		m.addAttribute("msg", "Message Added  Successfully");
		return INDEX;
	}
	
}
