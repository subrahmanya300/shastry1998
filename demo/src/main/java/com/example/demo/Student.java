package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Student {

	private int studentID;
	private String stName;
	
	@Autowired
	@Qualifier("lap")
	private Laptop laptop;
	
	public int getStudentID() {
		return studentID;
	}
	
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	public String getStName() {
		return stName;
	}
	
	public void setStName(String stName) {
		this.stName = stName;
	}	
	
	void show() {
		System.out.println("Inside Student");
		laptop.show();
	}
}
