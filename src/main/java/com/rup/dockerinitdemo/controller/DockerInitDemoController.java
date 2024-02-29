package com.rup.dockerinitdemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rup.dockerinitdemo.dto.Employee;

@RestController
public class DockerInitDemoController {

	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return List.of(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0),
				new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0),
				new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
	}

}
