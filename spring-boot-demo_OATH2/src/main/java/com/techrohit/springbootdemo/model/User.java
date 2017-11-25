package com.techrohit.springbootdemo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="usertable")
public class User {

	@Id
	@GeneratedValue
	private Long id;
	private String username;
	private String password;
	
	public User()
	{
		
	}
	@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private List<Role> roles;

	public User(String username, String password, List<Role> list)
	{
		this.username = username;
		this.password = password;
		this.roles = list;
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	
}
