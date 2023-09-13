package com.ofss.domain;

public class Current extends Account {
	private double overdraftBalance;

	public Current() {
		System.out.println("Default constructor of Current");
	}

	public Current(int accountNumber, String name, double balance, double overdraftBalance) {
		super(accountNumber, name, overdraftBalance);
		this.overdraftBalance = overdraftBalance;
		System.out.println("Overloaded constructor of Current");
	}

	@Override
	public boolean withdraw(double amount) {
		return false;
	}

	@Override
	public boolean deposit(double amount) {
		return false;
	}

	public double getOverdraftBalance() {
		return overdraftBalance;
	}

	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}

}
