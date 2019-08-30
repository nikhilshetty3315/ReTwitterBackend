package com.retwitter.retwitter;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//CONTROLLER
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class Postingcontroller {
	
	//GET
	//URI-HELLO WORLD
	// METHOD - "HELLO WORLD"
	@GetMapping(path= "/retwitter")
	public String postingMethod() {
		return "HelloWorld";
	}

	
	
	@GetMapping(path= "/retwitter-Bean")
	public postingMethodBean postingMethodBean() {
		return new postingMethodBean("HI");
	}

}
