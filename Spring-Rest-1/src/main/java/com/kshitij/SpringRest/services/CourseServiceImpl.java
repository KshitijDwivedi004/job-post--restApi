package com.kshitij.SpringRest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kshitij.SpringRest.dao.CourseDao;
import com.kshitij.SpringRest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
//	List<Course> list=null;

	public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(1015,"Java Core Course","This course Whole Java core Content"));
//		list.add(new Course(1221,"Spring Boot Course","Creating BackEnd With the help of SpringBoot"));
//		list.add(new Course(1302,"Python Basics Course","This course covers the basics of Python"));
//		list.add(new Course(1403,"Data Structures Course","This course covers fundamental data structures"));
//		list.add(new Course(1504,"Web Development Course","This course covers HTML, CSS, and JavaScript"));
//		list.add(new Course(1605,"Machine Learning Course","This course covers basic concepts of Machine Learning"));

	}

	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
//		return list;
	}

	@Override
	public Course getCourse(Long CourseId) {
		return courseDao.getOne(CourseId);

//		Course course=null;
//		for(Course c: list) {
//			if(c.getId() == CourseId) {
//				course=c;
//				break;
//			}
//		}
//		return course;
	}

	@Override
	public Course addCourse(Course course) {

		courseDao.save(course);
		return course;
//		this.list.add(course);
	}

	@Override
	public Course updateCourse(Course course) {
//		list.forEach(e->{
//			if(e.getId() == course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		
//		});
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(Long courseId) {
//		list = this.list.stream().filter(e->e.getId() != courseId).collect(Collectors.toList());
		Course byId = courseDao.getOne(courseId);
		courseDao.delete(byId);

	}

}
