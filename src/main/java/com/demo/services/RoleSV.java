package com.demo.services;


import com.demo.model.Role;

public interface RoleSV {
	
	public Iterable<Role> findAll();
	
	public Role find(int id);
	
	public Role findRole(String name);

}
