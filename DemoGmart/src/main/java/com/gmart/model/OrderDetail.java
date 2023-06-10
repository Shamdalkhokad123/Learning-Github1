package com.gmart.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class OrderDetail
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int orederId;
	int cartItemId;
	int totalAmount;
	
	String username;
	Date orderDate;
	String shippingAddr;
	String trans;
	public int getOrederId() {
		return orederId;
	}
	public void setOrederId(int orederId) {
		this.orederId = orederId;
	}
	public int getCartItemId() {
		return cartItemId;
	}
	public void setCartItemId(int cartItemId) {
		this.cartItemId = cartItemId;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int f) {
		this.totalAmount = f;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getShippingAddr() {
		return shippingAddr;
	}
	public void setShippingAddr(String shippingAddr) {
		this.shippingAddr = shippingAddr;
	}
	public String getTrans() {
		return trans;
	}
	public void setTrans(String trans) {
		this.trans = trans;
	}
	@Override
	public String toString() {
		return "OrderDetail [orederId=" + orederId + ", cartItemId=" + cartItemId + ", totalAmount=" + totalAmount
				+ ", username=" + username + ", orderDate=" + orderDate + ", ShippingAddr=" + shippingAddr + ", Trans="
				+ trans + "]";
	}
	public OrderDetail(int orederId, int cartItemId, int totalAmount, String username, Date orderDate,
			String shippingAddr, String trans) {
		super();
		this.orederId = orederId;
		this.cartItemId = cartItemId;
		this.totalAmount = totalAmount;
		this.username = username;
		this.orderDate = orderDate;
		this.shippingAddr = shippingAddr;
		this.trans = trans;
	}
	public OrderDetail() {
		super();
		
	}
	
	

}
