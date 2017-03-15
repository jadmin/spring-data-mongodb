package com.javaclub.opensource.spring3.demos.config;

import java.util.Set;

public interface AccountRepository {

	Account findById(String acctId);

	void update(Account account);

	void add(Account account);

	Set<Account> findAll();

}
