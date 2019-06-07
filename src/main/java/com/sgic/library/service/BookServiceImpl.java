package com.sgic.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.library.model.Book;
import com.sgic.library.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepository bookRepository;

	@Override
	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public List<Book> listBook() {
		return bookRepository.findAll();
	}

	@Override
	public Book deleteBookById(Long bookId) {
		bookRepository.deleteById(bookId);
		return null;
	}

}
