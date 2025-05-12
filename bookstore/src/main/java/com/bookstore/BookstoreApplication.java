package com.bookstore;

import com.bookstore.model.Book;
import com.bookstore.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	CommandLineRunner seedDatabase(BookRepository bookRepository) {
		return args -> {
			if (bookRepository.count() == 0) {
				bookRepository.save(new Book("Clean Code", "Robert C. Martin", 45.0, "A Handbook of Agile Software Craftsmanship"));
				bookRepository.save(new Book("Effective Java", "Joshua Bloch", 50.0, "Best practices for Java programming"));
				bookRepository.save(new Book("The Pragmatic Programmer", "Andrew Hunt", 42.5, "Journey to mastery in software development"));
				bookRepository.save(new Book("Clean Code", "Robert C. Martin", 45.0, "A Handbook of Agile Software Craftsmanship"));
				bookRepository.save(new Book("Effective Java", "Joshua Bloch", 50.0, "Best practices for Java programming"));
				bookRepository.save(new Book("The Pragmatic Programmer", "Andrew Hunt", 42.5, "Journey to mastery in software development"));
				bookRepository.save(new Book("Design Patterns", "Erich Gamma", 55.0, "Elements of Reusable Object-Oriented Software"));
				bookRepository.save(new Book("Refactoring", "Martin Fowler", 48.0, "Improving the Design of Existing Code"));
				bookRepository.save(new Book("Java Concurrency in Practice", "Brian Goetz", 52.0, "Concurrency concepts for Java developers"));
				bookRepository.save(new Book("Head First Design Patterns", "Eric Freeman", 40.0, "A brain-friendly guide to design patterns"));
				bookRepository.save(new Book("Spring in Action", "Craig Walls", 46.0, "Comprehensive guide to Spring framework"));
				bookRepository.save(new Book("Introduction to Algorithms", "Thomas H. Cormen", 60.0, "The standard text for algorithms"));
				bookRepository.save(new Book("Code Complete", "Steve McConnell", 49.5, "A practical handbook of software construction"));

			}
		};
	}
}
