package com.example.demo.controllers;

import java.util.List;

import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employee;
import com.example.demo.entities.Title;
import com.example.demo.services.EmployeeService;
import com.example.demo.services.TitleService;

@RestController
public class DispacherController {
	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private TitleService titleService;

	@RequestMapping(path = "/getAllEmployee", method = RequestMethod.GET)
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}

	@RequestMapping(path = "/getEmployeePage", method = RequestMethod.GET)
	public Page<Employee> getEmployeePage(@QueryParam("page") int page, @QueryParam("size") int size) {
		return employeeService.getEmployeePage(page, size);
	}

	@RequestMapping(path = "/getTitlePage", method = RequestMethod.GET)
	public Page<Title> getTitlePage(@QueryParam("page") int page, @QueryParam("size") int size) {
		return titleService.getTitlePage(page, size);
	}

}
