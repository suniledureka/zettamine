package com.zettamine.boot.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zettamine.boot.mvc.models.Product;

@Controller
@RequestMapping("/pms")
public class ProductController {
	@GetMapping(path = {"/","/entry"})	
	public String loadProductEntryForm(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		
		return "index";
	}
	
	@PostMapping(path = "saveproduct") //to bind HTTP POST Request
	public String handleSubmitButtonClick(Product product, Model model) {
		System.out.println(product);
		//logic to save data in data store
		
	//	model.addAttribute("product", new Product());
	//	model.addAttribute("message", "Product added to Stock!!!!");
		
		return "redirect:productsaved";
	}
	
	@GetMapping("/productsaved")
	public String productSavedSuccessfully(Model model) {
		
		model.addAttribute("product", new Product());
		model.addAttribute("message", "Product added to Stock!!!!");
		
		return "index";
	}
}
