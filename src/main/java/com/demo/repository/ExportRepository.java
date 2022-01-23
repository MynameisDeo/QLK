package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.model.Account;
import com.demo.model.Category;
import com.demo.model.ExportInvoice;
import com.demo.model.Product;



@Repository
public interface ExportRepository extends CrudRepository<ExportInvoice, Integer> {
	
	//select id from export_invoice order by id desc limit 1;
	
	@Query(value = "select id from export_invoice order by id desc limit :n", nativeQuery = true)
	public int limit(@Param("n") int n);
	
	

}
