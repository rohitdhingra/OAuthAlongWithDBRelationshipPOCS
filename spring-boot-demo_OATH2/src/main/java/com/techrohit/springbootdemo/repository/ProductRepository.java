package com.techrohit.springbootdemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.techrohit.springbootdemo.model.Product;

public interface ProductRepository extends CrudRepository<Product,Long> {

}
