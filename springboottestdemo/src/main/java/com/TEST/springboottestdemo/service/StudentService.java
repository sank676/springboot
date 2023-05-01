package com.TEST.springboottestdemo.service;

import com.TEST.springboottestdemo.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    Student addStudent(Student student);

    List<Student> getAllStudent();

    Student getStudentById(Integer id);

    Student deleteStudentById(Integer id);

    List<Student> getStudentByName(String name);


}
