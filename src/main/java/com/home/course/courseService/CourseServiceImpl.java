package com.home.course.courseService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.home.course.bean.Course;
import com.home.course.dao.CourseDao;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseDao courseDao;
	
	
	
	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(String id) {
		return courseDao.getReferenceById(id);
	}

	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public ResponseEntity<HttpStatus> deleteCourse(String id) {
		courseDao.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK) ;
		
	}

	@Override
	public Course updateCourse(Course course) {
		return courseDao.save(course);
	}
	

}
