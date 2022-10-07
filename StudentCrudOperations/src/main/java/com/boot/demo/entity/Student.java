package com.boot.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student 
{
	@Id
	private int rollno;
	private String stuName;
	private String email;
	private int marks;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", stuName=" + stuName + ", email=" + email + ", marks=" + marks + "]";
	}
}
