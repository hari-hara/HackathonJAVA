package com.ing.bank.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.bank.model.GroupAndCount;
import com.ing.bank.model.ProductDetails;
import com.ing.bank.repository.ProductRepository;

@Service
public class ProductServiceImp implements ProductService {

	@Autowired
	private ProductRepository productRepo;
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<GroupAndCount> getCountOfProductGroup() {
		// return productRepo.checkCountAsPerGroup();

		List<Map<String, Object>> allPosts = productRepo.checkCountAsPerGroup();
		return (null != allPosts && allPosts.size() > 0)
				? allPosts.stream().map(summary -> new GroupAndCount(summary)).collect(Collectors.toList())
				: null;

	}

	@Override
	public List<ProductDetails> getProductDetails() {
		return productRepository.findAll();
	}
}
