package com.book.controller;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.model.Book;
import com.book.services.BookService;

@RestController
public class bookController {
	@Autowired
	BookService service;
	
	@PostMapping("/addbook")
	public String insertBook(@RequestBody Book book) {
		service.addBook(book);
		return "Book added successfully";
	}
	
	@GetMapping("/getbooks")
	public HashSet<Book> getAllBooks() {
		return service.getAllBooks();
	}

	@DeleteMapping("/deletebooks")
	public String removeAllBooks() {
		service.deleteAllBooks();
		return "Books deleted successfully";
	}
	
	@GetMapping("/getbookbyisbn/{isbn}")
	public Book displayBookByIsbn(@PathVariable String isbn) {
		return service.getBookByIsbn(isbn);
	}

	
	

}
