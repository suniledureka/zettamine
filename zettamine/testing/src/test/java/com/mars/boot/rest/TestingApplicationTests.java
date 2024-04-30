package com.mars.boot.rest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mars.boot.rest.controllers.WelcomeRestController;
import com.mars.boot.rest.services.WelcomeService;

@SpringBootTest
class TestingApplicationTests {
	@Autowired
	WelcomeRestController controller;

	@Autowired
	WelcomeService service;

	@Test
	void contextLoads() {
		Assertions.assertThat(controller).isNotNull();
		Assertions.assertThat(service).isNotNull();
	}

}
