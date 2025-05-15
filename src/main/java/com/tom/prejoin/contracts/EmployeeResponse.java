package com.tom.prejoin.contracts;

public class EmployeeResponse {
	private Long id;
	private String name;
	
	public EmployeeResponse(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
}
