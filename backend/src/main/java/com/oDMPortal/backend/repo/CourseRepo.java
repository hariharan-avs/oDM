package com.oDMPortal.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oDMPortal.backend.model.Course;

public interface CourseRepo extends JpaRepository<Course, Integer>{

}
