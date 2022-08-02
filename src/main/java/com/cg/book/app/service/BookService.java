package com.cg.book.app.service;

import java.util.List;

import com.cg.book.app.model.Book;
//import com.cg.book.app.model.Books;

public interface BookService {
	
	public List<Book> getAllBooks();
	
	public Book addBook(Book book);
	
	public Book getBookById(int id);
	
	public Book getBookByName(String name);
	
	public void deleteBook(int id);
	
	public Book UpdateBookById(int id, Book book);

//	public Books getAllBooksByName(String name);

}
