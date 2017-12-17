package com.rohit.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rohit.poc.model.BookCategory;

public interface BookCategoryRepository extends JpaRepository<BookCategory,Integer>{

}
