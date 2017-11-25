package com.techrohit.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techrohit.springbootdemo.model.User;

public interface UserRepository  extends JpaRepository<User,Long>{
	
	User findByUsername(String username);

}
