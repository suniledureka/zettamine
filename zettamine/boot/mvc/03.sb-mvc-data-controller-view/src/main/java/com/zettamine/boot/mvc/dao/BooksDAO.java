package com.zettamine.boot.mvc.dao;

import java.util.Arrays;
import java.util.List;

import com.zettamine.boot.mvc.models.Book;

public class BooksDAO {
	public static List<Book> getAllBooks(){
		return Arrays.asList(
				new Book(101, "Java Complete Reference", 750.5f),
				new Book(102, "Python Complete Reference", 975.75f),
				new Book(103, "React Made Easy", 750.5f),
				new Book(104, "Angular - A Complete Reference", 650.5f),
				new Book(105, "Spring Boot with Microservices", 450.5f)
				);
	}
}
