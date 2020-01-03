package com.readygo.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.readygo.model.Users;

public class UserDetailsDAO {
	public static Connection connectToDB()
	{
		Connection connection=null;
		try {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
			return connection;
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			
				try {
					connection.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				return null;
		}
		
		
	}


public static void addUser(Users user) {
	System.out.println(user);
	try{
		Connection con = connectToDB();
	
	PreparedStatement stmt = con.prepareStatement("insert into UserDetails values(?,?,?,?,?,?,?,?,?)");
	stmt.setInt(1, Users.getCount());
	stmt.setString(2, user.getUserFName());
	stmt.setString(3, user.getUserLName());
	stmt.setInt(4, (int) user.getContact());
	stmt.setString(5, user.getEmail());
	stmt.setString(6, user.getAddress());
	stmt.setString(7, user.getCity());
	stmt.setString(8, user.getPassword());
	stmt.setString(9, user.isRole());
	int affectedRows = stmt.executeUpdate() ;
	System.out.println("Affected rows:"+affectedRows);
	con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
public static ArrayList<Users> display()
{
	ArrayList<Users> list = new ArrayList<Users>();
	try
	{
		Connection con = connectToDB();
		PreparedStatement stmt = con.prepareStatement("select * from userDetails");
		ResultSet rs = stmt.executeQuery();
		while(rs.next())
		{
			Users user = new Users();
			user.setUserId(rs.getInt(1));
			user.setUserFName(rs.getString(2));
			user.setUserLName(rs.getString(3));
			user.setContact(rs.getInt(4));
			user.setEmail(rs.getString(5));
			user.setAddress(rs.getString(6));
			user.setCity(rs.getString(7));
			user.setPassword(rs.getString(8));
			user.setRole(rs.getString(9));
			list.add(user);
			
						
			
		}
		con.close();
	}
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return list;
}


}
