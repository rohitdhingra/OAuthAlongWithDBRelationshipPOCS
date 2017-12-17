package com.rohit.poc.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="book_category")
public class BookCategory {

	private int id;
	private String name;
	private Set<Book> books;
	public BookCategory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookCategory(String name) {
		super();
		this.name = name;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy="bookCategory",cascade=CascadeType.ALL)
	public Set<Book> getBooks() {
		return books;
	}
	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		 String result = String.format(
	                "Category[id=%d, name='%s']%n",
	                id, name);
	        if (books != null) {
	            for(Book book : books) {
	                result += String.format(
	                        "Book[id=%d, name='%s']%n",
	                        book.getId(), book.getName());
	            }
	        }

	        return result;
}
	
	
	
}
