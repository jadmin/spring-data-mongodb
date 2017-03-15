/*
 * @(#)Person.java	2011-6-14
 *
 * Copyright (c) 2011. All Rights Reserved.
 *
 */

package org.javaclub.opensource.springdata.mongodb.person;

import java.io.Serializable;

/**
 * desc
 * 
 * @author <a href="mailto:gerald.chen.hz@gmail.com">Gerald Chen</a>
 * @version $Id: Person.java 48 2011-06-14 09:17:45Z gerald.chen.hz@gmail.com $
 */
public class Person implements Serializable {

	/** desc */
	private static final long serialVersionUID = 100277401900431882L;

	private String id;
	private String name;
	private Integer age;
	
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", id=" + id + ", name=" + name + "]";
	}
	
}
