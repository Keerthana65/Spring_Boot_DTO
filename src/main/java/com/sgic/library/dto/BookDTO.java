package com.sgic.library.dto;

public class BookDTO {

	private long bookId;
	private String bookName;
	private long subClassificationId;
	
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public long getSubClassificationId() {
		return subClassificationId;
	}
	public void setSubClassificationId(long subClassificationId) {
		this.subClassificationId = subClassificationId;
	}
	
	
}
