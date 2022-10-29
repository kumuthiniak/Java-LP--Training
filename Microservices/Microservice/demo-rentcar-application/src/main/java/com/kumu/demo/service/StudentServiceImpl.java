package com.kumu.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.kumu.demo.model.Student;
import com.kumu.demo.repository.StudentRepository;

public class StudentServiceImpl {
	@Autowired
    StudentRepository studentRepository;

    public Student save(Student student) {

        return studentRepository.save(student);
    }


    public Student fetchStudentById(int id){


     Optional<Student> student=    studentRepository.findById( id);
     if(student.isPresent()){
         return student.get();
     }
     return null;

    }
}



