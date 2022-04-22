package com.infy.Training_Management.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.Training_Management.entity.EmployeeTraining;
import com.infy.Training_Management.service.EmployeeTrainingServiceImpl;

@RestController
@RequestMapping(value="/etraining")
public class EmployeeTrainingAPI {
	
	@Autowired
	private EmployeeTrainingServiceImpl employeeTrainingServiceImpl;
	
	@GetMapping("/gettraining/{tID}")
	public EmployeeTraining getDetails(@PathVariable Integer tID) {
		return employeeTrainingServiceImpl.getDetails(tID);
	}
}
