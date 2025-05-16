package com.tom.prejoin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tom.prejoin.model.Employee;

@Repository
public interface EmployeeRepsitory extends JpaRepository<Employee, Long>{

}
