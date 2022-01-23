package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.model.Category;



@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {
	
	@Query("from Category where name = :name")
	public List<Category> findByName(@Param("name") String name);
	
	

}
