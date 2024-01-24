package com.webapp.controller;

import java.util.List;
import java.util.Optional;

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
	
//	@RequestMapping("/updateReg")
//	public String updateRegistration(RegistrationDto registrationDto, ModelMap model) {
//		
//		Registration reg = new Registration();
//		reg.setFirstName(registrationDto.getFirstName());
//		reg.setLastName(registrationDto.getLastName());
//		reg.setEmail(registrationDto.getEmail());
//		reg.setMobile(registrationDto.getMobile());
//		
//		registrationService.updateRegistration(reg);
//		model.addAttribute("msg", "Record is saved!!");
//		return "update_registration";
//	}	
	
	//http://localhost:8080/all-registrations
	@RequestMapping("all-registrations")
	public String getAllRegistrations(Model model) {
		List<Registration> reg = registrationService.getRegistrations();
		model.addAttribute("registrations", reg);
		return "all_registrations";
	}
	
	//http://localhost:8080/delete-registrations?id=1 
	@RequestMapping("/delete-registration")
	public String deleteRegistration(@RequestParam long id, Model model) {
		registrationService.deleteRegistration(id);
		List<Registration> reg = registrationService.getRegistrations();
		model.addAttribute("registrations", reg);
		return "all_registrations";
	}
	
	//http://localhost:8080/update-registrations
	@RequestMapping("/update-registration")
	public String updateRegistration(@RequestParam long id, Model model) {
		Registration registration = registrationService.getRegistrationById(id);
		model.addAttribute("registration", registration);
		return "update_registration";
	}
	
	
	@RequestMapping("/updateRegRecord")
	public String updateRegRecord(RegistrationDto dto, Model model) {
		
		Registration registration = new Registration();		
		registration.setId(dto.getId());
		registration.setFirstName(dto.getFirstName());
		registration.setLastName(dto.getLastName());
		registration.setEmail(dto.getEmail());
		registration.setMobile(dto.getMobile());
		
		registrationService.updateRegRecord(registration);
		
		List<Registration> reg = registrationService.getRegistrations();
		model.addAttribute("registrations", reg);
		return "all_registrations";
	}
//	@RequestMapping("/updateReg")
//	public String updateOneRegistration(@ModelAttribute("registration")Registration registration, Model model) {
//		registrationService.createRegistration(registration);
//		List<Registration> registrations = registrationService.getRegistrations();
//		model.addAttribute("registrations", registrations);
//		System.out.println(registrations);
//		return "all_registrations";
//	}
}
