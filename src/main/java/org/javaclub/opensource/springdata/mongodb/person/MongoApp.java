/*
 * @(#)MongoApp.java	2011-6-14
 *
 * Copyright (c) 2011. All Rights Reserved.
 *
 */

package org.javaclub.opensource.springdata.mongodb.person;

import static org.springframework.data.document.mongodb.query.Criteria.where;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.document.mongodb.MongoOperations;
import org.springframework.data.document.mongodb.MongoTemplate;
import org.springframework.data.document.mongodb.query.Query;

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

		MongoOperations mongoOps = new MongoTemplate(new Mongo("192.168.35.101", 27017), "test_db");

		mongoOps.insert(new Person("Joe", 34));

		LOG.info(mongoOps.findOne(new Query(where("name").is("Joe")), Person.class));

		mongoOps.dropCollection("person");
	}

}
