package com.BikkadIT.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkadIT.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	
	public Employee deleteById(int empId);
	
	public List<Employee> findByEmpAgeLessThanEqual(int age);
	
	public Employee findByEmpIdAndEmpName(int id,String name);

}
