package com.webapp.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.dto.RegistrationDto;
import com.webapp.entity.Registration;
import com.webapp.exception.ResourceNotFound;
import com.webapp.repository.RegistrationRepository;

@RestController
@RequestMapping("/api/reg")
public class RestRegistrationController {
	
	@Autowired
	private RegistrationRepository registrationRepository;
	
	// http://localhost:8080/api/reg
	// @RequestMapping(method = RequestMethod.GET)
	@GetMapping
	public List<Registration> getAllRegistrations(){
		List<Registration> registrations = registrationRepository.findAll();
		return registrations;
	}
	
	@PostMapping
	public ResponseEntity<Object> createRegistration(@RequestBody Registration registration) {
		Registration savedRegistration = registrationRepository.save(registration);
		return new ResponseEntity<>(savedRegistration, HttpStatus.CREATED);
	}
	
	// http://localhost:8080/api/reg/12
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteRegistration(@PathVariable long id){
		registrationRepository.deleteById(id);
		return new ResponseEntity<>("Deleted!!", HttpStatus.OK);
	}
	
	// http://localhost:8080/api/reg/12
	@PutMapping
	public ResponseEntity<Registration> updateRegistration(@RequestParam long id, @RequestBody RegistrationDto dto){
		Registration registration = registrationRepository.findById(id).get();
		registration.setFirstName(dto.getFirstName());
		registration.setLastName(dto.getLastName());
		registration.setEmail(dto.getEmail());
		registration.setMobile(dto.getMobile());
		Registration savedRegistration = registrationRepository.save(registration);
		return new ResponseEntity<>(savedRegistration, HttpStatus.OK);
	}
	
	// http://localhost:8080/api/reg/2
	@GetMapping("/{id}")
	public ResponseEntity<?> getRegistrationById(@PathVariable long id){
		try {
			Optional<Registration> byId = registrationRepository.findById(id);
			Registration registration = null;
			return new ResponseEntity<>(registration, HttpStatus.OK);
		} catch (Exception e) {
			new ResourceNotFound("Registration not Found with id:" + id);
			return new ResponseEntity<>("Error", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
//	@PatchMapping("/registrations/{id}")
//    public ResponseEntity<Registration> updateRegistration(
//            @PathVariable long id,
//            @RequestBody Map<String, Object> partialUpdate,
//            @RequestParam(required = false) String firstName,
//            @RequestParam(required = false) String lastName,
//            @RequestParam(required = false) String email,
//            @RequestParam(required = false) ong mobile) {
//        
//        Registration registration = registrationRepository.findById(id).orElse(null);
//        
//        if (registration == null) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        
//        // Update fields from the PATCH request body
//        partialUpdate.forEach((key, value) -> {
//            switch (key) {
//                case "firstName":
//                    registration.setFirstName((String) value);
//                    break;
//                case "lastName":
//                    registration.setLastName((String) value);
//                    break;
//                case "email":
//                    registration.setEmail((String) value);
//                    break;
//                case "mobile":
//                    registration.setMobile((long) value);
//                    break;
//                default:
//                    // Ignore unknown fields
//                    break;
//            }
//        });
//        
//        // Update fields from request parameters if provided
//        if (firstName != null) {
//            registration.setFirstName(firstName);
//        }
//        if (lastName != null) {
//            registration.setLastName(lastName);
//        }
//        if (email != null) {
//            registration.setEmail(email);
//        }
//        if (mobile != null) {
//            registration.setMobile(mobile);
//        }
//        
//        Registration savedRegistration = registrationRepository.save(registration);
//        return new ResponseEntity<>(savedRegistration, HttpStatus.OK);
//    }
}

