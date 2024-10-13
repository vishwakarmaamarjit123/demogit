package com.ty.spring.springdbprac;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
	List<Student> findByPrice(double price);
	
}
