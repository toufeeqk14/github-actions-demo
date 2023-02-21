package com.cogni.action.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogni.action.model.Employee;
import com.cogni.action.repo.EmployeeRepository;

/**
 * Simple Employee Controller
 * 
 * @author 662501
 *
 */
@RestController
public class EmployeeController {

	private final EmployeeRepository repository;

	EmployeeController(EmployeeRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/employees")
	List<Employee> all() {
		//Sample comments
		return repository.findAll();
	}
}
