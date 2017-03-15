/*
 * @(#)XmlDemo.java	2011-6-15
 *
 * Copyright (c) 2011. All Rights Reserved.
 *
 */

package com.javaclub.opensource.spring3.demos.task.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * desc
 *
 * @author <a href="mailto:gerald.chen.hz@gmail.com">Gerald Chen</a>
 * @version $Id: XmlDemo.java 52 2011-06-15 05:38:15Z gerald.chen.hz@gmail.com $
 */
public class XmlDemo {

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("config.xml", XmlDemo.class);
	}
}
