package com.vtech.restjpah2.service;

// Importing required classes
import com.vtech.restjpah2.model.Department;

import java.util.List;
import java.util.Optional;

// Interface
public interface DepartmentService {

	// Save operation
	Department saveDepartment(Department department);

	// Read operation
	List<Department> fetchDepartmentList();

	// Get operation
	Optional<Department> fetchDepartment(Long departmentId);

	// Update operation
	Department updateDepartment(Department department, Long departmentId);

	// Delete operation
	void deleteDepartmentById(Long departmentId);
}
