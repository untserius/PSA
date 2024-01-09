package com.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.entity.Registration;
import com.demo.repository.RegistrationRepository;

@SpringBootTest
class Demo2ApplicationTests {

	@Autowired
	private RegistrationRepository registrationRepository;
	
	@Test
	void createRegistration() {
		Registration reg = new Registration();
		reg.setName("mike");
		reg.setEmail("mike@gmail.com");
		reg.setCourse("Development");
		reg.setFee(10000);
		
		registrationRepository.save(reg);
	}

}
