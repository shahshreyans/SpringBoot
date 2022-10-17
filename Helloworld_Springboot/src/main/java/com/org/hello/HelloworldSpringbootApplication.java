package com.org.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloworldSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldSpringbootApplication.class, args);
	}
	
	@RequestMapping(value = "/shreyans", method=RequestMethod.GET)
	public String shreyans() {
		String x= "Hello From Shreyans";
		return x ; 
	}
}
