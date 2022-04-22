package com.infy.Training_Management.DTO;


public class CoursesDTO {
	
	private int courseId;
	private String courseName;
	
	private String courseLevel;
	private String courseDuration ;
	private double courseRating;
	private String successMessage;

	public double getCourseRating() {
		return courseRating;
	}
	public CoursesDTO(int courseId, String courseName, String courseLevel, String courseDuration,
			double courseRating) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseLevel = courseLevel;
		this.courseDuration = courseDuration;
		this.courseRating = courseRating;
	}
	public void setCourseRating(double courseRating) {
		this.courseRating = courseRating;
	}
	private String errorMessage;
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseLevel() {
		return courseLevel;
	}
	public void setCourseLevel(String courseLevel) {
		this.courseLevel = courseLevel;
	}
	public String getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
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
	
	
	
}
