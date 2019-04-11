package com.ing.bank.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.bank.model.GroupAndCount;
import com.ing.bank.model.ProductDetails;
import com.ing.bank.model.ProductGroupCount;
import com.ing.bank.service.ProductService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@CrossOrigin
@EnableSwagger2
@RestController
@RequestMapping("/product")


public class ProductController {

	@Autowired
	ProductService productService;
	
	@GetMapping("/version")
	public String version() {
		return "10.10.10";
		
	}
	

	@GetMapping("/groupCount")
	public List<GroupAndCount> groupCount() {
		return productService.getCountOfProductGroup();
		
	}
	
	
}

