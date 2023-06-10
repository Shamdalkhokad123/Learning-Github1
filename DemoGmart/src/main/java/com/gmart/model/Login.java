package com.gmart.model;

public class Login 
{
	private String loginId;
	private String passWord;
	public Login() {
		super();

	}
	public Login(String loginId, String passWord) {
		super();
		this.loginId = loginId;
		this.passWord = passWord;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	@Override
	public String toString() {
		return "Login [loginId=" + loginId + ", passWord=" + passWord + "]";
	}
	
	
    

}
