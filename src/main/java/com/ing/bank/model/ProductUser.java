package com.ing.bank.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ProductUser {

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSub_id() {
		return sub_id;
	}

	public void setSub_id(int sub_id) {
		this.sub_id = sub_id;
	}

	
	private int id;

	private int sub_id;
	
	public String getProductGroupName() {
		return productGroupName;
	}

	public void setProductGroupName(String productGroupName) {
		this.productGroupName = productGroupName;
	}


	private String productGroupName;
	
	


	private List<SubProductDetailsOverview> SubProductDetails;

	public List<SubProductDetailsOverview> getSubProductDetails() {
		return SubProductDetails;
	}

	public void setSubProductDetails(List<SubProductDetailsOverview> subProductDetails) {
		SubProductDetails = subProductDetails;
	} 

	}
