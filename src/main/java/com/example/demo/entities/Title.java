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

@Entity
@Table(name = "titles")
public class Title implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2228123948561590356L;

	@EmbeddedId
	private TitleIdentity titleIdentity;

	@Column(name = "to_date")
	@Temporal(TemporalType.DATE)
	private Date toDate;

	public Title() {
		super();
	}

	public TitleIdentity getTitleIdentity() {
		return titleIdentity;
	}

	public void setTitleIdentity(TitleIdentity titleIdentity) {
		this.titleIdentity = titleIdentity;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	@Embeddable
	public class TitleIdentity implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1429976690660223711L;

		@ManyToOne
		@JoinColumn(name = "emp_no")
		private Employee employee;

		@Column(name = "title", nullable = false)
		private String title;

		@Column(name = "from_date", nullable = false)
		@Temporal(TemporalType.DATE)
		private Date fromDate;

		public TitleIdentity() {
			super();
		}

		public TitleIdentity(Employee employee, String title, Date fromDate) {
			super();
			this.employee = employee;
			this.title = title;
			this.fromDate = fromDate;
		}

		public Employee getEmployee() {
			return employee;
		}

		public void setEmployee(Employee employee) {
			this.employee = employee;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public Date getFromDate() {
			return fromDate;
		}

		public void setFromDate(Date fromDate) {
			this.fromDate = fromDate;
		}

	}
}
