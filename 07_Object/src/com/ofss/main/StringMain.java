package com.ofss.main;

import com.ofss.domain.Employee;

public class StringMain {
	public static void main(String[] args) {
		String s1 = new String("Hi"); // new object
		String s2 = new String("Hi"); // existing object - String is immutable

		System.out.println(s1.equals(s2));// True
		System.out.println("s1=" + s1.hashCode());
		System.out.println("s2=" + s2.hashCode());

		System.out.println("-------------------");
		Employee employee1 = new Employee(101, "Himaja", 1000);
		Employee employee2 = new Employee(101, "Himaja", 1000);
		System.out.println(employee1.equals(employee2));// True

		System.out.println("employee1=" + employee1.hashCode());
		System.out.println("employee2=" + employee2.hashCode());

	}
}
