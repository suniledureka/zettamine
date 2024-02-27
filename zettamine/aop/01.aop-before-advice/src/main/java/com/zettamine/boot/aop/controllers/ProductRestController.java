package com.zettamine.boot.aop.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zettamine.boot.aop.models.Product;
import com.zettamine.boot.aop.services.ProductServices;

@RestController
public class ProductRestController {
	private ProductServices pService;

	public ProductRestController(ProductServices pService) {
		super();
		this.pService = pService;
	}
	
	@PostMapping(path = "/pms/save")
	public Product saveProduct(@RequestParam("productId") Integer productId, @RequestParam("productName") String productName, @RequestParam("productPrice") Float productPrice) {
		return pService.saveProduct(productId, productName, productPrice);
	}
	
	@DeleteMapping("/pms/delete/{pid}")
	public String removeProduct(@PathVariable("pid") Integer productId) {
		pService.deleteProductById(productId);
		return "Product Removed from Catalog";
	}
}
