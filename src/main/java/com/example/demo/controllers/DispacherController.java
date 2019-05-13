package com.example.demo.controllers;

import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Department;
import com.example.demo.entities.DepartmentEmployee;
import com.example.demo.entities.DepartmentManager;
import com.example.demo.entities.Employee;
import com.example.demo.entities.Salary;
import com.example.demo.entities.Title;
import com.example.demo.services.DepartmentEmployeeService;
import com.example.demo.services.DepartmentManagerService;
import com.example.demo.services.DepartmentService;
import com.example.demo.services.EmployeeService;
import com.example.demo.services.SalaryService;
import com.example.demo.services.TitleService;

@RestController
public class DispacherController {
	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private TitleService titleService;

	@Autowired
	private SalaryService salaryService;

	@Autowired
	private DepartmentService departmentService;

	@Autowired
	private DepartmentEmployeeService departmentEmployeeService;

	@Autowired
	private DepartmentManagerService departmentManagerService;

	@RequestMapping(path = "/getEmployeePage", method = RequestMethod.GET)
	public Page<Employee> getEmployeePage(@QueryParam("page") int page, @QueryParam("size") int size) {
		return employeeService.getPage(page, size);
	}

	@RequestMapping(path = "/getTitlePage", method = RequestMethod.GET)
	public Page<Title> getTitlePage(@QueryParam("page") int page, @QueryParam("size") int size) {
		return titleService.getPage(page, size);
	}

	@RequestMapping(path = "/getSalaryPage", method = RequestMethod.GET)
	public Page<Salary> getSalaryPage(@QueryParam("page") int page, @QueryParam("size") int size) {
		return salaryService.getPage(page, size);
	}

	@RequestMapping(path = "/getDepartmentPage", method = RequestMethod.GET)
	public Page<Department> getDepartmentPage(@QueryParam("page") int page, @QueryParam("size") int size) {
		return departmentService.getPage(page, size);
	}

	@RequestMapping(path = "/getDepartmentEmployeePage", method = RequestMethod.GET)
	public Page<DepartmentEmployee> getDepartmentEmployeePage(@QueryParam("page") int page,
			@QueryParam("size") int size) {
		return departmentEmployeeService.getPage(page, size);
	}

	@RequestMapping(path = "/getDepartmentManagerPage", method = RequestMethod.GET)
	public Page<DepartmentManager> getDepartmentManagerPage(@QueryParam("page") int page,
			@QueryParam("size") int size) {
		return departmentManagerService.getPage(page, size);
	}

}
