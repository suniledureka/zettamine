package com.zettamine.java.collections.stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		List<Book> books = new BooksDAO().getAllBooks();
		List<String> titles = books.stream().map(bk -> bk.getBookTitle()).collect(Collectors.toList());
		System.out.println(titles);
		
		int id = 1238;
		Stream<Book> bookStream = books.stream().filter(bk -> bk.getBookId()==id);
		//System.out.println(bookStream.collect(Collectors.toList()));
		//Optional<Book> book = bookStream.findFirst();
		//Optional<Book> book = bookStream.findAny();
		//Optional<Book> book = bookStream.skip(1).findFirst();
		//Optional<Book> book = Optional.ofNullable(bookStream.findAny().orElseGet(() -> new Book()));
		Optional<Book> book = Optional.of(bookStream.findAny().orElseThrow());
		if(book.isPresent()) {
			Book bk = book.get();
			System.out.println(bk);
		}else {
			System.out.println("--- no matching books found ----");
		}
	}

}
