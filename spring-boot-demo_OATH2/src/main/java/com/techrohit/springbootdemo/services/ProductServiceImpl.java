package com.techrohit.springbootdemo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techrohit.springbootdemo.model.Product;
import com.techrohit.springbootdemo.repository.ProductRepository;

@Service
public class ProductServiceImpl {

	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> listAll()
	{
		List<Product> products= new ArrayList<Product>();
		productRepository.findAll().forEach(products::add);
		return products;
	}
	
	
	public Product saveorUpdate(Product product)
	{
		productRepository.save(product);
		return product;
	}
	
	public void delete(Long id)
	{
		productRepository.delete(id);
	}
	public Product getById(Long id)
	{
		return productRepository.findOne(id);
	}
}
