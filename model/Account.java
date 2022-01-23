package com.demo.model;
// Generated Oct 27, 2021, 8:24:59 PM by Hibernate Tools 5.1.10.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

/**
 * Account generated by hbm2java
 */
@Entity
@Table(name = "account", catalog = "accountbank1")
public class Account implements java.io.Serializable {
	
	private Integer id;
	private double balance;
	private String cusname;
	private String email;
	private String phone;
	private Set<Transaction> transactions = new HashSet<Transaction>(0);

	public Account() {
	}

	public Account(double balance, String cusname, String email, String phone) {
		this.balance = balance;
		this.cusname = cusname;
		this.email = email;
		this.phone = phone;
	}

	public Account(double balance, String cusname, String email, String phone, Set<Transaction> transactions) {
		this.balance = balance;
		this.cusname = cusname;
		this.email = email;
		this.phone = phone;
		this.transactions = transactions;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "balance", nullable = false, precision = 22, scale = 0)
	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Column(name = "cusname", nullable = false, length = 250)
	public String getCusname() {
		return this.cusname;
	}

	public void setCusname(String cusname) {
		this.cusname = cusname;
	}

	@Column(name = "email", nullable = false, length = 250)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "phone", nullable = false, length = 250)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
	public Set<Transaction> getTransactions() {
		return this.transactions;
	}

	public void setTransactions(Set<Transaction> transactions) {
		this.transactions = transactions;
	}

}