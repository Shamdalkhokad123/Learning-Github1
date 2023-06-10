package com.gmart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CartItem 
{
	@Id
	@GeneratedValue
	
	private int cartItemId;
	private int productId;
	private int quantity;
	private  float price;
	
	private String productName;
	private String userName;
	private String paymentStatus;
	public CartItem() {
		super();

	}
	public CartItem(int cartItemId, int productId, int quantity, int price, String productName, String userName,
			String paymentStatus) {
		super();
		this.cartItemId = cartItemId;
		this.productId = productId;
		this.quantity = quantity;
		this.price = price;
		this.productName = productName;
		this.userName = userName;
		this.paymentStatus = paymentStatus;
	}
	public int getCartItemId() {
		return cartItemId;
	}
	public void setCartItemId(int cartItemId) {
		this.cartItemId = cartItemId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float f) {
		this.price = f;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getFirstname() {
		return userName;
	}
	public void setFirstname(String userName) {
		this.userName = userName;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
	
	

}
