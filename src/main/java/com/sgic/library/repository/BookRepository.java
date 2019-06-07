package com.sgic.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.library.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
