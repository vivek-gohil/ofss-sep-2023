package com.ofss.main;

import com.ofss.domain.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		// Create 3 employee objects by calling param constructor
		Employee employee1 = new Employee(101, "Himaja", 1000);
		Employee employee2 = new Employee(102, "Rohan", 1000);
		Employee employee3 = new Employee(101, "Himaja", 1000);

		System.out.println(employee1.toString());
		System.out.println(employee2.toString());
		System.out.println(employee3.toString());

		System.out.println();
		System.out.println(employee1.equals(employee2)); // false

		System.out.println();
		System.out.println(employee1.equals(employee3));
		// false - compare the object not values
		// insted it should compare the values , override equals method in Employee
		// class
		// true - compare the values not not object
		System.out.println("employee1=" + employee1.hashCode());
		System.out.println("employee3=" + employee3.hashCode());
	}
}
