package com.ofss.main.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "login_details")
public class LoginDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "login_id")
	private int loginId;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "password")
	private String password;

	@Column(name = "number_of_attempts", columnDefinition = "varchar(10) default 'active' ")
	private int numberOfAttempts;

	@Column(name = "status_of_user")
	private String statusOfUser;

	public LoginDetails() {
		// TODO Auto-generated constructor stub
	}

	public LoginDetails(int loginId, String userName, String password, int numberOfAttempts, String statusOfUser) {
		super();
		this.loginId = loginId;
		this.userName = userName;
		this.password = password;
		this.numberOfAttempts = numberOfAttempts;
		this.statusOfUser = statusOfUser;
	}

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getNumberOfAttempts() {
		return numberOfAttempts;
	}

	public void setNumberOfAttempts(int numberOfAttempts) {
		this.numberOfAttempts = numberOfAttempts;
	}

	public String getStatusOfUser() {
		return statusOfUser;
	}

	public void setStatusOfUser(String statusOfUser) {
		this.statusOfUser = statusOfUser;
	}

	@Override
	public String toString() {
		return "LoginDetails [loginId=" + loginId + ", userName=" + userName + ", password=" + password
				+ ", numberOfAttempts=" + numberOfAttempts + ", statusOfUser=" + statusOfUser + "]";
	}

}
