package com.example.demo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.example.demo.entities.DepartmentEmployee;
import com.example.demo.repositories.DepartmentEmployeeRepository;
import com.example.demo.services.DepartmentEmployeeService;

public class DepartmentEmployeeServiceImpl implements DepartmentEmployeeService {

	@Autowired
	DepartmentEmployeeRepository departmentEmployeeRepository;

	@Override
	public Page<DepartmentEmployee> getPage(int page, int size) {
		return departmentEmployeeRepository.findAll(PageRequest.of(page, size));
	}

}
