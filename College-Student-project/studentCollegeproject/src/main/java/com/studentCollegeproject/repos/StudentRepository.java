package com.studentCollegeproject.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.studentCollegeproject.entities.Student;



public interface StudentRepository extends JpaRepository<Student, Integer> {

	List<Student> findByName(String name);

	List<Student> findByNameContainingIgnoreCase(final String name);
	
	//HQL: 
	//JPQL:

	//@Query("Select s FROM Student s WHERE s.id = :userId AND s.name = :userName" )
	
	@Query("Select s FROM students s where s.name like %:name%")
	List<Student> getAllUsers(@Param("name") String name);
	
	
	//1. Defaults method provided by JpaRepository
	
	//2. We can define our own custom finder methods for selecting data.	

	//3. We can JPQL with method inside Repository for fetch data .
}
