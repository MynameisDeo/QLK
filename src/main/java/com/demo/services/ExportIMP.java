package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.demo.model.Category;
import com.demo.model.ExportInvoice;
import com.demo.model.Product;
import com.demo.repository.CategoryRepository;
import com.demo.repository.ExportRepository;
import com.demo.repository.ProductRepository;

@Service
public class ExportIMP implements ExportSV {

	
	@Autowired
	private ExportRepository exportRepository;

	

	@Override
	public ExportInvoice save(ExportInvoice exportInvoice) {
		// TODO Auto-generated method stub
		return exportRepository.save(exportInvoice);
	}



	@Override
	public int limit(int n) {
		// TODO Auto-generated method stub
		return exportRepository.limit(n);
	}



	@Override
	public ExportInvoice find(int id) {
		// TODO Auto-generated method stub
		return exportRepository.findById(id).get();
	}
	
	

}
