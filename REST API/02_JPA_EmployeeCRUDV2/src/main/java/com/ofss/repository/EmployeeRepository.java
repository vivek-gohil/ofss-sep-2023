package com.ofss.repository;

import java.util.List;

import com.ofss.domain.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class EmployeeRepository {
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	private EntityTransaction entityTransaction;

	public EmployeeRepository() {
		entityManagerFactory = Persistence.createEntityManagerFactory("CONNECTION_TEST");
	}

	public List<Employee> getAllEmployees() {
		entityManager = entityManagerFactory.createEntityManager();
		String SQL = "SELECT e FROM Employee e"; // Use class name not table name in SQL
		Query query = entityManager.createQuery(SQL);
		List<Employee> allEmployees = query.getResultList();
		return allEmployees;
	}

	public boolean deleteEmployee(int employeeId) {
		entityManager = entityManagerFactory.createEntityManager();
		Employee employee = entityManager.find(Employee.class, employeeId);
		if (employee != null) {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();
			entityManager.close();
			return true;
		} else {
			System.out.println("Invalid employeeId");
			return false;
		}

	}

	public Employee getSingleEmployee(int employeeId) {
		entityManager = entityManagerFactory.createEntityManager();
		Employee employee = entityManager.find(Employee.class, employeeId);
		return employee;
	}

	public boolean updateEmployeeSalary(int employeeId, double newSalary) {
		entityManager = entityManagerFactory.createEntityManager();
		Employee employee = entityManager.find(Employee.class, employeeId);
		if (employee != null) {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			employee.setSalary(newSalary);
			entityTransaction.commit();
			entityManager.close();
			return true;
		} else {
			System.out.println("Invalid employeeId");
			return false;
		}

	}

	public boolean updateEmployeeName(int employeeId, String newName) {
		entityManager = entityManagerFactory.createEntityManager();
		Employee employee = entityManager.find(Employee.class, employeeId);
		if (employee != null) {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			employee.setName(newName);
			entityTransaction.commit();
			entityManager.close();
			return true;
		} else {
			System.out.println("Invalid employeeId");
			return false;
		}

	}

	public boolean addNewEmployee(Employee employee) {
		try {
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(employee);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			entityManager.close();
		}
	}

}
