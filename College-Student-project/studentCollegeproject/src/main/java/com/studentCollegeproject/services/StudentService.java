package com.studentCollegeproject.services;

import java.util.List;

import com.studentCollegeproject.entities.Student;


public interface StudentService {
	
	//adding student
	Student addStudent(Student student);
	
	List<Student> getStudents();
	
	Student getStudent(Integer studentId);
	
	List<Student> getStudent(String name);
	
	void deleteStudent(Integer studentId);
	
	Student updateStudent(Student student,Integer studentId);
	
	List<Student> searchStudentByName(String name);
	
	

}
