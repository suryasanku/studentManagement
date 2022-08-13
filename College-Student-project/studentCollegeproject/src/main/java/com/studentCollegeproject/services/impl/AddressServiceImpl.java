package com.studentCollegeproject.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentCollegeproject.entities.Address;
import com.studentCollegeproject.entities.Student;
import com.studentCollegeproject.repos.AddressRepo;
import com.studentCollegeproject.repos.StudentRepository;
import com.studentCollegeproject.services.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private AddressRepo addressRepo;

	@Override
	public Address addAddress(Address address, Integer studentId) {

		Student student = this.studentRepository.findById(studentId).get();

		address.setStudent(student);

		Address address1 = this.addressRepo.save(address);

		// TODO Auto-generated method stub
		return address1;
	}

	@Override
	public List<Address> getAddresssOfStudents(Integer studentId) {

		Student student = this.studentRepository.findById(studentId).get();

		return this.addressRepo.findByStudent(student);
	}

//	@Override
//	public Address deleteAddress(Address address, Integer studentId) {
//		
//		return null;
//	}

	

}
