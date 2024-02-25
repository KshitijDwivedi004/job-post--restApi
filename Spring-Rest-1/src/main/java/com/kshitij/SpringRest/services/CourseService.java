package com.kshitij.SpringRest.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kshitij.SpringRest.entities.Course;

@Service
public interface CourseService {
	
	public List<Course> getCourses();
	public Course getCourse(Long CourseId);
	public Course addCourse(Course course);
	public Course updateCourse(Course course);
	public void   deleteCourse(Long courseId);

}
