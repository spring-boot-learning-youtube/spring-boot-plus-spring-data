package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	List<Employee> findByNameContaining(String partialName);

	List<Employee> findByRoleContaining(String partialRole);
}
