package com.springboot.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.employee.model.Employee;
import com.springboot.employee.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	public EmployeeRepository employeeRepository;
	
	@GetMapping(value= "/get")
	public List<Employee> getAllEmployees(){
		
		return employeeRepository.findAll();
		
	}
	
	
	
	@PostMapping(value = "/create")
	public String createStudent(@RequestBody Employee employee) {
		
		Employee insertedEmployee = employeeRepository.insert(employee);
		
		return "Employee created"+ insertedEmployee.getEmployeeName();
	}
	
	@PutMapping("/update")
	  public Employee updateEmployee(@RequestBody Employee employee) {
		
		employeeRepository.save(employee);
		return employee;
	  }
	
	
	 
	@DeleteMapping("/delete/{id}")
	public void deleteEmployee(@PathVariable Employee id){
	employeeRepository.delete(id);
	
    }
	
	
	@GetMapping("/get/{id}")
	  public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") String id) {
	    Optional<Employee> employeeData = employeeRepository.findById(id);

	    if (employeeData.isPresent()) {
	      return new ResponseEntity<>(employeeData.get(), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
	
	@PutMapping("/update/{id}")
	  public ResponseEntity<Employee> updateEmployee(@PathVariable("id") String id, @RequestBody Employee employee) {
	    Optional<Employee> employeeData = employeeRepository.findById(id);

	    if (employeeData.isPresent()) {
	      Employee _employee = employeeData.get();
	      _employee.setEmployeeName(employee.getEmployeeName());
	      _employee.setEmployeeSalary(employee.getEmployeeSalary());
	      _employee.setEmployeeDepartment(employee.getEmployeeDepartment());
	      _employee.setEmployeeDesignation(employee.getEmployeeDesignation());
	      return new ResponseEntity<>(employeeRepository.save(_employee), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
	
}