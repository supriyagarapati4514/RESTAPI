package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Employee;
@Repository
public interface Employeerepository extends CrudRepository<Employee, Integer> {

	

	Employee findByEmail(String email);

	

}
