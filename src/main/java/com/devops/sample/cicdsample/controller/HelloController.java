package com.devops.sample.cicdsample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String hello()
	{
		return "Welcome to the world of devops/docker/jenkins";
		
	}

}
