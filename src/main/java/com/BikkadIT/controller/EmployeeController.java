package com.BikkadIT.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    @GetMapping(value = "/id/{empId}",consumes = "application/json")
	public ResponseEntity<Employee> getId(@PathVariable int empId){
		
		Employee id = employeeServiceI.getById(empId);
		return new ResponseEntity<Employee>(id,HttpStatus.OK);
	}
    
    @GetMapping(value = "/getall",consumes = "application/json")
    public ResponseEntity<List<Employee>> getAll(){
    	
    	List<Employee> all = employeeServiceI.getAll();
		return new ResponseEntity<List<Employee>>(all,HttpStatus.OK);

    }
    @PostMapping(value = "/update" , consumes = "application/json",produces = "application/json")
    public ResponseEntity<String> update(@RequestBody Employee employee){
    	
    	Employee update = employeeServiceI.update(employee);
	return new ResponseEntity<String>("Successfully Updated your Id is:"+update.getEmpId(),HttpStatus.OK);

    }
   
    @GetMapping(value = "/delete/{empId}",consumes = "application/json")
    public ResponseEntity<Employee> deleteId(@PathVariable int empId){
    	
    	Employee deleteId = employeeServiceI.deleteId(empId);
		return new ResponseEntity<Employee>(deleteId,HttpStatus.OK);

    }
    
    @GetMapping(value = "/deleteAll",consumes = "application/json")
    public ResponseEntity<Employee> deleteAll(){
    	
    	Employee deleteAll = employeeServiceI.deleteAll();
		return new ResponseEntity<Employee>(deleteAll,HttpStatus.OK);

    	
    }
    
    @GetMapping(value = "/comp/{empAge}",consumes = "application/json" ,produces = "application/json")
    public ResponseEntity<List<Employee>> compare(@PathVariable int empAge){
    	
    	List<Employee> ageLessThanOrEqual = employeeServiceI.ageLessThanOrEqual(empAge);
        return new ResponseEntity<List<Employee>>(ageLessThanOrEqual,HttpStatus.OK);

    }
    
    @GetMapping(value = "/login",consumes = "application/json" ,produces = "application/json")
    public ResponseEntity<Employee> loginCheck(@RequestBody int empId,String empName)
    {
    	
    	Employee check = employeeServiceI.loginCheck(empId, empName);
		return new ResponseEntity<Employee>(check,HttpStatus.OK);

    }
    
    
}
