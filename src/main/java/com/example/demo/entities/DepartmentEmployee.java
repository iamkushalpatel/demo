package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "dept_emp")
public class DepartmentEmployee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1746413486724556982L;

	@EmbeddedId
	private DepartmentEmployeeIdentity departmentEmployeeIdentity;

	@Column(name = "from_date", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fromDate;

	@Column(name = "to_date", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date toDate;

	public DepartmentEmployee() {
		super();
	}

	public DepartmentEmployeeIdentity getDepartmentEmployeeIdentity() {
		return departmentEmployeeIdentity;
	}

	public void setDepartmentEmployeeIdentity(DepartmentEmployeeIdentity departmentEmployeeIdentity) {
		this.departmentEmployeeIdentity = departmentEmployeeIdentity;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	@Embeddable
	public static class DepartmentEmployeeIdentity implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = 6147541886229988511L;

		@JsonManagedReference
		@ManyToOne
		@JoinColumn(name = "emp_no")
		private Employee employee;

		@JsonManagedReference
		@ManyToOne
		@JoinColumn(name = "dept_no")
		private Department department;

		public DepartmentEmployeeIdentity() {
			super();
		}

		public Employee getEmployee() {
			return employee;
		}

		public void setEmployee(Employee employee) {
			this.employee = employee;
		}

		public Department getDepartment() {
			return department;
		}

		public void setDepartment(Department department) {
			this.department = department;
		}

	}

}
