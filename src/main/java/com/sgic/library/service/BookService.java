package com.sgic.library.service;

import java.util.List;

import com.sgic.library.model.Book;

public interface BookService {
 
	Book saveBook(Book book);
	List<Book> listBook();
}
