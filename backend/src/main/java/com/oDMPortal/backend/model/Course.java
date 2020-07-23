package com.oDMPortal.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	private int id;
	private String courseTitle;
	private String courseDescription;
	private float price;
	private String mentor;
	
	public Course () {
		
	}
	
	public Course(int id, String courseTitle, String courseDescription, float price, String mentor) {
		super();
		this.id = id;
		this.courseTitle = courseTitle;
		this.courseDescription = courseDescription;
		this.price = price;
		this.mentor = mentor;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getMentor() {
		return mentor;
	}
	public void setMentor(String mentor) {
		this.mentor = mentor;
	}
	
}
