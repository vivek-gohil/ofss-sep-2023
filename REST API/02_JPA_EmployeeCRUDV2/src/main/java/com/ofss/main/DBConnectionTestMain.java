package com.ofss.main;

import java.util.List;

import com.ofss.domain.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class DBConnectionTestMain {
	public static void main(String[] args) {
		System.out.println("main start");
		System.out.println("EmployeeCRUD Project");
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("CONNECTION_TEST");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		System.out.println("Database connected successfully");

//		Employee employee = new Employee(0, "Test 2", 1000);
//
//		EntityTransaction entityTransaction = entityManager.getTransaction();
//		entityTransaction.begin(); // starting new transaction
//
//		entityManager.persist(employee); // insert
//
//		entityTransaction.commit(); // Committing rows into database
//		
//		System.out.println("New Employee Added Successfully!");

//		int employeeId = 1;
//		Employee employee = entityManager.find(Employee.class, employeeId);
//		if (employee != null) {
//			System.out.println(employee);
//		} else {
//			System.out.println("Invalid employeeId");
//		}

		System.out.println("All Employees");
		String SQL = "SELECT e FROM Employee e"; // Use class name not table name in SQL
		Query query = entityManager.createQuery(SQL);
		List<Employee> allEmployees = query.getResultList();

		for (Employee e : allEmployees) {
			System.out.println(e);
		}

		System.out.println();
		System.out.println();

//		System.out.println("Search and Update employee");
//		int employeeId = 1;
//		Employee employee = entityManager.find(Employee.class, employeeId);
//		if (employee != null) {
//			System.out.println("Employee Found");
//			System.out.println(employee);
//			System.out.println("Updating name and salary");
//			EntityTransaction entityTransaction = entityManager.getTransaction();
//			entityTransaction.begin();
//			employee.setName("Rohit Reddy");
//			employee.setSalary(50000);
//			entityTransaction.commit();
//			System.out.println("Details updated successfully");
//
//		} else {
//			System.out.println("Invalid employeeId");
//		}

		System.out.println("Deleting employee = 1");
		int employeeId = 1;
		Employee employee = entityManager.find(Employee.class, employeeId);
		if (employee != null) {
			System.out.println("Employee Found");
			System.out.println(employee);
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();

			System.out.println("Details deleted successfully");

		} else {
			System.out.println("Invalid employeeId");
		}

		System.out.println();
		System.out.println();

		System.out.println("All Employees");
		SQL = "SELECT e FROM Employee e"; // Use class name not table name in SQL
		query = entityManager.createQuery(SQL);
		allEmployees = query.getResultList();

		for (Employee e : allEmployees) {
			System.out.println(e);
		}

		entityManager.close();
		entityManagerFactory.close();
//		
		System.out.println("main end");
	}
}
