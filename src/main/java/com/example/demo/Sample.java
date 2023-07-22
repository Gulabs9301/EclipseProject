package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {
	@GetMapping(value = "/getHi")
	public String GetHi() {
		return "hello World";
	}

	@GetMapping(value = "/getName")
	public String getName() {
		return "Naveen";
	}

	@GetMapping(value = "/total/{a}/{b}")
	public int add(@PathVariable int a, @PathVariable int b) {
		return a + b;
	}

}

