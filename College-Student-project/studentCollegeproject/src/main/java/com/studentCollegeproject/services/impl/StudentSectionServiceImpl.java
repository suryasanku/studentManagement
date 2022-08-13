package com.studentCollegeproject.services.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentCollegeproject.entities.Section;
import com.studentCollegeproject.entities.Student;
import com.studentCollegeproject.entities.StudentSection;
import com.studentCollegeproject.repos.SectionRepo;
import com.studentCollegeproject.repos.StudentRepository;
import com.studentCollegeproject.repos.StudentSectionRepo;

import com.studentCollegeproject.services.StudentSectionService;

@Service
public class StudentSectionServiceImpl implements StudentSectionService {

	@Autowired
	private StudentRepository studentRepository;
	
	

	@Autowired
	private  StudentSectionRepo studentSectionRepo;
	
	@Autowired
	private  SectionRepo sectionRepo;

	
	@Override
	public StudentSection addStudentSection(StudentSection studentSection, Integer studentId,Integer sectionId) {

		Student student = this.studentRepository.findById(studentId).get();
		Section section = this.sectionRepo.findById(sectionId).get();

		studentSection.setStudent(student);
		studentSection.setSection(section);

		StudentSection studentSection1 = this.studentSectionRepo.save(studentSection);

		// TODO Auto-generated method stub
		return studentSection1;
	}

	@Override
	public ArrayList<List<StudentSection>> getStudentSectionOfStudents(Integer studentId,Integer sectionId) {
		Student student = this.studentRepository.findById(studentId).get();
		Section section = this.sectionRepo.findById(sectionId).get();

		List<StudentSection> student1= this.studentSectionRepo.findByStudent(student);
		List<StudentSection> section1= this.studentSectionRepo.findBySection(section);
		
		ArrayList<List<StudentSection>> ssList = new ArrayList<>();
		ssList.add(student1);
		ssList.add(section1);
		return ssList;
		
	}

}
