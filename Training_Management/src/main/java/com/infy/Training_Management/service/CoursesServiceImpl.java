package com.infy.Training_Management.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.Training_Management.DTO.CoursesDTO;
import com.infy.Training_Management.Exception.InfyTrainingException;
import com.infy.Training_Management.entity.Courses;
import com.infy.Training_Management.repository.CoursesRepository;

@Service
@Transactional
public class CoursesServiceImpl implements CoursesService {
	
	@Autowired
	private CoursesRepository coursesRepository;
	
	public CoursesDTO getCourse(int courseId) throws InfyTrainingException {
		Optional<Courses> opt=coursesRepository.findById(courseId);
		Courses course=opt.orElseThrow(()-> new InfyTrainingException("Service.Course_Not_Found"));
		CoursesDTO cDTO=new CoursesDTO(course.getCourseId(),
				course.getCourseName(),
				course.getCourseLevel(),
				course.getCourseDuration(),
				course.getCourseRating());
		return cDTO;
	}
	
	public List<CoursesDTO> getAllCourse(){
		Iterable<Courses> ic=coursesRepository.findAll();
		List<CoursesDTO> cList= new ArrayList<>();
		for(Courses c:ic) {
			CoursesDTO cDTO=new CoursesDTO(
					c.getCourseId(),
					c.getCourseName(),
					c.getCourseLevel(),
					c.getCourseDuration(),
					c.getCourseRating());
			cList.add(cDTO);
		}
		return cList;
	}

}
