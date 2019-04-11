
package com.ing.bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;


public class SubProductDetailsOverview {

	
//	@JsonProperty("product_group_name")
//	private String productGroupName;

	
	private int subProductNameId;

	
	private String subProductName;

	
	private String subProductInterestRate;

	
	private String subProductPercentage;

	
	private String subProductMinInv;

	
	private String subProductMaxInv;


	private String subProductDuration;

		
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

	

}
