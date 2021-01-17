package com.spring.hazelcast.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.spring.hazelcast.model.Employee;
import com.spring.hazelcast.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	
	@Autowired
	private EmployeeRepository repository;
	
	@Cacheable(cacheNames = {"userCache"})
	public List<Employee> getEmployees(){
		System.out.println("Hit DB first time");
		return repository.findAll();
	}

}
