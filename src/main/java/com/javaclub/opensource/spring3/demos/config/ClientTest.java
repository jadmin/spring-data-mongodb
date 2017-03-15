/*
 * @(#)ClientTest.java	2011-6-14
 *
 * Copyright (c) 2011. All Rights Reserved.
 *
 */

package com.javaclub.opensource.spring3.demos.config;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * desc
 *
 * @author <a href="mailto:gerald.chen.hz@gmail.com">Gerald Chen</a>
 * @version $Id: ClientTest.java 51 2011-06-15 03:14:34Z gerald.chen.hz@gmail.com $
 */
public class ClientTest {

	@Test
	public void transfer100Dollars() {
		// create the spring container using the AppConfig @Configuration class
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		// retrieve the beans we'll use during testing
		AccountRepository accountRepository = ctx.getBean(AccountRepository.class);
		TransferService transferService = ctx.getBean(TransferService.class);

		// create accounts to test against
		accountRepository.add(new Account("A123", 1000.00));
		accountRepository.add(new Account("C456", 0.00));

		// check account balances before transfer
		assertThat(accountRepository.findById("A123").getBalance(), equalTo(1000.00));
		assertThat(accountRepository.findById("C456").getBalance(), equalTo(0.00));

		// perform transfer
		transferService.transfer(100.00, "A123", "C456");

		// check account balances after transfer
		assertThat(accountRepository.findById("A123").getBalance(), equalTo(900.00));
		assertThat(accountRepository.findById("C456").getBalance(), equalTo(100.00));
	}
}
