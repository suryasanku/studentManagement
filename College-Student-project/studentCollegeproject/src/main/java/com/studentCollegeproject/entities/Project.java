package com.studentCollegeproject.entities;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table
public class Project {
	
	@Id
	int projectId;
	String projectTitle;
	String projectTech;
	int maxMarks;
	String mentorName;
	
	//@JsonIgnore
	@ManyToOne
	private Student student;

	public Project() {
		super();
	}
	public Project(int projectId, String projectTitle, String projectTech, int maxMarks, String mentorName) {
		super();
		this.projectId = projectId;
		this.projectTitle = projectTitle;
		this.projectTech = projectTech;
		this.maxMarks = maxMarks;
		this.mentorName = mentorName;
	}
	
	


	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectTitle() {
		return projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}

	public String getProjectTech() {
		return projectTech;
	}

	public void setProjectTech(String projectTech) {
		this.projectTech = projectTech;
	}

	public int getMaxMarks() {
		return maxMarks;
	}

	public void setMaxMarks(int maxMarks) {
		this.maxMarks = maxMarks;
	}

	public String getMentorName() {
		return mentorName;
	}

	public void setMentorName(String mentorName) {
		this.mentorName = mentorName;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	

}

