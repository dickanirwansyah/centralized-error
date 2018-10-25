package com.app.manageerror.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@PostMapping(value = "/wrong")
	public void demoWrong() {
		throw new RuntimeException("demo test exception.");
	}
	
	@PostMapping(value = "/excelent")
	public ResponseEntity<String> demoExcelent() {
		return ResponseEntity.ok("Hallo !");
	}
	
}
