package com.spring.boot.jpa.repository;

import com.spring.boot.jpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

    Student findByRollNumber(String id);

}
