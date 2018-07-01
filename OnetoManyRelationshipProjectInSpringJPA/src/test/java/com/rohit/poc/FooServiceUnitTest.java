package com.rohit.poc;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.rohit.poc.model.Book;
import com.rohit.poc.model.BookCategory;
import com.rohit.poc.repository.FooDAO;
import com.rohit.poc.service.FooService;

public class FooServiceUnitTest {

	FooService instance;
	
	private HibernateTemplate hibernateTemplateMock;
	
	@Before(value = "")
	   public void before(){
	      this.instance = new FooService();
	      this.instance.dao = new FooDAO();
	      this.hibernateTemplateMock = mock( HibernateTemplate.class );
	      this.instance.dao.setHibernateTemplate( this.hibernateTemplateMock );
	   }
	
	@Test( expected = NullPointerException.class )
	   public void whenCreateIsTriggeredForNullEntity_thenException(){
	      // When
	      this.instance.create( null );
	   }
	
	@Test
	   public void whenCreateIsTriggered_thenNoException(){
	      // When
		BookCategory categoryA = new BookCategory("Category A");
	      this.instance.create( new Book( "testName",categoryA) );
	   }

	
	@Test
	   public void whenCreateIsTriggered_thenEntityIsCreated(){
	      // When
	      Book entity = new Book( "testName" );
	      this.instance.create( entity );
	 
	      // Then
	      ArgumentCaptor< Book > argument = ArgumentCaptor.forClass( Book.class );
	      verify( this.hibernateTemplateMock ).save( argument.capture() );
	      assertThat( entity, is( argument.getValue() ) );
	   }
	 
}
