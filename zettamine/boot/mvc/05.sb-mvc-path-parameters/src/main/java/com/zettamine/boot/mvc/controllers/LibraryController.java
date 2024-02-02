package com.zettamine.boot.mvc.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zettamine.boot.mvc.dao.BooksDAO;
import com.zettamine.boot.mvc.models.Book;

@Controller
@RequestMapping("/library")
public class LibraryController {
	@GetMapping(path = "/search/{isbn}")
	//@GetMapping(path = "/{isbn}/search")	
	//public String getBookById(@PathVariable("isbn") Integer isbn, Model model) {
	public String getBookById(@PathVariable Integer isbn, Model model) {
	//public String getBookById(@PathVariable(value = "isbn", required = false) Integer isbn, Model model) {
		List<Book> books = BooksDAO.getAllBooks();
		Optional<Book> optBook = books.stream().filter(bk->bk.getBookId().equals(isbn)).findFirst();
		if(optBook.isPresent()) {
			Book book = optBook.get();
			model.addAttribute("book", book);
		}else {
			if(isbn.equals(0))
				model.addAttribute("no_match", "please provide a valid isbn");
			else
				model.addAttribute("no_match", "no matching book found for book with id: "+isbn);
		}
	
		return "bookDetails";
	}
	
}
