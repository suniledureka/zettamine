package com.mars.boot.rest.repository;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.mars.boot.rest.entity.User;

@DataJpaTest
class UserRepositoryTest {
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private TestEntityManager entityManager;
	

	@Test
	void testSave() {
		User user = new User();
		user.setFirstName("Sunil");
		user.setLastName("Joseph");
		//User savedUser = entityManager.persist(user);
		User savedUser = entityManager.persist(user);
		entityManager.flush();
//		System.out.println(savedUser);
		assertNotNull(savedUser);
	}

	@Test
	void testFindById() {
		User user = new User();
		user.setFirstName("Sunil");
		user.setLastName("Joseph");
		User savedUser = entityManager.persist(user);
		entityManager.flush();
		Optional<User> optUser = userRepo.findById(1);
		System.out.println(optUser.isPresent());
		assertTrue(optUser.isPresent());
	}

}
