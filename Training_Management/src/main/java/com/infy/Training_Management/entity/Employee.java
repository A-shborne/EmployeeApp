package com.infy.Training_Management.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Emp_ID")
	private int empId;
	@Column(name="First_Name")
	private String firstName;
	@Column(name="Last_Name")
	private String lastName;
	@Column(name="Date_Of_Birth")
	private LocalDate dob;
	@Column(name="Date_Of_Joining")
	private LocalDate doj;
	
	@JsonManagedReference
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="Employee_Id")
	private List<EmployeeTraining> employeeTraining;
	

	public List<EmployeeTraining> getEmployeeTraining() {
		return employeeTraining;
	}
	public void setEmployeeTraining(List<EmployeeTraining> employeeTraining) {
		this.employeeTraining = employeeTraining;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
}
