package com.example.webApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	@GetMapping("/Message")
	public String sendMessage() {
		return "This is Maven Web Application Experiment";
	}
	
	@GetMapping("/numsum")
	public String getSum() {
		int num1 = 95;
		int num2 = 178;
		int sum = num1 + num2;
		return "The Sum of " +num1 + " and " +num2+ " is : " +sum;
	}
	
	
}