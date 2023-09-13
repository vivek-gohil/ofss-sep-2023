package com.ofss.main;

import java.util.Scanner;

import com.ofss.util.UserDetailsUtil;

public class UserDetailsMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter username");
		String userName = scanner.next();
		System.out.println("Enter address");
		String address = scanner.next();
		System.out.println("Enter gender");
		String gender = scanner.next();
		
		UserDetailsUtil userDetailsUtil = new UserDetailsUtil();
		userDetailsUtil.accept(userName, address, gender);
		userDetailsUtil.display();
	}
}
