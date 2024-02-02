package com.zettamine.boot.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/pms")
public class ProductController {
	
	@GetMapping(path = {"/", "/entry"})
	public String productEntryForm() {
		return "index";
	}
	
	@PostMapping("/saveproduct")
	public String handleSubmitButtonClick(HttpServletRequest request, Model model) {
		String prodId = request.getParameter("pid");
		String prodName = request.getParameter("pname");
		String prodPrice = request.getParameter("pprice");
		
		model.addAttribute("message", "Product:"+prodName+" added to Stock");
		model.addAttribute("pid", prodId);
		model.addAttribute("pname", prodName);
		model.addAttribute("pprice", prodPrice);
		
		return "success";
	}
}
