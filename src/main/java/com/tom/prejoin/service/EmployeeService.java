package com.tom.prejoin.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tom.prejoin.model.Employee;
import com.tom.prejoin.repository.EmployeeRepsitory;
import com.tom.prejoin.contracts.EmployeeResponse;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepsitory repository;
	
	public Employee SaveEmployee(String name) {
		Employee employee = new Employee();
		employee.setName(name);
		return repository.save(employee);
	}
	
	public List<EmployeeResponse> getAllEmployees() {
		return repository.findAll()
				.stream()
				.map(employee -> new EmployeeResponse(employee.getId(), employee.getName()))
				.collect(Collectors.toList());
	}

}
