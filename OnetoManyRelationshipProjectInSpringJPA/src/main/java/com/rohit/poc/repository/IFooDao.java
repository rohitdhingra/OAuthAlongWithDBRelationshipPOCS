package com.rohit.poc.repository;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.rohit.poc.model.Book;

public interface IFooDao {
	public Long create( Book entity );

	public void setHibernateTemplate(HibernateTemplate hibernateTemplateMock);
}
