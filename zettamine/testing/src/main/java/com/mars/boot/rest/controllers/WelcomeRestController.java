package com.mars.boot.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mars.boot.rest.services.WelcomeService;
@RestController
public class WelcomeRestController {
	private WelcomeService welService;
	
	public WelcomeRestController(WelcomeService welService) {
		super();
		this.welService = welService;
	}

	@GetMapping("/welcome")
	public ResponseEntity<String> showWelcomeMessage(){
		String msg = welService.showWelcomeMsg();
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
}
