package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Employee;
import com.example.demo.repository.Employeerepository;

@Service
public class Employeeservices {
	@Autowired
	Employeerepository repo;
	
	public Employee insertion(Employee log) {
		return repo.save(log);
	}
public Iterable<Employee> multiinsertion(List<Employee> lo) {
	return repo.saveAll(lo); 
	
}
public List<Employee> multifetch(){
	return (List<Employee>) repo.findAll();
	
}
public Optional<Employee> fetch(int id) {
	return repo.findById(id);
}
public String delete(int id) {
	repo.deleteById(id);
	return "Successfully Deleted" + id;
}
public Employee update(Employee logg) {
	return repo.save(logg);
}
public Employee updateall(Employee reg) {
	int id= reg.getId();
	Employee reg1 = repo.findById(id).get();
	reg1.setEmail(reg.getEmail());
//	reg1.setBranch(reg.getbranch());
	reg1.setName(reg.getName());
	return repo.save(reg);
}

public Employee findbyemail(String email) {
	return repo.findByEmail(email);
}
}
