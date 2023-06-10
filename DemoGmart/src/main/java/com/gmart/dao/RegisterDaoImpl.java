package com.gmart.dao;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.gmart.model.UserDetails;

@Repository("registerDao")
public class RegisterDaoImpl implements RegisterDao
{
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public boolean registerUser(UserDetails user)
	{
		try
		{
			sessionFactory.getCurrentSession().save(user);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	@Override
	public boolean updateUser(UserDetails user) {
		try
		{
			sessionFactory.getCurrentSession().update(user);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	@Override
	public UserDetails getUser(int custId) {
		Session session = sessionFactory.openSession();
		UserDetails register = session.get(UserDetails.class, custId);
		session.close();
		return register;
	}

	@Override
	public boolean loginUser( int custId, String passWord)
	{
		Session session = sessionFactory.openSession();
		String hql="from UserDetails u where u.custId= :custId and u.passWord= :passWord";
		Query query = session.createQuery(hql);
		
		query.setParameter("custId", custId);
		query.setParameter("passWord", passWord);
		if(query.getResultList()!=null)
		
			return true;
		
		else
		
			return false;
		
		
	}

}
