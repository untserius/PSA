package com.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.entity.Registration;

public interface RegistrationRepository extends CrudRepository<Registration, Long>{

}