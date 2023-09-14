package com.ofss.main;

import com.ofss.domain.Demo;

public class DemoMainV2 {
	public static void main(String[] args) {
		System.out.println("main start");
		Demo d = new Demo("Hi");
		Demo d2 = new Demo("Hi");

		System.out.println(d == d2);
		System.out.println(d.equals(d2));

		System.out.println();

		String s = new String("Hi");
		String s2 = new String("Hi");

		System.out.println(s == s2);
		System.out.println(s.equals(s2));

		System.out.println("main end");
	}
}
