package com.ing.bank.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.ing.bank.model.GroupAndCount;
import com.ing.bank.service.ProductService;

@RunWith(MockitoJUnitRunner.class)
public class ProductControllerTest {



	@InjectMocks
	private ProductController productController;

	@Mock
	private ProductService productService;


	@Before
	public void setUp() {
	}

	@Test
	public void testVerision() throws Exception {
		productController.version();
	}
	
	@Test
	public void groupCountTest() {
		List<GroupAndCount> groupAndCounts = new ArrayList<GroupAndCount>();
		Mockito.when(productService.getCountOfProductGroup()).thenReturn(groupAndCounts );
		productController.groupCount();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
