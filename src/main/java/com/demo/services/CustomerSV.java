package com.demo.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.demo.model.Account;
import com.demo.model.Customer;
import com.demo.model.ExportInvoice;


public interface CustomerSV {

	public Customer find(int id);
	
	
	
	

}
