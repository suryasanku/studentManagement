package com.studentCollegeproject.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentCollegeproject.entities.Address;
import com.studentCollegeproject.entities.Student;

public interface AddressRepo extends JpaRepository<Address, Integer> {

	List<Address> findByStudent(Student student);
	
}
