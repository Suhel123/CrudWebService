package com.controller.kgate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kagte.service.BookServcie;
import com.kgate.model.Book;

@RestController
public class BookController {
	
	@Autowired
	BookServcie bookServcie;
	
	/*---Add new book---*/
	@PostMapping(value="/booksave")
	   ResponseEntity<?> save(@RequestBody Book book){
		System.out.println("BookController.save()");
		long id=bookServcie.save(book);
		return ResponseEntity.ok().body("new book save"+id);
		 
	 }
	
	/*---Get a book by id---*/
	  @GetMapping(value="/{id}")
	  ResponseEntity<?> get(@PathVariable("id") long id){
		
		Book book=bookServcie.get(id);
		System.out.println("BookController.get()");
		return ResponseEntity.ok("body save data" +book);
		
	}
	  
	  /*---get all books---*/
	    @GetMapping(value="/booksave")
        ResponseEntity <List<Book>>list(){
	    	System.out.println("BookController.list()");
	    	List<Book> book=bookServcie.list();
	    	System.out.println("BookController.list()");
	    	return ResponseEntity.ok().body(book);
    	  
      }
	    
	    /*---Update a book by id---*/
	    
	    @PutMapping("/{id}")
	    public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody Book book) {
	    	bookServcie.update(id, book);
	       return ResponseEntity.ok().body("Book has been updated successfully.");
	    	
	    }
	    
	    /*---Detete a book by id---*/
	      @DeleteMapping("/book/{id}")
	      public ResponseEntity<?> delete(@PathVariable("id") long id) {
	    	bookServcie.deleteData(id);
	       return ResponseEntity.ok().body("Book has been deleted successfully.");
	    	
	    }
	    
}
