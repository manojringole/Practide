package com.BikkadIT.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.model.Employee;
import com.BikkadIT.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeServiceI{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		
		Employee employee1 = employeeRepository.save(employee);
		return employee1;
	}

	@Override
	public List<String> saveMultiEmployee(List<Employee> employee) {
		
		List<Employee> all = employeeRepository.saveAll(employee);
		List l=new ArrayList<>();
		for(Employee e:all)
		{
			l.add(employee);
		}
		return null;
	}

	@Override
	public Employee getById(int empId) {
		
		Employee id = employeeRepository.findById(empId).get();
		return id;
	}

	@Override
	public List<Employee> getAll() {
		
		List<Employee> findAll = employeeRepository.findAll();
		return findAll;
	}

	@Override
	public Employee update(Employee employee) {
		
		 Employee update = employeeRepository.save(employee);
		return update;
	}

	@Override
	public Employee deleteId(int empId) {
		
		Employee deleteById = employeeRepository.deleteById(empId);
		return deleteById;
	}

	@Override
	public Employee deleteAll() {
		
		employeeRepository.deleteAll();
		return null;
	}

	@Override
	public List<Employee> ageLessThanOrEqual(int empAge) {
		
		 List<Employee> findByEmpAgeLessThanEqual = employeeRepository.findByEmpAgeLessThanEqual(empAge);
		return findByEmpAgeLessThanEqual;
	}

	@Override
	public Employee loginCheck(int empId, String empName) {
		
		Employee name = employeeRepository.findByEmpIdAndEmpName(empId, empName);
		return name;
	}

}
