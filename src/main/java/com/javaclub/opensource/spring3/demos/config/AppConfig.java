package com.javaclub.opensource.spring3.demos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	public @Bean TransferService transferService() {
		return new TransferServiceImpl(accountRepository());
	}

	public @Bean AccountRepository accountRepository() {
		return new InMemoryAccountRepository();
	}

}
