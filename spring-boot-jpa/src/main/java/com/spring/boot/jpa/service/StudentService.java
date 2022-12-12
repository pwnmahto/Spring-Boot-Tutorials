package com.spring.boot.jpa.service;

import com.spring.boot.jpa.model.Student;
import com.spring.boot.jpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employeeService")
public class StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public Student findByRollNumber(String rollNumber){
        return studentRepository.findByRollNumber(rollNumber);
    }

}