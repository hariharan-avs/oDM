package com.oDMPortal.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oDMPortal.backend.model.Course;
import com.oDMPortal.backend.repo.CourseRepo;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepo repo;
	public List<Course> getCourseList() {
		return repo.findAll();
	}

	public Course saveCourse(Course course) {
		return repo.save(course);
	}
	
	public Optional<Course> getCourseById(int id) {
		return repo.findById(id);
	}

	public String deleteCourseById(int id) {
		
		String result;
		try {
			repo.deleteById(id);
			result = "Course Deleted";
		} catch (Exception e) {
			result = "Course Not Deleted";
		}
		return result;
	}
}
