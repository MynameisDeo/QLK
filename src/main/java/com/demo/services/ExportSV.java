package com.demo.services;

import org.springframework.data.repository.query.Param;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.demo.model.Account;
import com.demo.model.ExportInvoice;


public interface ExportSV {

	public ExportInvoice save(ExportInvoice exportInvoice);
	
	public int limit(int n);
	
	public ExportInvoice find(int id);

}
