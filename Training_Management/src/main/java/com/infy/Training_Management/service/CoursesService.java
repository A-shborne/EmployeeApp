package com.infy.Training_Management.service;

import java.util.List;

import com.infy.Training_Management.DTO.CoursesDTO;
import com.infy.Training_Management.Exception.InfyTrainingException;

public interface CoursesService {
	
	public CoursesDTO getCourse(int courseId) throws InfyTrainingException;
	public List<CoursesDTO> getAllCourse();

}
