package com.gmart.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gmart.model.Category;
@SuppressWarnings("deprecation")
@Repository("categoryDao")
@Transactional
public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public boolean addCategory(Category category) {
		try
		{
			sessionFactory.getCurrentSession().save(category);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	@Override
	public boolean deleteCategory(Category category) {
		try
		{
			sessionFactory.getCurrentSession().delete(category);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	@Override
	public boolean updateCategory(Category category) {
		try
		{
			sessionFactory.getCurrentSession().update(category);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	@Override
	public List<Category> listCategorys() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Category");
		List<Category> listcategory = query.list();
		session.close();
		return listcategory;
	}

	@Override
	public Category getCategory(int categorytId) {
		Session session= sessionFactory.openSession();
		Category category = session.get(Category.class, categorytId);
		session.close();
		return category;
	}
}
