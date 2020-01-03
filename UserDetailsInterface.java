package com.readygo.services;

import java.util.ArrayList;

import com.readygo.model.Users;

public interface UserDetailsInterface {
	public void addUser(String userFName,String userLName,int contact,String email,String address,String city,String password,String role );
	public ArrayList<Users> display();
	public void login(String email,String password);
	

}
