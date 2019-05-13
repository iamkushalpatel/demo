package com.example.demo.services;

import org.springframework.data.domain.Page;

import com.example.demo.entities.DepartmentManager;

public interface DepartmentManagerService {
	
	public Page<DepartmentManager> getPage(int page, int size);

}
