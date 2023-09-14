package com.ofss.main;

import java.util.Scanner;

public class HelloWorldMain {
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Ofss Java Training");

		int num1 = 10, num2 = 20;
		System.out.println("Addition of " + num1 + " and  " + num2 + " is " + (num1 + num2));

		System.out.println("Accepting values");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number 1");
		num1 = scanner.nextInt();
		System.out.println("Enter number 2");
		num2 = scanner.nextInt();
		System.out.println("Addition of " + num1 + " and  " + num2 + " is " + (num1 + num2));
	}
}
