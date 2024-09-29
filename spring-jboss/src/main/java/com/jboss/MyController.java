package com.jboss;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	
	@GetMapping("/welcome")
	public String getWelcomeMessage() {
	return "Running 234 in WildFly/Jboss server and working fine";
	
	}
}
