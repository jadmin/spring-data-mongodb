/*
 * @(#)ClientTest.java	2011-6-15
 *
 * Copyright (c) 2011. All Rights Reserved.
 *
 */

package com.javaclub.opensource.spring3.demos.task.cron;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * desc
 *
 * @author <a href="mailto:gerald.chen.hz@gmail.com">Gerald Chen</a>
 * @version $Id: ClientTest.java 53 2011-06-15 08:38:31Z gerald.chen.hz@gmail.com $
 */
public class ClientTest {

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("config.xml", ClientTest.class);
	}

}
