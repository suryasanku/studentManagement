package com.studentCollegeproject.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "students")
@Table(name = "students")
public class Student {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "student_name", length = 500, nullable = false)
	private String name;

	private String phone;

	
	@JsonIgnore
	@OneToMany(mappedBy = "student", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<Project> project = new HashSet<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "student", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Address> address = new ArrayList<>();
	
	//@JsonIgnore
	@OneToMany(mappedBy = "student", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<StudentSection> studentSection = new HashSet<>();
  
	public Student(Integer id, String name, String phone) {
		super();
		this.id = id;
 		this.name = name;
		this.phone = phone;
	}

	public Student() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	

	public Set<Project> getProject() {
		return project;
	}

	public void setProject(Set<Project> project) {
		this.project = project;
	}

	public Set<StudentSection> getStudentSection() {
		return studentSection;
	}
	
	public void setStudentSection(Set<StudentSection> studentSection) {
		this.studentSection = studentSection;
	}
	
	

}
