package com.home.course.courseService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.home.course.bean.Course;

public interface CourseService {
	public List<Course> getCourses();
	public Course getCourse(String id);
	public Course addCourse(Course course);
	public Course updateCourse(Course course);
	public ResponseEntity<HttpStatus> deleteCourse(String id);
}
