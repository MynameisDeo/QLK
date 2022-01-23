package com.demo.models;
// Generated 09:26:24 23-01-2022 by Hibernate Tools 5.1.10.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ImportInvoices generated by hbm2java
 */
@Entity
@Table(name = "import_invoices", catalog = "_qlhtk")
public class ImportInvoices implements java.io.Serializable {

	private Integer id;
	private Account account;
	private Supplier supplier;
	private String name;
	private Date created;
	private byte status;
	private int quantity;
	private double price;
	private Set<Product> products = new HashSet<Product>(0);

	public ImportInvoices() {
	}

	public ImportInvoices(Account account, Supplier supplier, String name, Date created, byte status, int quantity,
			double price) {
		this.account = account;
		this.supplier = supplier;
		this.name = name;
		this.created = created;
		this.status = status;
		this.quantity = quantity;
		this.price = price;
	}

	public ImportInvoices(Account account, Supplier supplier, String name, Date created, byte status, int quantity,
			double price, Set<Product> products) {
		this.account = account;
		this.supplier = supplier;
		this.name = name;
		this.created = created;
		this.status = status;
		this.quantity = quantity;
		this.price = price;
		this.products = products;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_acc", nullable = false)
	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_sup", nullable = false)
	public Supplier getSupplier() {
		return this.supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	@Column(name = "name", nullable = false, length = 250)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "created", nullable = false, length = 10)
	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Column(name = "status", nullable = false)
	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	@Column(name = "quantity", nullable = false)
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Column(name = "price", nullable = false, precision = 22, scale = 0)
	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "product_invoice_import", catalog = "_qlhtk", joinColumns = {
			@JoinColumn(name = "id_invoice", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "id_pro", nullable = false, updatable = false) })
	public Set<Product> getProducts() {
		return this.products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

}
