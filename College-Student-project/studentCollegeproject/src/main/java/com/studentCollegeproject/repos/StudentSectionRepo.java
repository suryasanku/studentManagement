package com.studentCollegeproject.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentCollegeproject.entities.Section;
import com.studentCollegeproject.entities.Student;
import com.studentCollegeproject.entities.StudentSection;

public interface StudentSectionRepo extends JpaRepository<StudentSection, Integer> {

	List<StudentSection> findByStudent(Student student);
	List<StudentSection> findBySection(Section section);
	
	
}
