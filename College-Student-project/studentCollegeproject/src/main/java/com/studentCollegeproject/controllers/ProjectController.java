package com.studentCollegeproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentCollegeproject.entities.Project;
import com.studentCollegeproject.services.ProjectService;

@RestController
@RequestMapping("/students/{studentId}")
public class ProjectController {

	@Autowired
	private ProjectService productService;

	@PostMapping("/projects")
	public ResponseEntity<?> addProject(@PathVariable Integer studentId, @RequestBody Project project) {
		Project addProject = this.productService.addProject(project, studentId);
		return ResponseEntity.ok(addProject);
	}

	@GetMapping("/projects")
	public ResponseEntity<List<Project>> getAllByStudent(@PathVariable Integer studentId) {
		return ResponseEntity.ok(this.productService.getProjectsOfStudents(studentId));
	}

}
