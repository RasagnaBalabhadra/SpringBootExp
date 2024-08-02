package com.example.WebExt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebServiceController {
	MyComponent component;

	public WebServiceController(MyComponent component) {
		super();
		this.component = component;
	}
	@GetMapping("/Dotask")
	public String doTask() {
		return component.performOperation();
	}
}
