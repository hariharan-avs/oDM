package com.oDMPortal.backend.crudCourseList;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oDMPortal.backend.model.Course;
import com.oDMPortal.backend.services.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService service;
	
	@GetMapping("/getcourses")
	@CrossOrigin(origins = "http://localhost:4210")
	public List<Course> getCourseList() {
		List<Course> courses = new ArrayList<Course>();
		courses = service.getCourseList();
		return courses;
	}
	
	@PostMapping("/addcourse")
	@CrossOrigin(origins = "http://localhost:4210")
	public Course saveCourse(@RequestBody Course course) {
		
		return service.saveCourse(course);
	}
	
	@GetMapping("/getcoursebyid/{id}")
	@CrossOrigin(origins = "http://localhost:4210")
	public Course getCourseById(@PathVariable int id) {
		return service.getCourseById(id).get();
	}
	
	@DeleteMapping("/deletecoursebyid/{id}")
	@CrossOrigin(origins = "http://localhost:4210")
	public String deleteCourseById(@PathVariable int id) {
		
		return service.deleteCourseById(id);
	}

}
