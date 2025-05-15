package com.tom.prejoin.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.tom.prejoin.model.Name;

import jakarta.annotation.PostConstruct;

@Repository
public class NameCollectionRepository {
	private final List<Name> nameList = new ArrayList<>();
	
	public List<Name> getAll() {
		return nameList;
	}
	
	public String PostName(Name name) {
		nameList.add(name);
		return "Success";
	}
	
	@PostConstruct
	private void init() {
		Name name = new Name(1, "John");
		nameList.add(name);
	}
	
}
