package com.example.demo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.repositories.DepartmentEmployeeRepository;
import com.example.demo.services.DepartmentEmployeeService;

public class DepartmentEmployeeServiceImpl implements DepartmentEmployeeService {

	@Autowired
	DepartmentEmployeeRepository departmentEmployeeRepository;

}
