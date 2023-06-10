package com.gmart.dao;

import java.util.List;

import com.gmart.model.CartItem;

public interface CartDao 
{

	public boolean addCartItem(CartItem cartItem);
	public boolean deleteCartItem(CartItem cartItem);
	public boolean updateCartItem(CartItem cattItem);

	public List<CartItem> listCartItems();
	public CartItem getCartItem(int cartItemtId);

}
