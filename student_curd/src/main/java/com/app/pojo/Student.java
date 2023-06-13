package com.app.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")

public class Student {
 @Id
   private Long rollNo;
	private String firstName;
	private String LastName;
	private String course;
	private String email;
	private String dob;
	
	
	private Student()
	{
		
	}


	public Student(Long rollNo, String firstName, String lastName, String course, String email, String dob) {
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		LastName = lastName;
		this.course = course;
		this.email = email;
		this.dob = dob;
	}


	public Long getRollNo() {
		return rollNo;
	}


	public void setRollNo(Long rollNo) {
		this.rollNo = rollNo;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", firstName=" + firstName + ", LastName=" + LastName + ", course="
				+ course + ", email=" + email + ", dob=" + dob + "]";
	}
	
	
}
