package com.BikkadIT.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.model.Employee;
import com.BikkadIT.service.EmployeeServiceI;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceI employeeServiceI;
	
	@PostMapping(value = "/save",consumes = "application/json",produces = "application/json")
	public ResponseEntity<String> saveEmployee(@RequestBody Employee employee){
		
		Employee employee1 = employeeServiceI.saveEmployee(employee);
		
		return new ResponseEntity<String>("Successfully Added your Id is:"+employee1.getEmpId(),HttpStatus.OK);
		
	}
	@PostMapping(value = "/saveall",consumes = "application/json",produces = "application/json")
    public ResponseEntity<String> savemultiEmp(@RequestBody List<Employee> employee){
		
		List<String> saveMultiEmployee = employeeServiceI.saveMultiEmployee(employee);
		
		return new ResponseEntity<String>("Successfully Added:"+saveMultiEmployee,HttpStatus.OK);

	}

}
