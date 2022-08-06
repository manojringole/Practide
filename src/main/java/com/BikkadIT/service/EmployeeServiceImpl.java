package com.BikkadIT.service;

import java.util.ArrayList;
import java.util.List;

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

}
