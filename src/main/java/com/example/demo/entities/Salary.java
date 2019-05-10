package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "salaries")
public class Salary implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3012773733643618018L;

	@Column(name = "salary", nullable = false)
	private Long salary;

	@Column(name = "to_date", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date toDate;

	public Salary() {
		super();
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public class SalaryIdentity implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = 3678473176764457976L;

		@ManyToOne
		@JoinColumn(name = "emp_no")
		private Employee employee;

		@Column(name = "from_date", nullable = false)
		@Temporal(TemporalType.DATE)
		private Date fromDate;

		public SalaryIdentity() {
			super();
		}

		public SalaryIdentity(Employee employee, Date fromDate) {
			super();
			this.employee = employee;
			this.fromDate = fromDate;
		}

		public Employee getEmployee() {
			return employee;
		}

		public void setEmployee(Employee employee) {
			this.employee = employee;
		}

		public Date getFromDate() {
			return fromDate;
		}

		public void setFromDate(Date fromDate) {
			this.fromDate = fromDate;
		}

	}

}
