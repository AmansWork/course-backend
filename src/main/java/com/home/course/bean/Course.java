package com.home.course.bean;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {

	@Id
	private String courseId;
	private String courseName;
	private String courseDescription;
	
	public Course() {
		super();
	}
	public Course(String courseId, String courseName, String courseDescription) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	@Override
	public int hashCode() {
		return Objects.hash(courseDescription, courseId, courseName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(courseDescription, other.courseDescription) && Objects.equals(courseId, other.courseId)
				&& Objects.equals(courseName, other.courseName);
	}
	
	
	
}
