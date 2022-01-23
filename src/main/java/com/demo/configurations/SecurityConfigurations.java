package com.demo.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.demo.services.AccountSV;


@EnableWebSecurity
@Configuration
public class SecurityConfigurations extends WebSecurityConfigurerAdapter {

	@Autowired
	private AccountSV accountSV;
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.cors().and().csrf().disable();
		
		http.authorizeRequests()
		.antMatchers("/home/**").permitAll()	
		.antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")
		.antMatchers("/employee/**").access("hasRole('ROLE_ADMIN') or hasRole('ROLE_EMPLOYEE')")
		.and()
		.formLogin().loginPage("/account/login")
		.loginProcessingUrl("/account/process-login")
		.defaultSuccessUrl("/home")
		.failureUrl("/account/login?error")
		.usernameParameter("username")
		.passwordParameter("password")
		.and()
		.logout().logoutUrl("/account/logout")
		.logoutSuccessUrl("/account/login?logout")
		.and()
		.exceptionHandling().accessDeniedPage("/account/accessDenied")
		;
	}
	
	@Bean
	public BCryptPasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder builder) throws Exception {
		builder.userDetailsService(accountSV);
		
	}
	
	
	
	 

}
