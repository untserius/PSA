package com.demo;

import java.util.Optional;

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
		reg.setName("yuta");
		reg.setEmail("yuta@gmail.com");
		reg.setCourse("Golang");
		reg.setFee(22000);
		reg.setMobile(2332442541L);
		
		registrationRepository.save(reg);
	}
	
	@Test
	void deleteRegistration() {
		registrationRepository.deleteById(2);
	}
	
	@Test
	void getAllRegistration() {
		Iterable<Registration> registrations = registrationRepository.findAll();
		for (Registration e : registrations) {
			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getCourse());
			System.out.println(e.getEmail());
			System.out.println(e.getId());
		}
	}
	
	@Test
	void getRegistrationById() {
		Optional<Registration> byId = registrationRepository.findById(10);
		if(byId.isPresent()) {
			Registration reg = byId.get();
			System.out.println(reg.getId());
			System.out.println(reg.getName());
			System.out.println(reg.getCourse());
			System.out.println(reg.getEmail());
			System.out.println(reg.getFee());
		} else {			
			System.out.println("Record not found!");
		}
	}
	
	@Test
	void checkRegistrationExistsByEmail() {
		boolean val = registrationRepository.existsByEmail("adam@gmaildfhb.com");
		System.out.println(val);
	}
	
	@Test
	void checkRegistrationExistsById() {
		boolean val = registrationRepository.existsById(1);
		System.out.println(val);
	}
	
	@Test
	void checkRegistrationExistsByMobile() {
		boolean val = registrationRepository.existsByMobile(9666944641L);
		System.out.println(val);
	}
	
	@Test
	void getRegistrationExistsByEmail() {
		Optional<Registration> val = registrationRepository.findByEmail("sukuna@gmail.com");	
		if(val.isPresent()) {
			Registration reg = val.get();
			System.out.println(reg.getId());
			System.out.println(reg.getName());
			System.out.println(reg.getCourse());
			System.out.println(reg.getEmail());
			System.out.println(reg.getFee());
			System.out.println(reg.getMobile());
		} else {
			System.out.println("Record not found!!");
		}
	}
	
	@Test
	void getRegistrationExistsByMobile() {
		Optional<Registration> val = registrationRepository.findByMobile(9666949321L);	
		if(val.isPresent()) {
			Registration reg = val.get();
			System.out.println(reg.getId());
			System.out.println(reg.getName());
			System.out.println(reg.getCourse());
			System.out.println(reg.getEmail());
			System.out.println(reg.getFee());
			System.out.println(reg.getMobile());
		} else {
			System.out.println("Record not found!!");
		}
	}
	
	@Test
	void getRegistrationsByCourse() {
		Iterable<Registration> regs = registrationRepository.findByCourse("Java");
		for (Registration registration : regs) {
			System.out.println(registration.getId());
			System.out.println(registration.getName());
			System.out.println(registration.getCourse());
			System.out.println(registration.getEmail());
			System.out.println(registration.getFee());
			System.out.println(registration.getMobile());
		}
	}
	
	@Test
	void getRegistrationsByEmailAndMobile() {
		Optional<Registration> byEmailAndMobile = registrationRepository.findByEmailAndMobile("gojosatoru@gmail.com", 9663344641L);
		Registration registration = byEmailAndMobile.get();
			System.out.println(registration.getId());
			System.out.println(registration.getName());
			System.out.println(registration.getCourse());
			System.out.println(registration.getEmail());
			System.out.println(registration.getFee());
			System.out.println(registration.getMobile());
	}
	
	@Test
	void getRegistrationsByEmailOrMobile() {
		Iterable<Registration> regs = registrationRepository.findByEmailOrMobile("serius@gmail.com", 9666944641L);
		for (Registration registration : regs) {
			System.out.println(registration.getId());
			System.out.println(registration.getName());
			System.out.println(registration.getCourse());
			System.out.println(registration.getEmail());
			System.out.println(registration.getFee());
			System.out.println(registration.getMobile());
		}
	}
}
