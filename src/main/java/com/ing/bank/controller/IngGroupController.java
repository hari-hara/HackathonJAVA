package com.ing.bank.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.bank.Exception.ErrorResponse;
import com.ing.bank.model.ProductUser;
import com.ing.bank.repository.UserRepository;
import com.ing.bank.service.IngGroupService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@CrossOrigin
@RestController
@RequestMapping("/bank")
public class IngGroupController {

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private IngGroupService ingGroupService;

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/version3")
	public String version() {
		return "10.10.10.02";

	}

	@ApiOperation(value = "This service used the identify the Group of Sub Product Details")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = ProductUser.class),
			@ApiResponse(code = 401, message = "Not Authorized", response = ErrorResponse.class),
			@ApiResponse(code = 404, message = "Not Found", response = ErrorResponse.class),
			@ApiResponse(code = 500, message = "Internal Error", response = ErrorResponse.class) })
	@GetMapping("/subgroupdetails/{groupId}/{subId}")

	public ResponseEntity<List<ProductUser>> subGroupDetails(@PathVariable("groupId") String groupId,
			@PathVariable("subId") String subId) {
		log.debug("This service used the identify the Group of Sub Product Details");
		

		userRepository.updateUser(groupId, subId);
		log.debug("This service used the update count for "+groupId);
		return ResponseEntity.ok().body(ingGroupService.getProductDetails(groupId));

	}

	@ApiOperation(value = "This service used the identify the Group of Sub Product Details")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = ProductUser.class),
			@ApiResponse(code = 401, message = "Not Authorized", response = ErrorResponse.class),
			@ApiResponse(code = 404, message = "Not Found", response = ErrorResponse.class),
			@ApiResponse(code = 500, message = "Internal Error", response = ErrorResponse.class) })
	@GetMapping("/subgroupdetails")

	public ResponseEntity<List<ProductUser>> productGroupDetails() {

		return ResponseEntity.ok().body(ingGroupService.getProductDetails());

	}

}
