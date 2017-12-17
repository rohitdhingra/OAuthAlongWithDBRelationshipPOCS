package com.rohit.poc.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="book",schema="db")
public class Book {
private int id;
private String name;
private BookDetails bookDetails;



public Book() {
	super();
	// TODO Auto-generated constructor stub
}



public Book( String name, BookDetails bookDetails) {

	this.name = name;
	this.bookDetails = bookDetails;
}


@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="id")
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


@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="book_detail_id")
public BookDetails getBookDetails() {
	return bookDetails;
}



public void setBookDetails(BookDetails bookDetails) {
	this.bookDetails = bookDetails;
}



@Override
public String toString() {
	return "Book [id=" + id + ", name=" + name + ", numberOfPages=" + bookDetails.getNumberOfPages() + "]";
}



	
}
