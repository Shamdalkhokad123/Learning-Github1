package com.gmart.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gmart.model.ContcatDetail;

@Repository("contactDetail")
@Transactional
public class ContactDetailsDaoImpl implements ContactDetailDao
{
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public boolean savedetails(ContcatDetail contact) 
	{
		try
		{
			sessionFactory.getCurrentSession().save(contact);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
		
	}

}
