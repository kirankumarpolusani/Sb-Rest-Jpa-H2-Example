package com.vtech.restjpah2.controller;

// Importing required classes
import javax.validation.Valid;

import com.vtech.restjpah2.model.Department;
import com.vtech.restjpah2.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Annotation
@RestController

// Class
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	// Save operation
	@PostMapping("/departments")
	public List<Department> saveDepartment(@Valid @RequestBody List<Department> departments) {
		List<Department> response = new ArrayList<>();
		departments.forEach(dept -> {
			response.add(departmentService.saveDepartment(dept));
		});
		return response;
	}

	// Read operation
	@GetMapping("/departments")
	public List<Department> fetchDepartmentList() {
		return departmentService.fetchDepartmentList();
	}

	// Read By Id operation
	@GetMapping("/departments/{id}")
	public Department fetchDepartmentById(@PathVariable("id") Long departmentId) {
		Optional<Department> optDept = departmentService.fetchDepartment(departmentId);
		return optDept.isPresent() ? optDept.get() : null;
	}

	// Update operation
	@PutMapping("/departments/{id}")
	public Department updateDepartment(@RequestBody Department department, @PathVariable("id") Long departmentId) {
		return departmentService.updateDepartment(department, departmentId);
	}

	// Delete operation
	@DeleteMapping("/departments/{id}")
	public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
		departmentService.deleteDepartmentById(departmentId);
		return "Deleted Successfully";
	}
}
