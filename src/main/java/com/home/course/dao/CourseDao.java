package com.home.course.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.home.course.bean.Course;

public interface CourseDao extends JpaRepository<Course, String> {
	
}
