package com.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Role;
import com.demo.repository.RoleRepository;
@Service
public class RoleIMP implements RoleSV {
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public Iterable<Role> findAll() {
		// TODO Auto-generated method stub
		return roleRepository.findAll();
	}

	@Override
	public Role find(int id) {
		// TODO Auto-generated method stub
		return roleRepository.findById(id).get();
	}

	@Override
	public Role findRole(String name) {
		// TODO Auto-generated method stub
		return roleRepository.findByRole(name);
	}

}
