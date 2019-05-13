package com.example.demo.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "departments")
public class Department implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3754695570101220513L;

	@Id
	@Column(name = "dept_no", nullable = false)
	private String deptNo;

	@Column(name = "dept_name", unique = true, nullable = false)
	private String deptName;

	@JsonBackReference
	@OneToMany(mappedBy = "departmentEmployeeIdentity.department", cascade = CascadeType.ALL)
	private List<DepartmentEmployee> departmentEmployees;

	@JsonBackReference
	@OneToMany(mappedBy = "departmentManagerIdentity.department", cascade = CascadeType.ALL)
	private List<DepartmentManager> departmentManagers;

	public Department() {
		super();
	}

	public String getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<DepartmentEmployee> getDepartmentEmployees() {
		return departmentEmployees;
	}

	public void setDepartmentEmployees(List<DepartmentEmployee> departmentEmployees) {
		this.departmentEmployees = departmentEmployees;
	}

	public List<DepartmentManager> getDepartmentManagers() {
		return departmentManagers;
	}

	public void setDepartmentManagers(List<DepartmentManager> departmentManagers) {
		this.departmentManagers = departmentManagers;
	}

}
