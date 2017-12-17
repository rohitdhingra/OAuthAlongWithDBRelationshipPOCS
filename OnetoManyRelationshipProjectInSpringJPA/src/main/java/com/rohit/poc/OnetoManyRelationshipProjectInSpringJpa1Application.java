package com.rohit.poc;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rohit.poc.model.Book;
import com.rohit.poc.model.BookCategory;
import com.rohit.poc.repository.BookCategoryRepository;

@SpringBootApplication
public class OnetoManyRelationshipProjectInSpringJpa1Application implements CommandLineRunner{

	private static final Logger logger = LoggerFactory.getLogger(OnetoManyRelationshipProjectInSpringJpa1Application.class);
	@Autowired
	private BookCategoryRepository bookCategoryRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(OnetoManyRelationshipProjectInSpringJpa1Application.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		
		BookCategory categoryA = new BookCategory("Category A");
        Set bookAs = new HashSet<Book>(){{
            add(new Book("Book A1", categoryA));
            add(new Book("Book A2", categoryA));
            add(new Book("Book A3", categoryA));
        }};
        categoryA.setBooks(bookAs);

        BookCategory categoryB = new BookCategory("Category B");
        Set bookBs = new HashSet<Book>(){{
            add(new Book("Book B1", categoryB));
            add(new Book("Book B2", categoryB));
            add(new Book("Book B3", categoryB));
        }};
        categoryB.setBooks(bookBs);

        bookCategoryRepository.save(new HashSet<BookCategory>() {{
            add(categoryA);
            add(categoryB);
        }});

        // fetch all categories
        for (BookCategory bookCategory : bookCategoryRepository.findAll()) {
            logger.info(bookCategory.toString());
        }
		
	}
}
