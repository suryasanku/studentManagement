package com.studentCollegeproject.services;

import java.util.List;

import com.studentCollegeproject.entities.Project;

public interface ProjectService {

	
	public Project addProject(Project laptop,Integer studentId);
	
	List<Project> getProjectsOfStudents(Integer studentId);
}

