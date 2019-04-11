package com.ing.bank.service;

import java.util.List;

import com.ing.bank.model.GroupAndCount;
import com.ing.bank.model.ProductDetails;
import com.ing.bank.model.ProductGroupCount;


public interface ProductService {

	public List<GroupAndCount> getCountOfProductGroup();
}
