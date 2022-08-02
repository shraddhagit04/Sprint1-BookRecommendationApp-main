package com.cg.book.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.book.app.model.Book;
//import com.cg.book.app.model.Books;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

	public Book findBookByBookId(int id);

	public Book findBookByBookName(String name);

//	public Books findAllBooksByBookName(String name);

}
