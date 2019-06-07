package com.sgic.library.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="book")
public class Book implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="book_id")
	private long bookId;
	
	@Column(name="book_name")
	private String bookName;

	@ManyToOne
	@JoinColumn(name="subClassification_id")
	private SubClassification subClassification;
	

	public SubClassification getSubClassification() {
		return subClassification;
	}

	public void setSubClassification(SubClassification subClassification) {
		this.subClassification = subClassification;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public long getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
    
	
}
