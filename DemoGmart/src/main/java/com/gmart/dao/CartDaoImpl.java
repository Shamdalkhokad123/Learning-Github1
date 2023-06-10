package com.gmart.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gmart.model.CartItem;

@Repository("cartItem")
@Transactional
public class CartDaoImpl implements CartDao
{
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean addCartItem(CartItem cartItem) {
		try
		{
			sessionFactory.getCurrentSession().save(cartItem);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	@Override
	public boolean deleteCartItem(CartItem cartItem) {
		try
		{
			sessionFactory.getCurrentSession().delete(cartItem);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	@Override
	public boolean updateCartItem(CartItem cattItem) {
		try
		{
			sessionFactory.getCurrentSession().update(cattItem);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	@Override
	public List<CartItem> listCartItems() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from CartItem");
		@SuppressWarnings("unchecked")
		List<CartItem> listCartItem = query.getResultList();
		session.close();
		return listCartItem;
	}

	@Override
	public CartItem getCartItem(int cartItemtId) {
		Session session= sessionFactory.openSession();
		CartItem cartItem = session.get(CartItem.class, cartItemtId);
		session.close();
		return cartItem;
	}
}
