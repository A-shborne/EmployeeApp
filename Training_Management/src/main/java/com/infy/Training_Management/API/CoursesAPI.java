package com.infy.Training_Management.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.Training_Management.DTO.CoursesDTO;
import com.infy.Training_Management.Exception.InfyTrainingException;
//import com.infy.Training_Management.DTO.EmployeeDTO;
import com.infy.Training_Management.service.CoursesServiceImpl;

@RestController
@RequestMapping(value="/courses")
public class CoursesAPI {
	
	@Autowired
	private CoursesServiceImpl coursesServiceImpl;
	
	@GetMapping(value="/getcourse/{courseId}")
	public ResponseEntity<CoursesDTO> getCS(@PathVariable int courseId) throws InfyTrainingException{
		return new ResponseEntity<CoursesDTO>(coursesServiceImpl.getCourse(courseId),HttpStatus.OK);
	}
	
	@GetMapping(value="/getallcourses")
	public ResponseEntity<List<CoursesDTO>> getAllEmp(){
		return new ResponseEntity<List<CoursesDTO>>(coursesServiceImpl.getAllCourse(),HttpStatus.OK);
	}

}
