package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.doa.CourseServiceDoa;
import com.springrest.springrest.entities.Courses;

@Service
public class CourseServiceImpl implements CourseService {

//	 List<Courses> list ;
	@Autowired
	CourseServiceDoa courseServiceDoa ;
	
	 CourseServiceImpl()
	 {
//		 list = new ArrayList<>() ;
//		 list.add(new Courses(123, "Springboot", "a tool to build RestApi and microservices")) ;
//		 list.add(new Courses(456, "SpringMVC", "a tool to build  microservices")) ;
	 }
	 
	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return courseServiceDoa.findAll();
	}

	@Override
	public Courses getCourse(long id) {
		// TODO Auto-generated method stub
		Courses c = null ;
		
//		for(Courses temp : list)
//		{
//			if(temp.getId() == id)
//			{
//				c = temp ;
//				break ;
//			}
//		}
		
		return courseServiceDoa.getById(id) ;
	}

	@Override
	public Courses addCourse(Courses course) {
		// TODO Auto-generated method stub
//		this.list.add(course) ;
		courseServiceDoa.save(course);
		return course;
	}

	@Override
	public Courses updateCourse(Courses course) {
		// TODO Auto-generated method stub
		courseServiceDoa.save(course);
//		for(int i=0;i<list.size();i++)
//		{
//			if(list.get(i).getId() == course.getId())
//			{
//				list.get(i).setDescription(course.getDescription());
//				list.get(i).setTitle(course.getTitle());
//				return course;
//			}
//		}
		
		return new Courses() ;
	}

	@Override
	public Courses deleteCourse(long id) {
		// TODO Auto-generated method stub
		Courses c = courseServiceDoa.getById(id) ;
		courseServiceDoa.delete(c);
//		for(int i=0;i<list.size();i++)
//		{
//			if(list.get(i).getId() == id)
//			{
//				c = list.get(i) ;
//				list.remove(i);
//			}
//		}
		return c;
	}

}
