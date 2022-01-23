package com.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.demo.model.Account;
import com.demo.model.Role;
import com.demo.repository.AccountRepository;

@Service
public class AccountIMP implements AccountSV {

	@Autowired
	private AccountRepository accountRepository;
	@Override
	public Account save(Account account) {
		// TODO Auto-generated method stub
		return accountRepository.save(account);
	}
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Account account = accountRepository.findByUsername(username);
		if(account == null) {
			throw new UsernameNotFoundException("Username not found ");
		}else {
			List<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
			for(Role role : account.getRoles()) {
				grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
			}
			return new User(account.getUsername(), account.getPassword(), grantedAuthorities);
		}
		
	}
	@Override
	public Account findUser(String user) {
		// TODO Auto-generated method stub
		return accountRepository.findByUsername(user);
	}
	@Override
	public Account find(int id) {
		// TODO Auto-generated method stub
		return accountRepository.findById(id).get();
	}
	
	
	
}
