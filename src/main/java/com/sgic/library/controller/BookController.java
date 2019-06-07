package com.sgic.library.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sgic.library.dto.BookDTO;
import com.sgic.library.dtomapper.BookDTOMapper;

@RestController
public class BookController {

	@Autowired
	private BookDTOMapper bookDTOMapper;
	
	@PostMapping("/saveBook")
	public HttpStatus saveBook(@Valid @RequestBody BookDTO bookDTO) {
		bookDTOMapper.saveBook(bookDTO);
		return HttpStatus.CREATED;
	}
	
	@GetMapping("/getAllBooks")
	public List<BookDTO> getAllBook(){
		return bookDTOMapper.getAllBook();
	}
}
