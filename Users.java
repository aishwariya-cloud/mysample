package com.readygo.model;

public class Users {
	private int userId;
	private String userfName;
	private String userlName;
	private int contact;
	private String email;
	private String address;
	private String city;
	private String password;
	private String role;
	private static int count=0;
	
	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", userfName=" + userfName + ", userlName=" + userlName + ", contact="
				+ contact + ", email=" + email + ", address=" + address + ", city=" + city + ", password=" + password
				+ ", role=" + role + ", getUserId()=" + getUserId() + ", getFName()=" + getUserLName() + ", getLName()="
				+ getUserFName() + ", getContact()=" + getContact() + ", getEmail()=" + getEmail() + ", getAddress()="
				+ getAddress() + ", getCity()=" + getCity() + ", getPassword()=" + getPassword() + ", isRole()="
				+ isRole() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public Users() {
		count++;
	}
	public String getUserFName() {
		return userfName;
	}
	public void setUserFName(String userfName) {
		this.userfName = userfName;
	}
	public String getUserLName() {
		return userlName;
	}
	public void setUserLName(String userlName) {
		this.userlName = userlName;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Users.count = count;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public long getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String isRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

}

