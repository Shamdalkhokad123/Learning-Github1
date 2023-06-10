package com.gmart.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gmart.model.Product;
@Repository("productDao")
@Transactional
public class ProductDaoImpl implements ProductDao
{
	
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public boolean addProduct(Product product) {
		try
		{
			sessionFactory.getCurrentSession().save(product);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}

	}

	@Override
	public boolean deleteProduct(Product product) {
		try
		{
			sessionFactory.getCurrentSession().delete(product);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}

	}

	@Override
	public boolean updateProduct(Product product) {
		try
		{
			sessionFactory.getCurrentSession().update(product);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}

	}

	@Override
	public List<Product> listProducts() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Product");
		@SuppressWarnings("unchecked")
		List<Product> listProduct = query.list();
		session.close();
		return listProduct;
	}

	@SuppressWarnings("deprecation")
	@Override
	public Product getProduct(int productId) 
	{
		
		Session session= sessionFactory.openSession();
		Query q = session.createQuery("from Product where productId = :productId");
		q.setInteger("productId", productId);
		
		Product product = (Product) q.uniqueResult();
		session.close();
		return product;
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Product> getSingleProduct(int productId) {
		Session session = sessionFactory.openSession();
		Query q = session.createQuery("from Product where productId = 28");
        q.setInteger("productId", productId);
        List<Product> docInfoList = q.list();
        return docInfoList;
	}


}
