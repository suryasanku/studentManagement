package com.studentCollegeproject.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.studentCollegeproject.entities.Section;
import com.studentCollegeproject.services.SectionService;



@RestController
@RequestMapping("/sections")
public class SectionController {

	@Autowired
	private SectionService sectionService;

	// create
	// @RequestMapping(value = "/", method = RequestMethod.POST)
	@PostMapping("/")
	public ResponseEntity<Section> createSection(@RequestBody Section section) {
		// add section:
		Section addedSection = sectionService.addSection(section);
		return new ResponseEntity<Section>(addedSection, HttpStatus.CREATED);

	}

	// get - all
	@GetMapping("/")
	public ResponseEntity<List<Section>> getSection() {
		return new ResponseEntity<List<Section>>(sectionService.getSections(), HttpStatus.OK);
	}

	// get -single student
	@GetMapping("/{sectionId}")
	public ResponseEntity<Section> getSection(@PathVariable Integer sectionId) {

		Section section = this.sectionService.getSection(sectionId);
		return new ResponseEntity<Section>(section, HttpStatus.OK);

	}

//	// get -single student
//	@GetMapping("/name/{sectionName}")
//	public ResponseEntity<List<Section>> getSection(@PathVariable String sectionName) {
//		List<Section> section = this.sectionService.getSection(sectionName);
//		return new ResponseEntity<List<Section>>(section, HttpStatus.OK);
//
//	}

//	// get -single student
//	@GetMapping("/search/{keyword}")
//	public ResponseEntity<List<Student>> searchStudentByName(@PathVariable String keyword) {
//		
//		System.out.println(keyword);
//		List<Student> students = this.sectionService.searchSectionByName(keyword);
//		return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
//
//	}

	// delete

	@DeleteMapping("/{sectionId}")
	public ResponseEntity<Map<String, Object>> deleteSection(@PathVariable Integer sectionId) {
		this.sectionService.deleteSection(sectionId);
		return new ResponseEntity<>(Map.of("message", "section deleted successfully"), HttpStatus.OK);
	}

	// update

	@PutMapping("/{sectionId}")
	public ResponseEntity<Section> updateSection(@RequestBody Section section, @PathVariable Integer sectionId) {
		Section updateSection = this.sectionService.updateSection(section, sectionId);
		return ResponseEntity.ok(updateSection);

	}
}
