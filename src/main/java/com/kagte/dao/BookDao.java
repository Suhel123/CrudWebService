package com.kagte.dao;

import java.util.List;

import com.kgate.model.Book;

public interface BookDao {

	  long save(Book book);
	  
	  Book get(long id);
	  
	  List<Book> list();
	  
	  void update(long id, Book book);
	  
	  
	  void deleteData(long id);
}
