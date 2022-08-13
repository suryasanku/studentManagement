package com.studentCollegeproject.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.studentCollegeproject.entities.Student;
import com.studentCollegeproject.repos.StudentRepository;
import com.studentCollegeproject.services.StudentService;


@Service
@Primary
public class StudentServiceImplJpa implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student addStudent(Student student) {
		Student savedStudent = this.studentRepository.save(student);
		return savedStudent;
	}

	@Override
	public List<Student> getStudents() {
		List<Student> students = this.studentRepository.findAll();
		return students;
	}

	@Override
	public Student getStudent(Integer studentId) {

		Student student = this.studentRepository.findById(studentId).get();
		return student;
	}

	@Override
	public void deleteStudent(Integer studentId) {

		Student student = this.studentRepository.findById(studentId).get();
		this.studentRepository.delete(student);

	}

	@Override
	public Student updateStudent(Student student, Integer studentId) {

		student.setId(studentId);
		Student updatedStudent = this.studentRepository.save(student);
		return updatedStudent;
	}

	@Override
	public List<Student> getStudent(String name) {		
		return this.studentRepository.findByName(name);
	}

	@Override
	public List<Student> searchStudentByName(String name) {
		return this.studentRepository.findByNameContainingIgnoreCase(name);
	}

}
