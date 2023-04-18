package com.home.course.api;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.home.course.bean.Course;
import com.home.course.courseService.CourseService;


@RestController
@CrossOrigin
public class CourseController {

	@Autowired
	private CourseService courseService;

	@GetMapping("/course")
	public List<Course> getCourses() {
		return courseService.getCourses();
	}

	@GetMapping("/course/{id}")
	public Course getCourse(@PathVariable String id) {
		return courseService.getCourse(id);
	}

	@PostMapping("/course")
	public Course addCourse(@RequestBody Course course) {
		return courseService.addCourse(course);
	}
	
	@PutMapping("/course")
	public Course updateCourse(@RequestBody Course course) {
		return courseService.updateCourse(course);
	}

	@DeleteMapping("/course/{id}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String id) {
	 this.courseService.deleteCourse(id);
	 return new ResponseEntity<>(HttpStatus.OK);
	}

}
