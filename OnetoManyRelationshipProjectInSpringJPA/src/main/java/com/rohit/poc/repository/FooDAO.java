package com.rohit.poc.repository;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.google.common.base.Preconditions;
import com.rohit.poc.model.Book;

public class FooDAO extends HibernateDaoSupport implements IFooDao{
	public Long create( Book entity ){
	      Preconditions.checkNotNull( entity );
	 
	      return (Long) this.getHibernateTemplate().save( entity );
	   }
}
