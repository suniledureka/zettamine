package com.zettamine.boot.mvc.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomErrorHandler {
	@ExceptionHandler(value = RuntimeException.class)
	public String handleRuntimeException(Exception ex, Model model) {
		System.out.println(ex.toString());
		model.addAttribute("err_msg", ex.toString());
		return "error";
	}
}
