package com.spring.mvc.demo.repository;

import com.spring.mvc.demo.model.User;


public interface UserRepository /*extends JpaRepository<User, Integer>*/ {
	User findByUsername(String username);
}
