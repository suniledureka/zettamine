package com.mars.boot.rest.controllers;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.mars.boot.rest.controllers.WelcomeRestController;
import com.mars.boot.rest.services.WelcomeService;

@WebMvcTest(value = WelcomeRestController.class)
class WelcomeRestControllerTest {
	@MockBean
	private WelcomeService welcomeService;

	@Autowired
	private MockMvc mockMvc; // used to send a request to REST API

	@Test
	void testShowWelcomeMessage() throws Exception {
		// define mock object behaviour
		Mockito.when(welcomeService.showWelcomeMsg()).thenReturn("Welcome to Zettamine..!!");
		/*
		// prepare http get request
		MockHttpServletRequestBuilder reqBuilder = MockMvcRequestBuilders.get("/welcome");

		// send request
		ResultActions perform = mockMvc.perform(reqBuilder);

		// hold the response
		MvcResult mvcResult = perform.andReturn();

		// validate response
		MockHttpServletResponse response = mvcResult.getResponse();
		
		String responseText = response.getContentAsString();
		int status = response.getStatus();
		System.out.println(responseText);
		System.out.println(status);
		
		//assertNotNull(responseText);
		assertEquals(200, status);
		*/
		
		mockMvc.perform(MockMvcRequestBuilders.get("/welcome"))
 		  .andExpect(MockMvcResultMatchers.status().isOk());
	}

}
