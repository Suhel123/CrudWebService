package com.kgate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Book")
public class Book  {
	@Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  String title;
  String aurthor;
   public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAurthor() {
	return aurthor;
}
public void setAurthor(String aurthor) {
	this.aurthor = aurthor;
}
@Override
public String toString() {
	return "Book [id=" + id + ", title=" + title + ", aurthor=" + aurthor + ", getId()=" + getId() + ", getTitle()="
			+ getTitle() + ", getAurthor()=" + getAurthor() + ", getClass()=" + getClass() + ", hashCode()="
			+ hashCode() + ", toString()=" + super.toString() + "]";
}
  
  
}
