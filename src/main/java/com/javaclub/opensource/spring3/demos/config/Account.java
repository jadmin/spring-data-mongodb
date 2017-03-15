/*
 * @(#)Account.java	2011-6-14
 *
 * Copyright (c) 2011. All Rights Reserved.
 *
 */

package com.javaclub.opensource.spring3.demos.config;

import java.io.Serializable;

/**
 * desc
 * 
 * @author <a href="mailto:gerald.chen.hz@gmail.com">Gerald Chen</a>
 * @version $Id: Account.java 51 2011-06-15 03:14:34Z gerald.chen.hz@gmail.com $
 */
public class Account implements Serializable {

	/** desc */
	private static final long serialVersionUID = 4734761862317341652L;

	private final String id;
	private double balance;

	public Account(String id, double initialBalance) {
		this.id = id;
		this.balance = initialBalance;
	}

	public String getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public void debit(double amount) {
		balance -= amount;
	}

	public void credit(double amount) {
		balance += amount;
	}

	public static Account copy(Account src) {
		return new Account(src.getId(), src.getBalance());
	}

	@Override
	public String toString() {
		return String.format("Account: id=%s, balance=%.2f", getId(), getBalance());
	}

}
