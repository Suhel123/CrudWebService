package com.kagte.service;

import java.util.List;

import com.kgate.model.Book;

public interface BookServcie {

	long save(Book book);
	
	public Book get(long id);
	
	public List<Book> list();
	
	public void update(long id, Book book);
	
	public void deleteData(long id);
}
