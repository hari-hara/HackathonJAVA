package com.ing.bank.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.bank.service.IngProductService;

@CrossOrigin
@RestController
@RequestMapping("/bank")
public class IngGroupController {

	private final Logger log = LoggerFactory.getLogger(this.getClass());
		@Autowired
		private IngProductService ingServiceThree;
		
		
		@GetMapping("/version3")
		public String version() {
			return "10.10.10.02";

		}

}

