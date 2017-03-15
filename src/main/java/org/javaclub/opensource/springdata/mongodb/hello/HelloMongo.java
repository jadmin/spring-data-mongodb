/*
 * @(#)HelloMongo.java	2011-6-14
 *
 * Copyright (c) 2011. All Rights Reserved.
 *
 */

package org.javaclub.opensource.springdata.mongodb.hello;

import java.util.List;

import org.javaclub.opensource.springdata.mongodb.hello.domain.Account;
import org.javaclub.opensource.springdata.mongodb.hello.domain.Person;
import org.springframework.data.document.mongodb.MongoTemplate;

/**
 * desc
 *
 * @author <a href="mailto:gerald.chen.hz@gmail.com">Gerald Chen</a>
 * @version $Id: HelloMongo.java 48 2011-06-14 09:17:45Z gerald.chen.hz@gmail.com $
 */
public class HelloMongo {
	
	MongoTemplate mongoTemplate;

	public void run() {
		
		if (mongoTemplate.collectionExists(Person.class)) {
			mongoTemplate.dropCollection(Person.class);
		}
		
		mongoTemplate.createCollection(Person.class);

		Person p = new Person("John", 39);
		Account a = new Account("1234-59873-893-1", Account.Type.SAVINGS, 123.45D);
		p.getAccounts().add(a);
		
		mongoTemplate.insert(p);
		
		List<Person> results = mongoTemplate.findAll(Person.class);
		System.out.println("Results: " + results);
	}

	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

}
