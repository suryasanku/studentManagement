package com.studentCollegeproject.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentCollegeproject.entities.Address;
import com.studentCollegeproject.entities.StudentSection;
import com.studentCollegeproject.services.AddressService;
import com.studentCollegeproject.services.StudentSectionService;

@RestController
@RequestMapping("/students/{studentId}/sections/{sectionId}")
public class StudentSectionController {

	@Autowired
	private StudentSectionService studentSectionService;

	@PostMapping("/studentsection")
	public ResponseEntity<?> addStudentSection(@PathVariable Integer studentId, @PathVariable Integer sectionId, @RequestBody StudentSection studentSection) {
		StudentSection addStudentSection = this.studentSectionService.addStudentSection(studentSection, studentId, sectionId);
		return ResponseEntity.ok(addStudentSection);
	}

	@GetMapping("/studentsection")
	public ResponseEntity<ArrayList<List<StudentSection>>> getAllByStudent(@PathVariable Integer studentId, @PathVariable Integer sectionId) {
		return ResponseEntity.ok(this.studentSectionService.getStudentSectionOfStudents(studentId,sectionId));
	}

}
