package com.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.demo.model.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {

	@Query("from Role where name = :name")
	public Role findByRole(@Param("name") String name);
}
