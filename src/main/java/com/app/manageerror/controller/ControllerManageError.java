package com.app.manageerror.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.app.manageerror.model.ErrorResponse;

@ControllerAdvice
public class ControllerManageError {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> handlingError(Exception e) {
		
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		errorResponse.setMessage(e.getMessage());
		errorResponse.setDate(new Date());
		return new ResponseEntity<ErrorResponse>
		(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
