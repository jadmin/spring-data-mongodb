/*
 * @(#)AppConfig.java	2011-6-14
 *
 * Copyright (c) 2011. All Rights Reserved.
 *
 */

package org.javaclub.opensource.springdata.mongodb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.document.mongodb.MongoTemplate;

import com.mongodb.Mongo;

/**
 * desc
 * 
 * @author <a href="mailto:gerald.chen.hz@gmail.com">Gerald Chen</a>
 * @version $Id: AppConfig.java 48 2011-06-14 09:17:45Z gerald.chen.hz@gmail.com $
 */
@Configuration
public class AppConfig {

	public @Bean Mongo mongo() throws Exception {
		return new Mongo("localhost");
	}

	public @Bean MongoTemplate mongoTemplate() throws Exception {
		return new MongoTemplate(mongo(), "mydatabase");
	}
}
