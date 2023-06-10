package com.gmart.dao;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gmart.model.OrderDetail;
@Repository("orderDetailDao")
@Transactional
public class OrderDaoImpl implements OrderDetailDao
{
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public boolean saveOrder(OrderDetail orderDetail) {
		try
		{
			sessionFactory.getCurrentSession().save(orderDetail);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	@Override
	public boolean updateCart(String username) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("update CartItem set PaymentStatus='P' where username=:uname");
		query.setParameter("uname",username);
		int row = query.executeUpdate();
		
		if(row >0)
		{
			return true;
		}
		else 
		{
			return false;
		}
		
	}

}
