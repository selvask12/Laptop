package com.example.laptop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaptopController {

	@GetMapping(value="/getValue")
	public String getValue() {
		return "Hi";
	}
}
