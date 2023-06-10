package com.gmart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ContcatDetail 
{
	@Id
	@GeneratedValue
	private int custId;
	private String custName;
	private String custEmail;
	private String custMessage;
	public ContcatDetail() {
		super();
		
	}
	public ContcatDetail(int custId, String custName, String custEmail, String custMessage) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custEmail = custEmail;
		this.custMessage = custMessage;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public String getCustMessage() {
		return custMessage;
	}
	public void setCustMessage(String custMessage) {
		this.custMessage = custMessage;
	}
	
	

}
