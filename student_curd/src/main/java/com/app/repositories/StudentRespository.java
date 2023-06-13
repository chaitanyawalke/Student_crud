package com.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojo.Student;
@Repository
public interface StudentRespository  extends JpaRepository<Student,Long>{

}
