package com.book.services;

import java.util.HashSet;

import org.springframework.stereotype.Service;

import com.book.model.Book;

@Service
public class BookServiceImpl implements BookService {
	HashSet<Book> booksDB = new HashSet<Book>();
	
	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		booksDB.add(book);
	}

	@Override
	public HashSet<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return booksDB;
	}

	@Override
	public void deleteAllBooks() {
		// TODO Auto-generated method stub
		booksDB.clear();

	}

	@Override
	public Book getBookByIsbn(String isbn) {
		// TODO Auto-generated method stub
		Book book = booksDB.stream().filter((obj)-> obj.getIsbn().equals(isbn)).findAny().orElse(null);
		return book;
	}

}
