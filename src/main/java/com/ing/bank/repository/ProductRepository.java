package com.ing.bank.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ing.bank.model.ProductDetails;
import com.ing.bank.model.ProductGroupCount;


@Repository
public interface ProductRepository extends JpaRepository<ProductDetails, Long> {

	
	/*
	 * @Query(value =
	 * "select p.product_group_id, sum(p.count) as total_quantity from product_details p group by p.product_group_id"
	 * , nativeQuery = true) //List<ProductDetails> checkCountAsPerGroup();
	 * 
	 * public List<Map<String, Object>> checkCountAsPerGroup();
	 */
	
	 
	 
	 @Query(value = "select p.product_group_id, p.product_group_name, sum(p.count) as total_quantity from product_details p group by p.product_group_id ,  p.product_group_name " , nativeQuery = true)
		//List<ProductDetails> checkCountAsPerGroup();
		 
		 public List<Map<String, Object>> checkCountAsPerGroup(); 
		
	
}
