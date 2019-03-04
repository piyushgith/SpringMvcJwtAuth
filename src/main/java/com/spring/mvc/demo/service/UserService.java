package com.spring.mvc.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring.mvc.demo.model.User;
import com.spring.mvc.demo.repository.UserRepository;

@Service("userService")
public class UserService {

	@Autowired
	@Qualifier("userRepository")
	private UserRepository userRepository;

	public User getUserDetails() {

		User user = userRepository.findByUsername("admin");

		return user;
	}

}
