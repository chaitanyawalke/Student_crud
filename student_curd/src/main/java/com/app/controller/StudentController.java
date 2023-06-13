package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.Student;
import com.app.services.StudentService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentser;
	
	@GetMapping("/allstudent")
	public List<Student> getAllEmps() {
		System.out.println("in get all emps");
		return studentser.getAllStudentetails();
    
	}
	@PostMapping("/addstudent")
	public Student savedetails(@RequestBody Student transientstu)
	{
		return studentser.addEmpDetails(transientstu);
	}
	@DeleteMapping("/{stdId}")
	public String deleteStudentdetails(@PathVariable Long stdId) 
	{
		return studentser.deleteDetails(stdId);
	
	}
	@PutMapping("update")
	public Student updateDetails(@RequestBody Student stdId )
	{
		System.out.println("updating student");
		return studentser.updateDetails(stdId);
	}
}
