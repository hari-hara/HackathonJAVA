package com.ing.bank.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ing.bank.Exception.CustomException;
import com.ing.bank.Exception.RecordNotFoundException;

import com.ing.bank.model.GroupAndCount;
import com.ing.bank.model.GroupDetails;
import com.ing.bank.model.ProductDetails;
import com.ing.bank.model.Subproduct;
import com.ing.bank.service.ProductService;
import com.ing.product.util.Singleton;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@CrossOrigin
@EnableSwagger2
@RestController
@RequestMapping("/product")


public class ProductController {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	ProductService productService;
	
	@GetMapping("/version")
	public String version() {
		return "10.10.10.10";
		
	}
	

	@GetMapping("/groupCount")
	public List<GroupAndCount> groupCount() {
		return productService.getCountOfProductGroup();
		
	}
	
	@GetMapping("/groupdetails")
	public List<GroupDetails> getGroupDetails(@RequestHeader("auth-key") String key) throws CustomException {
		log.info("Resource getGroupDetails in "+"Controller "+ProductController.class+" Started");
		List<ProductDetails> listOfProductDetails = null;
		GroupDetails gd;
		List<GroupDetails> gdlIst = null;
		if(null != key) {
			gd = new GroupDetails();
			gdlIst = new ArrayList<>();
			if(key.equals(Singleton.getInstance().getToken())) {
				listOfProductDetails = productService.getProductDetails();
				if(null != listOfProductDetails) {
					Map<String, List<ProductDetails>> map2 = listOfProductDetails.stream().collect(Collectors.groupingBy(ProductDetails::getProductGroupName));
					for(Map.Entry<String, List<ProductDetails>> me: map2.entrySet()) {
						gd = new GroupDetails();
						gd.setTitle(me.getKey());
						Subproduct sp = new Subproduct();
						List<Subproduct> listofSubP = null;
						List<ProductDetails> pd = me.getValue();
						for(ProductDetails productDetails : pd ) {
							listofSubP = new ArrayList<>();
							sp.setProductName(productDetails.getSubProductName());
							sp.setSubId(productDetails.getSubProductNameId()+"");
							listofSubP.add(sp);
						}
						gd.setSubproducts(listofSubP);
						gdlIst.add(gd);
					}
		    }else {
		    	throw new RecordNotFoundException("Product Details Not Found");
		    }
			}else {
				throw new CustomException("Request Header is Invalid"); 
			}
		}else {
			throw new CustomException("Request Header is Required"); 
		}
		
		log.info("Resource getGroupDetails in "+"Controller "+ProductController.class+" end");
		return gdlIst;
	}
}

