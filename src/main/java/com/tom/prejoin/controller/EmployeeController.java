package com.tom.prejoin.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tom.prejoin.service.EmployeeService;
import com.tom.prejoin.contracts.EmployeeRequest;
import com.tom.prejoin.contracts.EmployeeResponse;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	//To list all the Employees
	
	@GetMapping("")
	public List<EmployeeResponse> GetAllNames() {
		return this.service.getAllEmployees();
	}
	
	
	//To add new Employee
	
	@PostMapping("")
	 public ResponseEntity<String> createEmployee(@RequestBody EmployeeRequest request) {
        service.SaveEmployee(request.getName());
        return ResponseEntity.ok("Employee created");
    }

}
