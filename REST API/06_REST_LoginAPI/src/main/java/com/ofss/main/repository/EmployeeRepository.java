package com.ofss.main.repository;

import java.util.List;

import com.ofss.main.domain.Employee;
import com.ofss.main.domain.LoginDetails;

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
		System.out.println("Database connected successfully!");
	}
	

	public boolean deleteEmployee(int employeeId) {
		entityManager = entityManagerFactory.createEntityManager();
		Employee employeeFromDB = entityManager.find(Employee.class, employeeId);
		try {
			if (employeeFromDB != null) {
				entityTransaction = entityManager.getTransaction();
				entityTransaction.begin();
				entityManager.remove(employeeFromDB);
				entityTransaction.commit();
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			System.out.println("Exception!!");
			System.out.println(e.getMessage());
			return false;
		} finally {
			entityManager.close();
		}
	}

	public boolean updateEmployee(Employee employee) {
		entityManager = entityManagerFactory.createEntityManager();
		Employee employeeFromDB = entityManager.find(Employee.class, employee.getEmployeeId());
		try {
			if (employeeFromDB != null) {
				entityTransaction = entityManager.getTransaction();
				entityTransaction.begin();
				employeeFromDB.setName(employee.getName());
				employeeFromDB.setSalary(employee.getSalary());
				entityTransaction.commit();
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			System.out.println("Exception!!");
			System.out.println(e.getMessage());
			return false;
		} finally {
			entityManager.close();
		}
	}

	public Employee getOneEmployee(int employeeId) {
		entityManager = entityManagerFactory.createEntityManager();
		Employee employee = entityManager.find(Employee.class, employeeId);
		return employee;
	}

	public List<Employee> selectAllEmployees() {
		String sql = "SELECT e FROM Employee e";
		entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery(sql);
		List<Employee> allEmployees = query.getResultList();
		return allEmployees;
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
			System.out.println("Exception!!");
			System.out.println(e.getMessage());
			return false;
		} finally {
			entityManager.close();
		}
	}

}
