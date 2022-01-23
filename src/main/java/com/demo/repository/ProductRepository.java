package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.model.Category;
import com.demo.model.Product;



@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
	
	@Query(value = "SELECT quantity FROM product WHERE id = :id",nativeQuery = true)
	public int quantity(@Param("id") int id);
	
	

}
