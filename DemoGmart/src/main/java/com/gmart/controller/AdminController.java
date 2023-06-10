package com.gmart.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.gmart.dao.CategoryDao;
import com.gmart.dao.EmployeeDao;
import com.gmart.model.Category;
import com.gmart.model.Employee;



@Controller
public class AdminController
{
	@Autowired
	private EmployeeDao employeeDao;
	@Autowired
	private CategoryDao categoryDao;
	
	@RequestMapping("/employeeRegister")
	public String addEmp()
	{
		return "employeeRegister";
	}
	//handle add product form
	@PostMapping(value = "/handleEmployee")
	public String handleEmployee( HttpServletRequest request,Model m) 
	{
		Employee newemp = new Employee();
		employeeDao.addEmployee(newemp);
		m.addAttribute("msg", "User Register Successfully");
		return "admin";
	}
	@RequestMapping("/admin")
	public String showAdmin()
	{
		return "admin";
	}
	@RequestMapping("/addCategories")
	public String showCategories(Model m)
	{
		
		return "addCategories";
	}
	@RequestMapping("catagories")
	public String categories(Model m)
	{
		List<Category> categories = categoryDao.listCategorys();
		m.addAttribute("category", categories);
		return "catagories";
	}
	@PostMapping(value = "/handleCategory")
	public String handleCategory( HttpServletRequest request,Model m) 
	{
		Category newCat = new Category();
		categoryDao.addCategory(newCat);
		m.addAttribute("msg", "Category Added  Successfully");
		return "addCategories";
	}
	
		@RequestMapping("/delete/{categoryId}")
		public RedirectView deleteCat(@PathVariable("categoryId") int categoryId, Model m,HttpServletRequest request) {
			Category cat =categoryDao.getCategory(categoryId);
			
			categoryDao.deleteCategory(cat);
			RedirectView redirectView = new RedirectView();
			redirectView.setUrl( request.getContextPath() + "/catagories");
			return redirectView;
		}
		
		  @RequestMapping("/update/{categoryId}" ) 
		  public String updateForm(@PathVariable("categoryId") int categoryId, Model model) 
		  { 
				
			  Category cat = categoryDao.getCategory(categoryId);
		
		model.addAttribute("product",cat);
		   return "updateCategory"; 
		   }
		 
		
		
		  @PostMapping("update/updateCategory/{categoryId}")
		  public RedirectView updateCategory(@PathVariable("categoryId") int categoryId,@RequestParam("categoryName") String categoryName,@RequestParam("categoryDesc") String categoryDesc,HttpServletRequest request, Model m) 
		  { 
			  
			  Category cat = categoryDao.getCategory(categoryId);
			  
			  cat.setCategoryName(categoryName);
			  cat.setCategoryDesc(categoryDesc);
			  
			  this.categoryDao.updateCategory(cat);
		      m.addAttribute("msg", "Category Updated  Successfully"); 
		      RedirectView redirectView = new RedirectView();
				redirectView.setUrl( request.getContextPath() + "/catagories");
				return redirectView;
		   }
		  
		 
}
