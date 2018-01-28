package com.weeraman.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Value("${greeting}")
	String greeting;
	
	@GetMapping(path="/hello")
	public String sayHello() {
		return greeting;
	}

}
