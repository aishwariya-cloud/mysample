package com.readygo.main;

import java.util.ArrayList;
import java.util.Scanner;
import com.readygo.model.Users;
import com.readygo.services.UserDetailsImpl;

public class UserDetailDemo {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		UserDetailsImpl im = new UserDetailsImpl();
		ArrayList<Users> list =new ArrayList<Users>();
		
		while(true)
		{
		System.out.println(" 1.Add User "+" 2.Display User "+" 3.Login "+" 4.Exit ");
		String choice=sc.next();
		switch(choice)
		{
		case "1":
			System.out.println("Enter user's first name:");
		    String userFName = sc.next();
		   
		    System.out.println("Enter user's second name:");
		    String userLName = sc.next();
		    System.out.println("Enter contact number:");
		    int contact = sc.nextInt();
		    System.out.println("Enter email id:");
		    String email = sc.next();
		    System.out.println("Enter address:");
		    String address = sc.next();
		    System.out.println("Enter city:");
		    String city = sc.next();
		    System.out.println("Enter password:");
		    String password = sc.next();
		    System.out.println("Enter your role:");
		    String role= sc.next();
		    im.addUser(userFName, userLName, contact, email, address, city, password, role);
		    break;
		case "2":
			list=im.display();
			for(Users user1 : list)
			{
		       System.out.println(user1);
			}
			
		case "3":
			System.out.println("Enter email");
			 String email1 = sc.next();
			 System.out.println("Enter password:");
			 String psw = sc.next();
			im.login(email1, psw); 
			break;
		case "4":
			System.exit(0);
		}
	}
}
	
}
