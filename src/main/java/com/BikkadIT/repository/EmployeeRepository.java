package com.BikkadIT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkadIT.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
