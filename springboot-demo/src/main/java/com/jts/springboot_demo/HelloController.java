package com.jts.springboot_demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/hello")
	public String hello() {
		return "Hello, Spring Boot!";
	}
	
	@GetMapping("/users")
	public List<Users> getAllUsers() {
		return userService.getAllUsers();
	}
}
