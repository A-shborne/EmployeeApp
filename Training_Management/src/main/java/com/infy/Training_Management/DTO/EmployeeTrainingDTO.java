package com.infy.Training_Management.DTO;

import java.time.LocalDate;

public class EmployeeTrainingDTO {
	
	private int trainingId;
	private EmployeeDTO employeeDTO;
	private CoursesDTO coursesDTO;
	private LocalDate startingDate;
	private LocalDate  completionDate;
	private String trainingStatus;
	
	public EmployeeTrainingDTO(int trainingId, EmployeeDTO employeeDTO, CoursesDTO coursesDTO, LocalDate startingDate,
			LocalDate completionDate, String trainingStatus) {
		super();
		this.trainingId = trainingId;
		this.employeeDTO = employeeDTO;
		this.coursesDTO = coursesDTO;
		this.startingDate = startingDate;
		this.completionDate = completionDate;
		this.trainingStatus = trainingStatus;
	}
	public EmployeeDTO getEmployeeDTO() {
		return employeeDTO;
	}
	public void setEmployeeDTO(EmployeeDTO employeeDTO) {
		this.employeeDTO = employeeDTO;
	}
	public CoursesDTO getCoursesDTO() {
		return coursesDTO;
	}
	public void setCoursesDTO(CoursesDTO coursesDTO) {
		this.coursesDTO = coursesDTO;
	}
	public int getTrainingId() {
		return trainingId;
	}
	public void setTrainingId(int trainingId) {
		this.trainingId = trainingId;
	}
	
	public LocalDate getStartingDate() {
		return startingDate;
	}
	public void setStartingDate(LocalDate startingDate) {
		this.startingDate = startingDate;
	}
	public LocalDate getCompletionDate() {
		return completionDate;
	}
	public void setCompletionDate(LocalDate completionDate) {
		this.completionDate = completionDate;
	}
	public String getTrainingStatus() {
		return trainingStatus;
	}
	public void setTrainingStatus(String trainingStatus) {
		this.trainingStatus = trainingStatus;
	}

}
