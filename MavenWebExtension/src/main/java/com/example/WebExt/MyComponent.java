package com.example.WebExt;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {
	MyService service;

	public MyComponent(MyService service) {
		super();
		this.service = service;
	}
	
	public String performOperation() {
		return service.doService();
	}
}
