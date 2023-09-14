package com.ofss.util;

public class StaticUtil {
	private static int num1 = 10;
	private static int num2 = 10;

	public StaticUtil() {
		System.out.println("Default constructor of StaticUtil");
	}

	static {
		System.out.println("Static block");
	}

	{
		System.out.println("Non static block");
	}

	public static void display() {
		System.out.println("non static num1=" + num1);
		System.out.println("static num2=" + num2);
		num1++;
		num2++;
		System.out.println("non static num1=" + num1);
		System.out.println("static num2=" + num2);
	}
}
