package com.ofss.main;

import java.util.Scanner;

import com.ofss.domain.Employee;

public class EmployeeMainV2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int employeeId;
		String name;
		double salary;

		System.out.println("Enter employeeId");
		employeeId = scanner.nextInt();
		System.out.println("Enter name");
		name = scanner.next();
		System.out.println("Enter salary");
		salary = scanner.nextDouble();

		Employee employee = new Employee(employeeId, name, salary);

		System.out.println("Employee Id : " + employee.getEmployeeId());
		System.out.println("Name : " + employee.getName());
		System.out.println("Salary : " + employee.getSalary());
	}
}
