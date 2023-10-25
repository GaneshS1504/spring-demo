package com.example.demo;

import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repo.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
	
	private UserRepository userRepository;
	
	Logger logger = LoggerFactory.getLogger(UserController.class);

	public UserController(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	@PostMapping("/save")
	public User saveUser(@RequestBody User user) {
		logger.info("new userData:{}", user);
		return userRepository.save(user);
	}
	
	@GetMapping("/getAll")
	public List<User> getAllUsers(){
		logger.info("getting all user data{}");
		return userRepository.findAll();
	}
}
