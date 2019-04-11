package com.ing.bank.service;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ing.bank.model.ProductUser;

public interface IngGroupService {

	public List<ProductUser> getProductDetails(String userId);
	
	@Modifying
	@Query(value = "UPDATE product_details SET count = count+1 WHERE product_group_id = :productGpId and sub_product_name_id=:productSubId")
	public String updateById(@Param("productGpId") String productGpId, @Param("productSubId")  String productSubId);

	public  List<ProductUser> getProductDetails();

	
}

