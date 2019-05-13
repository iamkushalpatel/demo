package com.example.demo.services;

import org.springframework.data.domain.Page;

import com.example.demo.entities.DepartmentEmployee;

public interface DepartmentEmployeeService {

	public Page<DepartmentEmployee> getPage(int page, int size);

}
