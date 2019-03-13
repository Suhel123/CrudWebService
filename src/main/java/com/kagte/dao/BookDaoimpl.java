package com.kagte.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kgate.model.Book;

@Repository
public class BookDaoimpl implements BookDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public long save(Book book) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(book);
		return book.getId();
	}

	@Override
	public Book get(long id) {
		// TODO Auto-generated method stub
		
		return sessionFactory.getCurrentSession().get(Book.class, id);
	}

	@Override
	public List<Book> list() {
		
		List<Book> book =sessionFactory.getSessionFactory().getCurrentSession().createQuery("from Bokk").list();
		
		return book;
		
		//CriteriaBuilder builder=session.getCriteriaBuilder();
		/*
		 * CriteriaQuery<Book> criteriaQuery=builder.createQuery(Book.class); Root<Book>
		 * root=criteriaQuery.from(Book.class); org.hibernate.query.Query<Book> query =
		 * session.createQuery(criteriaQuery); return query.getResultList();
		 */
	}

	@Override
	public void update(long id, Book book) {
		
		
		  Session session = sessionFactory.getCurrentSession();
	      Book book2 = session.byId(Book.class).load(id);
	      book2.setTitle(book.getTitle());
	      book2.setAurthor(book.getAurthor());
	      session.flush();
		
	}

	@Override
	public void deleteData(long id) {
		
		Session session = sessionFactory.getCurrentSession();
	      Book book = session.byId(Book.class).load(id);
	      session.delete(book);
	}

	
	}


