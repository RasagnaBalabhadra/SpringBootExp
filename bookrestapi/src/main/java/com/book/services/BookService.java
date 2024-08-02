package com.book.services;

import java.util.HashSet;

import com.book.model.Book;

public interface BookService {
	public void addBook(Book book);
	public HashSet<Book> getAllBooks();
	public void deleteAllBooks();
	public Book getBookByIsbn(String isbn);
}
