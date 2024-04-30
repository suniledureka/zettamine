package com.mars.boot.rest.services;

import org.springframework.stereotype.Service;

@Service
public class WelcomeServiceImpl implements WelcomeService {

	@Override
	public String showWelcomeMsg() {
		return "Welcome to Unit Testing";
	}

}
