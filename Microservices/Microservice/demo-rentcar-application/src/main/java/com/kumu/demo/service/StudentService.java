package com.kumu.demo.service;

import com.kumu.demo.model.Student;

public interface StudentService {


    Student save(Student student);
    public Student fetchStudentById(int id);

}