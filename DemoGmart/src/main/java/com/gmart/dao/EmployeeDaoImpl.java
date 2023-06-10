package com.gmart.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gmart.model.Employee;

@SuppressWarnings("deprecation")
@Repository("employeedao")
@Transactional
public class EmployeeDaoImpl implements EmployeeDao
{
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public boolean addEmployee(Employee employee) {
		try
		{
			sessionFactory.getCurrentSession().save(employee);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	@Override
	public boolean deleteEmployee(Employee employee) {
		try
		{
			sessionFactory.getCurrentSession().delete(employee);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		try
		{
			sessionFactory.getCurrentSession().update(employee);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	@Override
	public List<Employee> listEmployee() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Employee");
		@SuppressWarnings("unchecked")
		List<Employee> listEmployee = query.list();
		session.close();
		return listEmployee;
	}

	@Override
	public Employee getEmployee(int employeeId) {
		Session session= sessionFactory.openSession();
		Employee employee = session.get(Employee.class, employeeId);
		session.close();
		return employee;
	}
	

}
