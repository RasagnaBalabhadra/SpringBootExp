package com.server;

import java.util.HashSet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
	HashSet <BookModel> bookDB = new HashSet<BookModel>();
	
	@PostMapping
	public String addBook(@RequestBody BookModel book) {
		bookDB.add(book);
		return "Book added successfully";
	}
	
	@GetMapping
	public HashSet<BookModel> getAllBooks(){
		return bookDB;
	}
	
	@GetMapping("/{isbn}")
	public BookModel getBookByIsbn(@PathVariable String isbn) {
		BookModel book = bookDB.stream().filter((obj) -> obj.getIsbn().equals(isbn)).findAny().orElse(null);
		return book;
	}
	
}
