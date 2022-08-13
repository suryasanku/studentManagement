package com.studentCollegeproject.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="student_in_section")
public class StudentSection {
	@Id
	private int studentSectionId;
	private String session;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="Student_id")
	private Student student;
	
	@ManyToOne
	@JoinColumn(name="Section_id")
	private Section section;
	
	
	
	public StudentSection(int studentSectionId, String session) {
		super();
		this.studentSectionId = studentSectionId;
		this.session = session;
	}
	public StudentSection() {
		super();
		
	}


	public int getStudentSectionId() {
		return studentSectionId;
	}

	public void setStudentSectionId(int studentSectionId) {
		this.studentSectionId = studentSectionId;
	}

	

	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
		
	}
	
	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}


	

}
