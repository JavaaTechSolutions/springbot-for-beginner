package com.jts.springboot_demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<Users> getAllUsers() {
		return userRepository.findAll();
	}

	public Users addUser(Users user) {
		return userRepository.save(user);
	}
}