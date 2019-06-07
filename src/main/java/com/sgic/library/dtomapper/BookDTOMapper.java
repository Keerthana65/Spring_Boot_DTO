package com.sgic.library.dtomapper;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sgic.library.dto.BookDTO;
import com.sgic.library.model.Book;
import com.sgic.library.service.BookService;

@Service
public class BookDTOMapper {

	@SuppressWarnings("unused")
	@Autowired
	private BookService bookService;
	
	ModelMapper modelMapper = new ModelMapper();
	

	PropertyMap <BookDTO, Book> bookMap = new PropertyMap <BookDTO, Book>() {
		  protected void configure() {
			
		  }
		};
		
	@SuppressWarnings("unused")
	private BookDTOMapper EntityToDTO(Book book) {
		BookDTOMapper bookDTO = modelMapper.map(book, BookDTOMapper.class);
		return bookDTO;
	}
	
	//Save Book
		public Book saveBook(BookDTO bookDTO) {
			Book book = modelMapper.map(bookDTO, Book.class);
			return bookService.saveBook(book);	
		}
		
	//List Book
    public List<BookDTO> getAllBook(){
    	List<Book> book = bookService.listBook();
    	Type listType = new TypeToken<List<BookDTO>>() {}.getType();
    	List<BookDTO> getsubList = new ModelMapper().map(book, listType);
		return getsubList;
    	
    }

	
	
}
