package org.aerospace.training.coffee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

	@GetMapping("/example")
	public String helloWorld() {
		return "Hello, world!";
	}
	
}
