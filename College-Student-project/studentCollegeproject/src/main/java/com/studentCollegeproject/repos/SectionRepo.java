package com.studentCollegeproject.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.studentCollegeproject.entities.Section;


public interface SectionRepo extends JpaRepository<Section, Integer> {
	
//	List<Section> findByName(String sectionName);
//
//	List<Section> findByNameContainingIgnoreCase(final String sectionName);
//	
	//HQL: 
	//JPQL:

	//@Query("Select s FROM Student s WHERE s.id = :userId AND s.name = :userName" )
	
//	@Query("Select s FROM sections s where s.sectionName like %:sectionName%")
//	List<Section> getAllUsers(@Param("sectionName") String sectionName);
//	

}
