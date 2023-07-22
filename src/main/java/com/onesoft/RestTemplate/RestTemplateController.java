package com.onesoft.RestTemplate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTemplateController {
	@GetMapping(value = "/getHi")
	public String getHi() {
		return "Hi";
	}

}
