package com.example.demo.services;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.demo.entities.Employee;

public interface EmployeeService {

	public Employee addNewEmployee(Employee e);

	public List<Employee> getAllEmployee();
	
	public Page<Employee> getEmployeePage(int page,int size);

}
