package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Courses;

public interface CourseService {
	
	public List<Courses> getCourses() ;
	public Courses getCourse(long id) ;
	public Courses addCourse(Courses course) ;
	public Courses updateCourse(Courses course) ;
	public Courses deleteCourse(long id) ;
}
