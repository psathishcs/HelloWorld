package org.hello.feature8;

import java.util.HashSet;
import java.util.Set;

public class Student {
	private String name;
	private Set<String> book;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void addBook(String book) {
		if (null == this.book)
			this.book = new HashSet<>();
		this.book.add(book);
			
	}
	public Set<String> getBook() {
		return book;
	}
	public void setBook(Set<String> book) {
		this.book = book;
	}
	
	

}
