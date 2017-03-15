/*
 * @(#)Account.java	2011-6-14
 *
 * Copyright (c) 2011. All Rights Reserved.
 *
 */

package org.javaclub.opensource.springdata.mongodb.hello.domain;

/**
 * desc
 * 
 * @author <a href="mailto:gerald.chen.hz@gmail.com">Gerald Chen</a>
 * @version $Id: Account.java 48 2011-06-14 09:17:45Z gerald.chen.hz@gmail.com $
 */
public class Account {

	public enum Type {
		SAVINGS, CHECKING
	}

	private String id;

	private String accountNumber;

	private Account.Type accountType;

	private Double balance;

	public Account() {
	}

	public Account(String accountNumber, Type accountType, Double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Account.Type getAccountType() {
		return accountType;
	}

	public void setAccountType(Account.Type accountType) {
		this.accountType = accountType;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", accountNumber=" + accountNumber
				+ ", accountType=" + accountType + ", balance=" + balance + "]";
	}

}
