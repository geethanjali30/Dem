package com.infy.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp_det")
public class Employee {
	@Id
	int empNo;

	String empName;
	
	int empSal;
	@OneToOne(cascade=CascadeType.ALL)
	Office officeid;
	
	
	public Employee() {
		super();
	}


	public Employee(int empNo, String empName, int empSal, Office officeid) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empSal = empSal;
		this.officeid = officeid;
	}


	public int getEmpNo() {
		return empNo;
	}


	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public int getEmpSal() {
		return empSal;
	}


	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}


	public Office getOfficeid() {
		return officeid;
	}


	public void setOfficeid(Office officeid) {
		this.officeid = officeid;
	}


	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empSal=" + empSal + ", officeid=" + officeid
				+ "]";
	}

}
