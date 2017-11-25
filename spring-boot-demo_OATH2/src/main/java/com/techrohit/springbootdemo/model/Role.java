package com.techrohit.springbootdemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="roletable")
public class Role {

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	Role(){}
	
	public Role(String name)
	{
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
