package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojo.Student;
import com.app.repositories.StudentRespository;

@Service
@Transactional
public class StudentServiceimpl implements StudentService{
	
	@Autowired
	StudentRespository studentrepo;

	@Override
	public List<Student> getAllStudentetails() {
		
		return studentrepo.findAll();
	}

	@Override
	public Student addEmpDetails(Student transientstu) {
		// TODO Auto-generated method stub
		return studentrepo.save(transientstu);
	}

	@Override
	public String deleteDetails(Long stdId) {
		// TODO Auto-generated method stub
		if(studentrepo.existsById(stdId))
		{
			studentrepo.deleteById(stdId);
			return "Student is deleted";
		}
		return "Delation is failed :invalid data";
	}

	@Override
	public Student updateDetails(Student stdId) {
		if(studentrepo.existsById(stdId.getRollNo())) {
		return studentrepo.save(stdId);
	}
	return stdId;

}
}