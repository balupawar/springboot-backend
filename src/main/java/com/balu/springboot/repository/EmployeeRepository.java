package com.balu.springboot.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.balu.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
}
