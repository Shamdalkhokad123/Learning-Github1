package com.gmart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserDetails 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int custId;
	private String username;
	private String fullName;
	private Long mobileNo;
	private String email;
	private String passWord;
	private String address;
	public UserDetails() {
		super();
	}
	public UserDetails( int custId,String username, String fullName, Long mobileNo, String email, String passWord,
			String address) {
		super();
		this.custId = custId;
		this.username = username;
		this.fullName = fullName;
		this.mobileNo = mobileNo;
		this.email = email;
		this.passWord = passWord;
		this.address = address;
	}
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Register [ username=" + username + ", fullName=" + fullName + ", mobileNo="
				+ mobileNo + ", Email=" + email + ", passWord=" + passWord + ", address=" + address + "]";
	}
	

}
