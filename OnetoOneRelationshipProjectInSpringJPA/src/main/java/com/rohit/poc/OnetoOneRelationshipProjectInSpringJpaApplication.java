package com.rohit.poc;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rohit.poc.model.Book;
import com.rohit.poc.model.BookDetails;
import com.rohit.poc.repository.BookRepository;

@SpringBootApplication
public class OnetoOneRelationshipProjectInSpringJpaApplication implements CommandLineRunner{

	private static final Logger logger = LoggerFactory.getLogger(OnetoOneRelationshipProjectInSpringJpaApplication.class);
	
	@Autowired
	private BookRepository bookRepository;
	public static void main(String[] args) {
		SpringApplication.run(OnetoOneRelationshipProjectInSpringJpaApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception
	{
		List<Book> books = new ArrayList<>();
		books.add(new Book("Book A",new BookDetails(10)));
		books.add(new Book("Book B",new BookDetails(20)));
		books.add(new Book("Book C",new BookDetails(30)));
		bookRepository.save(books);
		
		for (Book book : bookRepository.findAll()) {
            logger.info(book.toString());
        }
	
	}
	
}
