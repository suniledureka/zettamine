package com.zettamine.boot.mvc.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zettamine.boot.mvc.dao.BooksDAO;
import com.zettamine.boot.mvc.models.Book;

@Controller
@RequestMapping("/library")
public class LibraryController {
	@GetMapping(path = "/book")
	public String sendBookDetails(Model model) {
		Book book = new Book();
		
		book.setBookId(21210);
		book.setBookTitle("Java Complete Reference");
		book.setBookPrice(750.50f);
		
		model.addAttribute("book", book);
		
		return "bookDetails";
	}
	
	@GetMapping("/books")	
	public String sendBooksDetails(Model model) {
		List<Book> books = BooksDAO.getAllBooks();
		
		model.addAttribute("books", books);
		
		return "booksDetail";
	}
}
