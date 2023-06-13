package com.app.services;

import java.util.List;

import com.app.pojo.Student;

public interface StudentService {
  
	List<Student> getAllStudentetails();
	Student addEmpDetails(Student transientstudent);
	String deleteDetails(Long stdId);
	Student updateDetails (Student stdId);
}
