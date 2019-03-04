package com.spring.mvc.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.mvc.demo.model.User;

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {

	@Override
	public User findByUsername(String username) {
		User user = new User();
		user.setId(100);
		user.setFirstname("piyush");
		return user;
	}

}
