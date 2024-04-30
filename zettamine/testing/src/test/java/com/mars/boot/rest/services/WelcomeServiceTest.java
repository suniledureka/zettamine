package com.mars.boot.rest.services;

import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.anyInt;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.mars.boot.rest.repository.UserRepository;
@SpringBootTest
class WelcomeServiceTest {
	@Mock
	private UserRepository userRepo;
	
	@InjectMocks
	private WelcomeServiceImpl service;
	
	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks(this);
	}
	
	
	@Test
	void testShowWelcomeMsg() {
		Mockito.when(userRepo.findById(anyInt())).thenReturn(Optional.empty());
		
	}

}
