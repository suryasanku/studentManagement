package com.studentCollegeproject.services;

import java.util.List;


import com.studentCollegeproject.entities.Address;

public interface AddressService {

	
	public Address addAddress(Address laptop,Integer studentId);
	
	List<Address> getAddresssOfStudents(Integer studentId);

//	Address deleteAddress(Address address, Integer studentId);

	//public Address deleteAddress(Address address, Integer studentId);

	//public Address deleteAddress(Address address, Integer studentId);
}

