package com.studentCollegeproject.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentCollegeproject.entities.Project;
import com.studentCollegeproject.entities.Student;
import com.studentCollegeproject.repos.ProductRepo;
import com.studentCollegeproject.repos.StudentRepository;
import com.studentCollegeproject.services.ProjectService;

@Service
public class ProductServiceImpl implements ProjectService {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private ProductRepo projectRepo;

	@Override
	public Project addProject(Project project, Integer studentId) {

		Student student = this.studentRepository.findById(studentId).get();

		project.setStudent(student);

		Project project1 = this.projectRepo.save(project);

		// TODO Auto-generated method stub
		return project1;
	}

	@Override
	public List<Project> getProjectsOfStudents(Integer studentId) {

		Student student = this.studentRepository.findById(studentId).get();

		return this.projectRepo.findByStudent(student);
	}

	
}
