package com.kshitij.SpringRest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.kshitij.SpringRest.entities.Course;

@Service
public interface CourseDao extends JpaRepository<Course, Long>{

}
