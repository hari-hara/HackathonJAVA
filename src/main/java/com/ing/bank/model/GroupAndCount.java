package com.ing.bank.model;


import java.util.Map;

import org.springframework.util.StringUtils;

public class GroupAndCount {

	private String groupId;
	private String count;
	//jaya
	private String groupName;
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	
	
	
	
	
	
	
	public GroupAndCount(Map<String, Object> values) {
		this.groupId = !StringUtils.isEmpty(values.get("product_group_id"))? values.get("product_group_id").toString(): null;
		//this.count = !StringUtils.isEmpty(values.get("count"))? new Integer(values.get("count").toString()): 0;
		this.count = !StringUtils.isEmpty(values.get("total_quantity"))? values.get("total_quantity").toString(): null;
		this.groupName = !StringUtils.isEmpty(values.get("product_group_name"))? values.get("product_group_name").toString(): null;
		
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
