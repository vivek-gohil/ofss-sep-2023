package com.ofss.domain;

public class Employee {
	private int employeeId;
	private String name;
	private double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String name, double salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {
		Employee employee = (Employee) obj;
		if (this.employeeId == employee.employeeId && this.name.equals(employee.name)
				&& this.salary == employee.salary) {
			return true;
		} else
			return false;
	}

	@Override
	public String toString() {
		return "EmployeeId=" + employeeId + " Name=" + name + " Salary=" + salary;
	}

}
