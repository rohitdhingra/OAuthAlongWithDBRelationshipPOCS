package com.techrohit.springbootdemo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.techrohit.springbootdemo.model.Role;
import com.techrohit.springbootdemo.model.User;
import com.techrohit.springbootdemo.repository.UserRepository;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
	@Autowired
	public void authenticationManager(AuthenticationManagerBuilder builder,UserRepository repo) throws Exception
	{
		if(repo.count()==0)
		{
			repo.save(new User("user","user",Arrays.asList(new Role("USER"),new Role("ACTUATOR"))));
		}
		builder.userDetailsService(new UserDetailsService()
				{

					@Override
					public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
						// TODO Auto-generated method stub
						return new CustomUserDetails(repo.findByUsername(s));
					}
			
				});
	}
}
