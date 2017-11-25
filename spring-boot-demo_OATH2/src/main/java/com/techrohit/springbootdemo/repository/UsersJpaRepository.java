package com.techrohit.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.techrohit.springbootdemo.model.Users;

@Component
public interface UsersJpaRepository extends JpaRepository<Users,Long> {

	Users findByName(String name);

	

}
