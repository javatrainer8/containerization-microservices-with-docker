package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
	@Autowired
	RestTemplate restTemplate;
	@GetMapping("/data")            //localhost:8080/data
	public String  getData() {
		return restTemplate.getForObject("http://localhost:8081/getdata", String.class);
	}

}