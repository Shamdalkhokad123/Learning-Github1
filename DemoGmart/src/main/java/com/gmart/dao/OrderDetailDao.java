package com.gmart.dao;

import com.gmart.model.OrderDetail;

public interface OrderDetailDao 

{
	public boolean saveOrder(OrderDetail orderDetail);
	public boolean updateCart(String username);

}
