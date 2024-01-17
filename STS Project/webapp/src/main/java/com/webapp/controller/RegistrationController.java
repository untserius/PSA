package com.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.webapp.entity.Registration;
import com.webapp.service.RegistrationService;

@Controller
public class RegistrationController {
	
	@Autowired
	private RegistrationService registrationService;
	//Handler Methods
	//http://localhost:8080/view_registration
	
	@RequestMapping("/view_registration")
	public String viewRegistrationPage() {
		return "new_registration"; //Request Dispatcher
	}
	
	@RequestMapping("/saveReg")
	public String saveRegistration(
			@RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName,
			@RequestParam("email") String email,
			@RequestParam("mobile") long mobile
			) 
	{
		Registration reg = new Registration();
		reg.setFirstName(firstName);
		reg.setLastName(lastName);
		reg.setEmail(email);
		reg.setMobile(mobile);
		registrationService.createRegistration(reg);
		return "new_registration";
	}
}
