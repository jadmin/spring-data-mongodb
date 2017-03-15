/*
 * @(#)MongoConfiguration.java	2011-6-14
 *
 * Copyright (c) 2011. All Rights Reserved.
 *
 */

package org.javaclub.opensource.springdata.mongodb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.document.mongodb.MongoDbFactory;
import org.springframework.data.document.mongodb.MongoTemplate;
import org.springframework.data.document.mongodb.SimpleMongoDbFactory;

import com.mongodb.Mongo;

/**
 * desc
 * 
 * @author <a href="mailto:gerald.chen.hz@gmail.com">Gerald Chen</a>
 * @version $Id: MongoConfiguration.java 48 2011-06-14 09:17:45Z gerald.chen.hz@gmail.com $
 */
@Configuration
public class MongoConfiguration {

	public @Bean MongoDbFactory mongoDbFactory() throws Exception {
		return new SimpleMongoDbFactory(new Mongo("192.168.35.101", 27017),
				"test_db");
	}

	/*public @Bean MongoDbFactory mongoDbFactory() throws Exception {
		UserCredentials userCredentials = new UserCredentials("joe", "secret");
		return new SimpleMongoDbFactory(new Mongo("192.168.35.101", 27017), "test_db",
				userCredentials);
	}*/
	
	public @Bean MongoTemplate mongoTemplate() throws Exception {
	    return new MongoTemplate(mongoDbFactory());
	  }
}
