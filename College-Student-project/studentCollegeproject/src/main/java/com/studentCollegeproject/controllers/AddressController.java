package com.studentCollegeproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentCollegeproject.entities.Address;
import com.studentCollegeproject.services.AddressService;

@CrossOrigin("*")
@RestController
@RequestMapping("/students/{studentId}")
public class AddressController {

	@Autowired
	private AddressService addressService;

	@PostMapping("/address")
	public ResponseEntity<?> addAddress(@PathVariable Integer studentId, @RequestBody Address address) {
		Address addAddress = this.addressService.addAddress(address, studentId);
		return ResponseEntity.ok(addAddress);
	}

	@GetMapping("/address")
	public ResponseEntity<List<Address>> getAllByStudent(@PathVariable Integer studentId) {
		return ResponseEntity.ok(this.addressService.getAddresssOfStudents(studentId));
	}
//	@DeleteMapping("/address/{id}")
//	public ResponseEntity<?> deleteAddress(@PathVariable Integer studentId,@RequestBody Address address) {
//		Address deleteAddress = this.addressService.deleteAddress(address,studentId);
//		return ResponseEntity.ok(deleteAddress);
//	}

}
