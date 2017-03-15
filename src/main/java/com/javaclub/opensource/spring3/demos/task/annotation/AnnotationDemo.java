package com.javaclub.opensource.spring3.demos.task.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("config.xml", AnnotationDemo.class);
	}

}
