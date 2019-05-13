package com.example.demo.services;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;

import com.example.demo.entities.Employee;
import com.example.demo.entities.Employee.Gender;

public interface EmployeeService {

	public Employee addNewEmployee(Employee e);

	public Employee addNewEmployee(Date birthDate, String firstName, String lastName, Gender gender, Date hireDate);

	public List<Employee> getAllEmployee();

	public Page<Employee> getPage(int page, int size);

}
