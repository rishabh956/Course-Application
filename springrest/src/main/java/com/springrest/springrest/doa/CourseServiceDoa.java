package com.springrest.springrest.doa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entities.Courses; 

public interface CourseServiceDoa extends JpaRepository<Courses, Long> {

}
