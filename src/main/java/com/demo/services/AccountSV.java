package com.demo.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.demo.model.Account;
import com.demo.model.Category;


public interface AccountSV extends UserDetailsService {

	public Account save(Account account);
	
	public Account findUser(String user);
	
	public Account find(int id);
	

}
