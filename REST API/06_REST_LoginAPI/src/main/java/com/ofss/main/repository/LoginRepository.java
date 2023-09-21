package com.ofss.main.repository;

import java.util.List;

import com.ofss.main.domain.Employee;
import com.ofss.main.domain.LoginDetails;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class LoginRepository {

	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	private EntityTransaction entityTransaction;

	public LoginRepository() {
		entityManagerFactory = Persistence.createEntityManagerFactory("CONNECTION_TEST");
		System.out.println("Database connected successfully!"); // TODO Auto-generated constructor stub
	}

	public List<LoginDetails> getAllLoginDetails() {
		String sql = "SELECT l FROM LoginDetails l";
		entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery(sql);
		List<LoginDetails> allLoginDetails = query.getResultList();
		return allLoginDetails;
	}

	public boolean validateUser(LoginDetails loginDetails) {
		boolean valid = false;
		entityManager = entityManagerFactory.createEntityManager();
		LoginDetails loginDetailsDB = entityManager.find(LoginDetails.class, loginDetails.getLoginId());
		try {
			if (loginDetailsDB != null && loginDetailsDB.getPassword().equals(loginDetails.getPassword())) {
				valid = true;
			} else {
				valid = false;
			}
		} catch (Exception e) {
			valid = false;
		} finally {
			entityManager.close();
		}

		if (valid) {
			reset(loginDetailsDB.getLoginId());
			return true;
		} else {
			increaseCount(loginDetails.getLoginId());
			return false;
		}
	}

	public boolean reset(int loginId) {
		entityManager = entityManagerFactory.createEntityManager();
		LoginDetails loginDetailsDB = entityManager.find(LoginDetails.class, loginId);
		try {
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			loginDetailsDB.setNumberOfAttempts(0);
			loginDetailsDB.setStatusOfUser("active");
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

	public void increaseCount(int loginId) {
		entityManager = entityManagerFactory.createEntityManager();
		LoginDetails loginDetailsDB = entityManager.find(LoginDetails.class, loginId);
		try {
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			loginDetailsDB.setNumberOfAttempts(loginDetailsDB.getNumberOfAttempts() + 1);
			if (loginDetailsDB.getNumberOfAttempts() >= 3)
				loginDetailsDB.setStatusOfUser(null);
			entityTransaction.commit();
		} catch (Exception e) {
			System.out.println("Exception!!");
			System.out.println(e.getMessage());
		} finally {
			entityManager.close();
		}
	}

	public boolean addNewUser(LoginDetails loginDetails) {
		try {
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			if(loginDetails.getStatusOfUser() == null) {
				loginDetails.setStatusOfUser("active");
			}
			entityManager.persist(loginDetails);
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
