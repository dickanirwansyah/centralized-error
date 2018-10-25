package com.app.manageerror.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ErrorResponse {

	private Integer code;
	private String message;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date;
	
	public ErrorResponse() {
		
	}
	
	public Integer getCode() {
		return code;
	}
	
	public void setCode(Integer code) {
		this.code = code;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
}
