package com.infy.Training_Management.service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

//import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.Training_Management.DTO.EmployeeDTO;
import com.infy.Training_Management.DTO.EmployeeTrainingDTO;
import com.infy.Training_Management.Exception.InfyTrainingException;
import com.infy.Training_Management.entity.Employee;
import com.infy.Training_Management.entity.EmployeeTraining;
import com.infy.Training_Management.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee getEmpDetails(int empId) throws InfyTrainingException  {
		Optional<Employee> emp=employeeRepository.findById(empId);
		Employee e=emp.orElseThrow(()->new InfyTrainingException("Service.Employee_Not_Found"));
//		List<EmployeeTraining> eList=e.getEmployeeTraining();
//		List<EmployeeTrainingDTO> eDList=new LinkedList<EmployeeTrainingDTO>();
//		for(EmployeeTraining et:eList) {
//			EmployeeTrainingDTO etDto=new EmployeeTrainingDTO(et.getTrainingId(),
//					employeeDTO, coursesDTO, startingDate, completionDate, trainingStatus)
//		}
//		EmployeeDTO eDTO=new EmployeeDTO(
//				e.getEmpId(),
//				e.getFirstName(),
//				e.getLastName(),
//				e.getDob(),
//				e.getDoj());
//		return eDTO;
		return e;
	}
	
	
	public List<EmployeeDTO> getAllEmp(){
//		Iterable<Employee>ie= employeeRepository.findAll();
//		List<EmployeeDTO> eList=new ArrayList<>();
//		for(Employee e:ie) {
//			EmployeeDTO eDTO=new EmployeeDTO(
//					e.getEmpId(),
//					e.getFirstName(),
//					e.getLastName(),
//					e.getDob(),
//					e.getDoj());
//			eList.add(eDTO);
//		}
//		return eList;
		return null;
	}
	
	public int addEmp(EmployeeDTO employeeDTO) {
		
		Employee emp= new Employee();
		emp.setEmpId(employeeDTO.getEmpId());
		emp.setFirstName(employeeDTO.getFirstName());
		emp.setLastName(employeeDTO.getLastName());
		emp.setDob(employeeDTO.getDob());
		emp.setDoj(employeeDTO.getDoj());
		Employee e=employeeRepository.save(emp);
		return e.getEmpId() ;
	}

}
