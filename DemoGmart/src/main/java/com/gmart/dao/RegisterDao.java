package com.gmart.dao;

import com.gmart.model.UserDetails;


public interface RegisterDao 
{
	public boolean registerUser(UserDetails user);
	public boolean updateUser(UserDetails user);
	
	public UserDetails getUser(int custId);
	public boolean loginUser(int custId,String passWord);
	

}
