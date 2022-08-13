package com.studentCollegeproject.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentCollegeproject.entities.Project;
import com.studentCollegeproject.entities.Student;


public interface ProductRepo extends JpaRepository<Project, Integer> {

	List<Project> findByStudent(Student student);
	
}
