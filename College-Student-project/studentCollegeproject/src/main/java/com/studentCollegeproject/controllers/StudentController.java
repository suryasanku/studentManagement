package com.studentCollegeproject.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.studentCollegeproject.entities.Student;
import com.studentCollegeproject.services.StudentService;

@CrossOrigin("http://localhost:3001")
@RestController
@RequestMapping("/api/students/")
public class StudentController {

	@Autowired
	private StudentService studentService;

	// create
	// @RequestMapping(value = "/", method = RequestMethod.POST)
	@PostMapping()
	public ResponseEntity<Student> createStudent(@RequestBody Student student) {
		// add student:
		Student addedStudent = studentService.addStudent(student);
		return new ResponseEntity<Student>(addedStudent, HttpStatus.CREATED);

	}

	// get - all
	@GetMapping("all")
	public ResponseEntity<List<Student>> getStudent() {
		return new ResponseEntity<List<Student>>(studentService.getStudents(), HttpStatus.OK);
	}

	// get -single student
	@GetMapping("{studentId}")
	public ResponseEntity<Student> getStudent(@PathVariable Integer studentId) {

		Student student = this.studentService.getStudent(studentId);
		return new ResponseEntity<Student>(student, HttpStatus.OK);

	}

	// get -single student
	@GetMapping("/name/{studentName}")
	public ResponseEntity<List<Student>> getStudent(@PathVariable String studentName) {
		List<Student> student = this.studentService.getStudent(studentName);
		return new ResponseEntity<List<Student>>(student, HttpStatus.OK);

	}

	// get -single student
	@GetMapping("/search/{keyword}")
	public ResponseEntity<List<Student>> searchStudentByName(@PathVariable String keyword) {
		
		System.out.println(keyword);
		List<Student> students = this.studentService.searchStudentByName(keyword);
		return new ResponseEntity<List<Student>>(students, HttpStatus.OK);

	}

	// delete

	@DeleteMapping("delete/{studentId}")
	public ResponseEntity<Map<String, Object>> deleteStudent(@PathVariable Integer studentId) {
		this.studentService.deleteStudent(studentId);
		return new ResponseEntity<>(Map.of("message", "student deleted successfully"), HttpStatus.OK);
	}

	// update

	@PutMapping("update/{studentId}")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student, @PathVariable Integer studentId) {
		Student updateStudent = this.studentService.updateStudent(student, studentId);
		return ResponseEntity.ok(updateStudent);

	}
}
