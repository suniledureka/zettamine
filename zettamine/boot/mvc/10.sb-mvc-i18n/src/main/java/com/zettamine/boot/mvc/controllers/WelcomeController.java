package com.zettamine.boot.mvc.controllers;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	@Autowired
	private MessageSource messageSource;
	
	@RequestMapping("/welcome")
	public String showWelcomeMessage(Model model) {
		Locale locale = LocaleContextHolder.getLocale();
		System.out.println(locale.getCountry() + " - " + locale.getLanguage());
		
		String message = messageSource.getMessage("welcome.msg", null, "NA", locale); 
		model.addAttribute("data", message);
		return "index";
	}
}
