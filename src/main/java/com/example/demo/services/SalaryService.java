package com.example.demo.services;

import org.springframework.data.domain.Page;

import com.example.demo.entities.Salary;

public interface SalaryService {

	public Page<Salary> getPage(int page, int size);

}
