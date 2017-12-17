package com.rohit.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rohit.poc.model.Book;

public interface BookRepository extends JpaRepository<Book,Integer>{

}
