package com.studentCollegeproject.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.studentCollegeproject.entities.Section;
import com.studentCollegeproject.repos.SectionRepo;
import com.studentCollegeproject.services.SectionService;



@Service
@Primary
public class SectionServiceImplJpa implements SectionService {

	@Autowired
	private SectionRepo sectionRepo;

	@Override
	public Section addSection(Section section) {
		Section savedSection = this.sectionRepo.save(section);
		return savedSection;
	}

	@Override
	public List<Section> getSections() {
		List<Section> sections = this.sectionRepo.findAll();
		return sections;
	}

	@Override
	public Section getSection(Integer sectionId) {

		Section section = this.sectionRepo.findById(sectionId).get();
		return section;
	}

	@Override
	public void deleteSection(Integer sectionId) {

		Section section = this.sectionRepo.findById(sectionId).get();
		this.sectionRepo.delete(section);

	}

	@Override
	public Section updateSection(Section section,Integer sectionId) {

		//section.setId(sectionId);
		Section updatedSection = this.sectionRepo.save(section);
		return updatedSection;
	}

//	@Override
//	public List<Section> getSection(String sectionName) {		
//		return this.sectionRepo.findByName(sectionName);
//	}
//
//	@Override
//	public List<Section> searchSectionByName(String sectionName) {
//		return this.sectionRepo.findByNameContainingIgnoreCase(sectionName);
//	}


	



}
