package com.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.webapp.dto.RegistrationDto;
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
	public String saveRegistration(RegistrationDto registrationDto, ModelMap model) {
		
		Registration reg = new Registration();
		reg.setFirstName(registrationDto.getFirstName());
		reg.setLastName(registrationDto.getLastName());
		reg.setEmail(registrationDto.getEmail());
		reg.setMobile(registrationDto.getMobile());
		
		registrationService.createRegistration(reg);
		model.addAttribute("msg", "Record is saved!!");
		return "new_registration";
	}
	
	//http://localhost:8080/all-registrations
	@RequestMapping("all-registrations")
	public String getAllRegistrations(Model model) {
		List<Registration> reg = registrationService.getRegistrations();
		model.addAttribute("registrations", reg);
		return "all_registrations";
	}
}
