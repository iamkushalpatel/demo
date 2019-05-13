package com.example.demo.services;

import org.springframework.data.domain.Page;

import com.example.demo.entities.Department;

public interface DepartmentService {

	public Page<Department> getPage(int page, int size);

}
