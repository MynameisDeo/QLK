package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.model.Category;
import com.demo.model.Customer;
import com.demo.model.ExportInvoice;



@Repository
public interface CusRepository extends CrudRepository<Customer, Integer> {
	
	
	
	

}
