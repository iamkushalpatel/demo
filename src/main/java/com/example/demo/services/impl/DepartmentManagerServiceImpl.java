package com.example.demo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.entities.DepartmentManager;
import com.example.demo.repositories.DepartmentManagerRepository;
import com.example.demo.services.DepartmentManagerService;

@Service
public class DepartmentManagerServiceImpl implements DepartmentManagerService {

	@Autowired
	DepartmentManagerRepository departmentManagerRepository;

	@Override
	public Page<DepartmentManager> getPage(int page, int size) {
		return departmentManagerRepository.findAll(PageRequest.of(page, size));
	}
}
