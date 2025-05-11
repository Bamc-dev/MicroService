package com.example.book.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

	@Value("${custom.hello}")
	private String customHello;

	@GetMapping("/test")
	public String getBook() {
		return customHello;
	}
}
