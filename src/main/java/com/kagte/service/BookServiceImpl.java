package com.kagte.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kagte.dao.BookDao;
import com.kgate.model.Book;
@Service
@Transactional
public class BookServiceImpl implements BookServcie {
   @Autowired
    BookDao bookDao;

   
   @Transactional
   @Override
 public long save(Book book) {
	// TODO Auto-generated method stub
	return bookDao.save(book);
}


@Override
public Book get(long id) {
	// TODO Auto-generated method stub
	return bookDao.get(id);
}


@Override
public List<Book> list() {
	// TODO Auto-generated method stub
	return bookDao.list();
}


@Override
public void update(long id, Book book) {
	// TODO Auto-generated method stub
	
	bookDao.update(id, book);
	
}


@Override
public void deleteData(long id) {
	// TODO Auto-generated method stub
	
	bookDao.deleteData(id);
	
}

	

}
