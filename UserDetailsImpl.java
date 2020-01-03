package com.readygo.services;

import java.util.ArrayList;

import com.readygo.DAO.UserDetailsDAO;
import com.readygo.model.Users;

public class UserDetailsImpl implements UserDetailsInterface {

	public void addUser(String userFName,String userLName,int contact,String email,String address,String city,String password,String role ) {
		// TODO Auto-generated method stub
		Users user = new Users();
		user.setUserId(Users.getCount());
		user.setUserFName(userFName);
		user.setUserLName(userLName);
		user.setContact(contact);
		user.setEmail(email);
		user.setAddress(address);
		user.setCity(city);
		user.setPassword(password);
		user.setRole(role);
		UserDetailsDAO.addUser(user);
		}

	@Override
	public ArrayList<Users> display() {
		// TODO Auto-generated method stub
		return null;
		
	}

	@Override
	public void login(String email1,String psw) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
