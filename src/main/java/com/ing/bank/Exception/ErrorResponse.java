package com.ing.bank.Exception;

import java.util.Date;
import java.util.List;

public class ErrorResponse {

	// General error message about nature of error
	private String message;

	private Date timestamp;
	
	private List<String> details;


	public ErrorResponse(Date timestamp, String message, List<String> details) {
		super();
		this.message = message;
		this.timestamp = timestamp;
		this.details = details;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getDetails() {
		return details;
	}

	public void setDetails(List<String> details) {
		this.details = details;
	}

}