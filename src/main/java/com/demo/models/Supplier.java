package com.demo.models;
// Generated 09:26:24 23-01-2022 by Hibernate Tools 5.1.10.Final

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

/**
 * Supplier generated by hbm2java
 */
@Entity
@Table(name = "supplier", catalog = "_qlhtk")
public class Supplier implements java.io.Serializable {

	private Integer id;
	private String name;
	private String email;
	private String phone;
	private String address;
	private Set<ImportInvoices> importInvoiceses = new HashSet<ImportInvoices>(0);

	public Supplier() {
	}

	public Supplier(String name, String email, String phone, String address) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}

	public Supplier(String name, String email, String phone, String address, Set<ImportInvoices> importInvoiceses) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.importInvoiceses = importInvoiceses;
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

	@Column(name = "name", nullable = false, length = 250)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Column(name = "address", nullable = false, length = 250)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "supplier")
	public Set<ImportInvoices> getImportInvoiceses() {
		return this.importInvoiceses;
	}

	public void setImportInvoiceses(Set<ImportInvoices> importInvoiceses) {
		this.importInvoiceses = importInvoiceses;
	}

}
