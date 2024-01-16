package com.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webapp.entity.Registration;

@Controller
public class RegistrationController {
	
	//Handler Methods
	//http://localhost:8080/view_registration
	
	@RequestMapping("/view_registration")
	public String viewRegistrationPage() {
		return "new_registration"; //Request Dispatcher
	}
	
	@RequestMapping("/saveReg")
	public String saveRegistration(Registration registration) {
		System.out.println(registration.getFirstName());
		System.out.println(registration.getLastName());
		System.out.println(registration.getEmail());
		System.out.println(registration.getMobile());
		return "new_registration";
	}
}
