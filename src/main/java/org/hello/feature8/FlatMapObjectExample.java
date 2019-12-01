package org.hello.feature8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapObjectExample {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		
		Student student1 = new Student();
		student1.setName("Reena");
		student1.addBook("Java in Action");
		student1.addBook("Java 8 in Action");
		student1.addBook("Spring Boot in Action");
		student1.addBook("Effective Java (2nd Edition)");
		
		Student student2 = new Student();
		student2.setName("Meena");
		student2.addBook("Learning Python, 5th Edition");
		student2.addBook("Effective Java (2nd Edition)");
		students.add(student1);
		students.add(student2);
		
		List<String> book = students.stream().map(x -> x.getBook()).flatMap(x -> x.stream()).distinct().collect(Collectors.toList());
		book.forEach(System.out::println);
		
	}
}
