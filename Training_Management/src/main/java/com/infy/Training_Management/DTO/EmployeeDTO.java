package com.infy.Training_Management.DTO;

import java.time.LocalDate;
import java.util.List;

public class EmployeeDTO {
	private int empId;
	private String firstName;
	private String lastName;
	private LocalDate dob;
	private LocalDate doj;
	private List<EmployeeTrainingDTO> employeeTrainingDTO;
	private String successMessage;
	
	
	public EmployeeDTO(int empId, String firstName, String lastName, LocalDate dob, LocalDate doj) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.doj = doj;
	}
	public List<EmployeeTrainingDTO> getEmployeeTrainingDTO() {
		return employeeTrainingDTO;
	}
	public void setEmployeeTrainingDTO(List<EmployeeTrainingDTO> employeeTrainingDTO) {
		this.employeeTrainingDTO = employeeTrainingDTO;
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
	public String getSuccessMessage() {
		return successMessage;
	}
	public void setSuccessMessage(String successMessage) {
		this.successMessage = successMessage;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	private String errorMessage;
	

}
