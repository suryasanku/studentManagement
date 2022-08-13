package com.studentCollegeproject.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import com.studentCollegeproject.entities.Address;
import com.studentCollegeproject.entities.StudentSection;

public interface StudentSectionService {

	
	public StudentSection addStudentSection(StudentSection studentSection,Integer studentId,Integer sectionId);
	
	ArrayList<List<StudentSection>> getStudentSectionOfStudents(Integer studentId,Integer sectionId);
}

