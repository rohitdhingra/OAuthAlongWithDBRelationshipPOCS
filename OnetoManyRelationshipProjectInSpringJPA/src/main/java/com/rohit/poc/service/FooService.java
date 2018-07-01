package com.rohit.poc.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.rohit.poc.model.Book;
import com.rohit.poc.repository.IFooDao;

public class FooService implements IFooService{

	@Autowired
	public
	IFooDao dao;

	@Override
	public Long create(Book entity) {
		return this.dao.create(entity);
	}
}
