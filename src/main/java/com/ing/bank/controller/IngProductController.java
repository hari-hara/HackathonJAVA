package com.ing.bank.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.bank.Exception.ErrorResponse;
import com.ing.bank.model.IngProductModel;
import com.ing.bank.service.IngGroupService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "Ing Controller")
@CrossOrigin
@RestController
@RequestMapping("/bank")
public class IngProductController {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private IngGroupService ingService;

	@ApiOperation(value = "This service used the identify the version")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = IngProductModel.class),
			@ApiResponse(code = 401, message = "Not Authorized", response = ErrorResponse.class),
			@ApiResponse(code = 404, message = "Not Found", response = ErrorResponse.class),
			@ApiResponse(code = 500, message = "Internal Error", response = ErrorResponse.class) })
	@GetMapping("/version")
	public String version() {

		log.info("inside the version one");
//           int a= 5/0;
//           System.out.println(a);
		System.out.println("version 1");
		return "10.10.10.01";

	}

}
