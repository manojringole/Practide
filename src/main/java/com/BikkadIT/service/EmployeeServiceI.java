package com.BikkadIT.service;

import java.util.List;

import com.BikkadIT.model.Employee;

public interface EmployeeServiceI {
	
	public Employee saveEmployee(Employee employee);
	
	public List<String> saveMultiEmployee(List<Employee> employee);

}
