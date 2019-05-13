package com.example.demo.services.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Employee;
import com.example.demo.entities.Employee.Gender;
import com.example.demo.repositories.EmployeeRepository;
import com.example.demo.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee addNewEmployee(Employee e) {
		return employeeRepository.save(e);
	}

	@Override
	public Employee addNewEmployee(Date birthDate, String firstName, String lastName, Gender gender, Date hireDate) {
		Employee e = new Employee();
		e.setBirthDate(birthDate);
		e.setFirstName(firstName);
		e.setLastName(lastName);
		e.setGender(gender);
		e.setHireDate(hireDate);
		return employeeRepository.save(e);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();

	}

	@Override
	public Page<Employee> getEmployeePage(int page, int size) {
		return employeeRepository.findAll(PageRequest.of(page, size));
	}

}
