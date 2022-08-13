package com.studentCollegeproject.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity(name = "sections")
@Table
public class Section {
	
	@Id
	private int sectionId;
	private String sectionName;
	
	@JsonIgnore
	@OneToMany(mappedBy = "section" , fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<StudentSection> studentSection = new ArrayList<>();
	
	
	public Section(int sectionId, String sectionName) {
		super();
		this.sectionId = sectionId;
		this.sectionName = sectionName;
	}

	public Section() {
		super();
	}

	public int getSectionId() {
		return sectionId;
	}

	public void setSectionId(int sectionId) {
		this.sectionId = sectionId;
	}
	public String getSectionName() {
		return sectionName;
	}
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	public List<StudentSection> getStudentSection() {
		return studentSection;
	}

	public void setStudentSection(List<StudentSection> studentSection) {
		this.studentSection = studentSection;
	}

	
	
	
	
}

