package com.gmart.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.gmart.dao.EmployeeDao;
import com.gmart.model.Employee;

@Controller
public class EmployeeController
{
	@Autowired
	EmployeeDao employeeDao;
	
	@RequestMapping("/allEmployee")
	public String showAllEmployee(Model m)
	{
		List<Employee>  employee = employeeDao.listEmployee();
		m.addAttribute("employee", employee);
		return "allEmployee";
		
	}
	@RequestMapping(value = "/deleteE/{employeeId}")
	public RedirectView deleteProduct(@PathVariable("employeeId") int employeeId, Model m, HttpServletRequest request) {
		Employee product = employeeDao.getEmployee(employeeId);
		employeeDao.deleteEmployee(product);

		Employee product1 = new Employee();
		m.addAttribute(product1);

		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/allEmployee");
		return redirectView;

}
}