package com.example.demo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.DepartmentManagerRepository;
import com.example.demo.services.DepartmentManagerService;

@Service
public class DepartmentManagerServiceImpl implements DepartmentManagerService {

	@Autowired
	DepartmentManagerRepository departmentManagerRepository;
}
