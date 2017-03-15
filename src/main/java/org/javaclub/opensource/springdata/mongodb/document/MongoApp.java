/*
 * @(#)MongoApp.java	2011-6-14
 *
 * Copyright (c) 2011. All Rights Reserved.
 *
 */

package org.javaclub.opensource.springdata.mongodb.document;

import static org.springframework.data.document.mongodb.query.Criteria.where;
import static org.springframework.data.document.mongodb.query.Query.query;
import static org.springframework.data.document.mongodb.query.Update.update;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.document.mongodb.MongoOperations;
import org.springframework.data.document.mongodb.MongoTemplate;
import org.springframework.data.document.mongodb.SimpleMongoDbFactory;

import com.mongodb.Mongo;

/**
 * desc
 * 
 * @author <a href="mailto:gerald.chen.hz@gmail.com">Gerald Chen</a>
 * @version $Id: MongoApp.java 48 2011-06-14 09:17:45Z gerald.chen.hz@gmail.com $
 */
public class MongoApp {

	protected static final Log LOG = LogFactory.getLog(MongoApp.class);

	public static void main(String[] args) throws Exception {
		MongoOperations mongoOps = new MongoTemplate(new SimpleMongoDbFactory(
				new Mongo("192.168.35.101", 27017), "test_db"));

		Person p = new Person("Joe", 34);

		// Insert is used to initially store the object into the database.
		mongoOps.insert(p);
		LOG.info("Insert: " + p);

		// Find
		p = mongoOps.findById(p.getId(), Person.class);
		LOG.info("Found: " + p);

		// Update
		mongoOps.updateFirst(query(where("name").is("Joe")), update("age", 35),
				Person.class);
		p = mongoOps.findOne(query(where("name").is("Joe")), Person.class);
		LOG.info("Updated: " + p);

		// Delete
		mongoOps.remove(p);

		// Check that deletion worked
		List<Person> people = mongoOps.findAll(Person.class);
		LOG.info("Number of people = : " + people.size());

		mongoOps.dropCollection(Person.class);
	}
}
