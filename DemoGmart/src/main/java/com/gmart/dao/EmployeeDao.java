package com.gmart.dao;

import java.util.List;

import com.gmart.model.Employee;


public interface EmployeeDao 
{
	public boolean addEmployee(Employee employee);
	public boolean deleteEmployee(Employee employee);
	public boolean updateEmployee(Employee employee);

	public List<Employee> listEmployee();
	public Employee getEmployee(int employeeId);
}
