package com.infy.Training_Management.service;

import java.util.List;

import com.infy.Training_Management.DTO.EmployeeDTO;
//import com.infy.Training_Management.entity.Employee;
import com.infy.Training_Management.Exception.InfyTrainingException;
import com.infy.Training_Management.entity.Employee;

public interface EmployeeService  {
	public Employee getEmpDetails(int empid)  throws InfyTrainingException;
	public List<EmployeeDTO> getAllEmp();
	public int addEmp(EmployeeDTO employeeDTO);
	

}
