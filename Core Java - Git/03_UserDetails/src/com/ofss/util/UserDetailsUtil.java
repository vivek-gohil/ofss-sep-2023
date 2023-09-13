package com.ofss.util;

public class UserDetailsUtil {
	private String userName;
	private String address;
	private String gender;

	public void accept(String userName, String addres, String gender) {
		this.userName = userName;
		this.address = addres;
		this.gender = gender;
	}
	
	public void display() {
		System.out.println("User Name ="+ userName);
		System.out.println("Address ="+ address);
		System.out.println("Gender ="+ gender);
	}
}
