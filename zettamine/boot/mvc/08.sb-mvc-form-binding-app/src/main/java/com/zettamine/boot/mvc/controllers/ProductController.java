package com.zettamine.boot.mvc.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zettamine.boot.mvc.models.Product;

import jakarta.validation.Valid;

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
	public String handleSubmitButtonClick(@Valid Product product, BindingResult validationErrors, Model model) {
		if(validationErrors.hasErrors()) {
			System.out.println(validationErrors.getFieldErrorCount());
			List<ObjectError> errors = validationErrors.getAllErrors();
			for(ObjectError err : errors) {
				System.out.println(err.getDefaultMessage());
			}
			return "index";
		}
		System.out.println(product);
		//logic to save data in data store
		
		return "redirect:productsaved";
	}
	
	@GetMapping("/productsaved")
	public String productSavedSuccessfully(Model model) {
		
		model.addAttribute("product", new Product());
		model.addAttribute("message", "Product added to Stock!!!!");
		
		return "index";
	}
}
