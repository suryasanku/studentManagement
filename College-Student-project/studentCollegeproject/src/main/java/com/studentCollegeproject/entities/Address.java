package com.studentCollegeproject.entities;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Address {

	@Id
	private int id;
	private String street;
	private String city;
	private String country;
	private String pinCode;
	
	//@JsonIgnore
	@ManyToOne
	private Student student;
	
	


	public Address(int id, String street, String city, String country, String pinCode) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.country = country;
		this.pinCode = pinCode;
	}


	public Address() {
		super();
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	

}
