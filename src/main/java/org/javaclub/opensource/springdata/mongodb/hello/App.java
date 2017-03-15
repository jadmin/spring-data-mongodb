/*
 * @(#)App.java	2011-6-13
 *
 * Copyright (c) 2011. All Rights Reserved.
 *
 */

package org.javaclub.opensource.springdata.mongodb.hello;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello Mongo!
 * 
 * @author <a href="mailto:gerald.chen.hz@gmail.com">Gerald Chen</a>
 * @version $Id: App.java 48 2011-06-14 09:17:45Z gerald.chen.hz@gmail.com $
 */
public class App {
	
	/**
	 * 测试使用注解的方式
	 *
	 */
	@Test
	public void testAnnotation() {
		System.out.println("Bootstrapping HelloMongo");

		ConfigurableApplicationContext context = null;
		// use @Configuration using Java:
		context = new ClassPathXmlApplicationContext("META-INF/spring/bootstrap.xml");

		HelloMongo hello = context.getBean(HelloMongo.class);
		hello.run();

		System.out.println("DONE!");
	}
	
	/**
	 * 测试使用XML配置的方式
	 *
	 */
	@Test
	public void testXmlContext() {
		System.out.println("Bootstrapping HelloMongo");

		ApplicationContext context = null;

		// use XML application context:
		context = new ClassPathXmlApplicationContext("META-INF/spring/applicationContext.xml");

		HelloMongo hello = context.getBean(HelloMongo.class);
		hello.run();

		System.out.println("DONE!");
	}
	
	public static void main(String[] args) {
		System.out.println("Bootstrapping HelloMongo");

		// use @Configuration using Java:
//		ConfigurableApplicationContext context = null;
//		context = new ClassPathXmlApplicationContext("META-INF/spring/bootstrap.xml");
//		HelloMongoAnnotation hello = context.getBean(HelloMongoAnnotation.class);
//		hello.run();

		// use XML application context:
		ApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("META-INF/spring/applicationContext.xml");
		HelloMongo hello = context.getBean(HelloMongo.class);
		hello.run();

		System.out.println("DONE!");
	}

}
