package com.infy.Training_Management.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="courses")
public class Courses {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Course_ID")
	private int courseId;
	@Column(name="Course_Level")
	private String courseLevel;
	@Column(name="Course_Duration")
	private String courseDuration;
	@Column(name="Course_Name")
	private String courseName;
	@Column(name="Course_Rating")
	private double courseRating;
	
	public double getCourseRating() {
		return courseRating;
	}
	public void setCourseRating(double courseRating) {
		this.courseRating = courseRating;
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

}
