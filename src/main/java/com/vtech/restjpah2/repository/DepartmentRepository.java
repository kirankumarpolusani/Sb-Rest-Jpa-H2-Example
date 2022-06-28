package com.vtech.restjpah2.repository;

import com.vtech.restjpah2.model.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// Annotation
@Repository

// Interface extending CrudRepository
public interface DepartmentRepository extends CrudRepository<Department, Long> {
}
