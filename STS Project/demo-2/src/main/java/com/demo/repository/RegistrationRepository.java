package com.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.demo.entity.Registration;

public interface RegistrationRepository extends CrudRepository<Registration, Integer>{
	
	boolean existsByEmail(String email);
	boolean existsByMobile(long mobile);
	Optional<Registration> findByEmail(String email);
	Optional<Registration> findByMobile(long email);
}