package com.example.demo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.SalaryRepository;
import com.example.demo.services.SalaryService;

@Service
public class SalaryServiceImpl implements SalaryService {

	@Autowired
	SalaryRepository salaryRepository;

}
