package com.gmart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class Product 
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int productId ;
	
	private String productName;
	private String productDesc;
	private String productCategory;
	private float price;
	
	@Transient
	MultipartFile pimage;
	public MultipartFile getPimage() {
		return pimage;
	}
	public void setPimage(MultipartFile pimage) {
		this.pimage = pimage;
	}
	public Product() {
		super();
		
	}
	public Product(int productId, String productName, String productDesc, String productCategory, float price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDesc = productDesc;
		this.productCategory = productCategory;
		this.price = price;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDesc=" + productDesc
				+ ", productCategory=" + productCategory + ", price=" + price +  "]";
	}
	

}
