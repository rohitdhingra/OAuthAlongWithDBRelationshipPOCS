package com.rohit.poc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="book_detail",schema="db")
public class BookDetails {
private Integer id;
private Integer numberOfPages;	
private Book book;
public BookDetails() {
	super();
	// TODO Auto-generated constructor stub
}
public BookDetails(Integer numberOfPages) {
	super();
	this.numberOfPages = numberOfPages;
}

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="id")
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
@Column(name="number_of_pages")
public Integer getNumberOfPages() {
	return numberOfPages;
}
public void setNumberOfPages(Integer numberOfPages) {
	this.numberOfPages = numberOfPages;
}

@OneToOne(mappedBy="bookDetails")
public Book getBook() {
	return book;
}
public void setBook(Book book) {
	this.book = book;
}


}
