package com.infy.Training_Management.API;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.Training_Management.DTO.EmployeeDTO;
import com.infy.Training_Management.Exception.InfyTrainingException;
import com.infy.Training_Management.entity.Employee;
//import com.infy.Training_Management.entity.Employee;
import com.infy.Training_Management.service.EmployeeServiceImpl;

@RestController
@RequestMapping(value="/employee")
public class EmployeeAPI {
	
	static Log Logger=LogFactory.getLog(EmployeeAPI.class);
	
	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;
	
	@GetMapping(value="/getemployee/{empId}")
	public ResponseEntity<Employee> getED(@PathVariable int empId) throws InfyTrainingException{
		Logger.info(employeeServiceImpl.getEmpDetails(empId).getFirstName()+" Details are being Fetched");
		Logger.debug("Error Spotted");
		return new ResponseEntity<Employee>(employeeServiceImpl.getEmpDetails(empId),HttpStatus.OK);
	}
	
	@GetMapping(value="/getallemployee")
	public ResponseEntity<List<EmployeeDTO>> getAllEmp(){
		Logger.info("All Datas Are being fetched");
		return new ResponseEntity<List<EmployeeDTO>>(employeeServiceImpl.getAllEmp(),HttpStatus.OK);
	}
	
	@PostMapping(value="/newemployee")
	public ResponseEntity<String> addEmployee(@RequestBody EmployeeDTO employeeDTO){
		int id=employeeServiceImpl.addEmp(employeeDTO);
		String message="The entered employee id is "+ id;
		return new ResponseEntity<String>(message,HttpStatus.OK);
	}
}
