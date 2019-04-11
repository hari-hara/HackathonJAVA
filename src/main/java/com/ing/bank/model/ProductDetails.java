package com.ing.bank.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.Table;

import com.fasterxml.jackson.core.sym.Name;

@Entity
@Table(name = "product_details")
//NamedQuery(name="getCOunts", query="")
public class ProductDetails {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

//	@NotNull
//	@Size(min=2, message="")
	@Column(name = "product_group_id", nullable = false)
	private int productGroupId;

	@Column(name = "product_group_name")
	private String productGroupName;

	@Column(name = "sub_product_name_id")
	private int subProductNameId;

	@Column(name = "sub_product_name")
	private String subProductName;

	@Column(name = "sub_product_interest_rate")
	private String subProductInterestRate;

	@Column(name = "sub_product_percentage")
	private String subProductPercentage;

	@Column(name = "sub_product_min_inv")
	private String subProductMinInv;

	@Column(name = "sub_product_max_inv")
	private String subProductMaxInv;

	@Column(name = "sub_product_duration")
	private String subProductDuration;

	@Column(name = "count")
	private int count;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getProductGroupId() {
		return productGroupId;
	}

	public void setProductGroupId(int productGroupId) {
		this.productGroupId = productGroupId;
	}

	public String getProductGroupName() {
		return productGroupName;
	}

	public void setProductGroupName(String productGroupName) {
		this.productGroupName = productGroupName;
	}

	public int getSubProductNameId() {
		return subProductNameId;
	}

	public void setSubProductNameId(int subProductNameId) {
		this.subProductNameId = subProductNameId;
	}

	public String getSubProductName() {
		return subProductName;
	}

	public void setSubProductName(String subProductName) {
		this.subProductName = subProductName;
	}

	public String getSubProductInterestRate() {
		return subProductInterestRate;
	}

	public void setSubProductInterestRate(String subProductInterestRate) {
		this.subProductInterestRate = subProductInterestRate;
	}

	public String getSubProductPercentage() {
		return subProductPercentage;
	}

	public void setSubProductPercentage(String subProductPercentage) {
		this.subProductPercentage = subProductPercentage;
	}

	public String getSubProductMinInv() {
		return subProductMinInv;
	}

	public void setSubProductMinInv(String subProductMinInv) {
		this.subProductMinInv = subProductMinInv;
	}

	public String getSubProductMaxInv() {
		return subProductMaxInv;
	}

	public void setSubProductMaxInv(String subProductMaxInv) {
		this.subProductMaxInv = subProductMaxInv;
	}

	public String getSubProductDuration() {
		return subProductDuration;
	}

	public void setSubProductDuration(String subProductDuration) {
		this.subProductDuration = subProductDuration;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
