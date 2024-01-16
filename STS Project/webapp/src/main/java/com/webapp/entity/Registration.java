package com.webapp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "registrations")
public class Registration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name", length = 10, nullable = false)
	private String firstName;
	@Column(name = "last_name", length = 10, nullable = false)
	private String lastName;
	@Column(name = "email", length = 128, nullable = false, unique = true)
	private String email;
	@Column(name = "mobile", nullable = false, unique = true)
	private long mobile;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
}
