package com.infy.Training_Management.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.Training_Management.entity.EmployeeTraining;
import com.infy.Training_Management.repository.EmployeeTrainingRepository;

@Service
@Transactional
public class EmployeeTrainingServiceImpl  implements EmployeeTrainingService{
	
	@Autowired
	private EmployeeTrainingRepository employeeTrainingRepository;
	
	public EmployeeTraining getDetails(int tID) {
		Optional<EmployeeTraining> opt = employeeTrainingRepository.findById(tID);
		return opt.get();
	}

}
