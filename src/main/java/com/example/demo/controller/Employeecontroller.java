package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Employee;
import com.example.demo.services.Employeeservices;
@CrossOrigin("http://localhost:8080")
@RestController
@RequestMapping("/api/v1")

public class Employeecontroller {
	

		@Autowired
		Employeeservices
		service;
		@PostMapping("/add")
		public Employee insertion(@RequestBody Employee log) {
			return service.insertion(log);
			
		}
		@PostMapping("/multiadd")
		public Iterable<Employee> multiinsertion(@RequestBody List<Employee> lo) {
			return service.multiinsertion(lo);
		}
		@GetMapping("/multifetch")
		public List<Employee> multifetch(){
			return service.multifetch();
		}
		@GetMapping("/singlefetching/{id}")
		public Optional<Employee> fetch(@PathVariable int id) {
			return service.fetch(id);
		}
		@DeleteMapping("/deleting/{id}")
		public String delete(@PathVariable int id) {
			return service.delete(id);
		}
		@PutMapping("/update")
		public Employee update(@RequestBody Employee reg) {
			return service.update(reg);
			}
		
		@GetMapping("/findbyemail/{email}")
		public Employee findbyemail(@PathVariable String email) {
			return service.findbyemail(email);
		}

	}
