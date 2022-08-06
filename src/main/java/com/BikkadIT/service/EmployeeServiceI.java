package com.BikkadIT.service;

import java.util.List;

import com.BikkadIT.model.Employee;

public interface EmployeeServiceI {
	
	public Employee saveEmployee(Employee employee);
	
	public List<String> saveMultiEmployee(List<Employee> employee);
	
	public Employee getById(int empId);
	
	public List<Employee> getAll();
	
	public Employee update(Employee employee);
	
	public Employee deleteId(int empId);
	
	public Employee deleteAll();
	
	public List<Employee> ageLessThanOrEqual(int empAge);
	
	public Employee loginCheck(int empId,String empName);
	
	public List<Employee> updateMultiEmployee(List<Employee> employees);

}
