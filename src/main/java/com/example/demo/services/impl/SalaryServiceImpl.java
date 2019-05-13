package com.example.demo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Salary;
import com.example.demo.repositories.SalaryRepository;
import com.example.demo.services.SalaryService;

@Service
public class SalaryServiceImpl implements SalaryService {

	@Autowired
	SalaryRepository salaryRepository;

	@Override
	public Page<Salary> getPage(int page, int size) {
		return salaryRepository.findAll(PageRequest.of(page, size));
	}

}
