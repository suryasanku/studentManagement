package com.studentCollegeproject.services;

import java.util.List;

import com.studentCollegeproject.entities.Section;


public interface SectionService {
	//adding student
		Section addSection(Section section);
		
		List<Section> getSections();
		
		Section getSection(Integer sectionId);
		
		//List<Section> getSection(String name);
		
		void deleteSection(Integer sectionId);
		
		Section updateSection(Section section,Integer sectionId);
		
		//List<Section> searchSectionByName(String name);
		

}
