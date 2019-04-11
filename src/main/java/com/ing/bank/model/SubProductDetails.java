package com.ing.bank.model;

public class SubProductDetails {

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubProductName() {
		return subProductName;
	}
	public void setSubProductName(String subProductName) {
		this.subProductName = subProductName;
	}
	public String getSubProductIntRate() {
		return subProductIntRate;
	}
	public void setSubProductIntRate(String subProductIntRate) {
		this.subProductIntRate = subProductIntRate;
	}
	private String subProductName;
	private String subProductIntRate;
}
