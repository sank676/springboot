package com.TEST.springboottestdemo.service;

import com.TEST.springboottestdemo.entity.Student;
import com.TEST.springboottestdemo.exceptions.StudentNotFoundException;
import com.TEST.springboottestdemo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepo studentRepo;
    @Override
    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    @Override
    public Student getStudentById(Integer id) {
        Optional<Student> s=studentRepo.findById(id);
        if(!s.isPresent()) {
            throw new StudentNotFoundException("student with id :" + id + " doesn't exist");
        }

        return s.get();

    }

    @Override
    public Student deleteStudentById(Integer id) {
        Optional<Student> s=studentRepo.findById(id);
        if(!s.isPresent()) {
            throw new StudentNotFoundException("student with id :" + id + " doesn't exist");
        }
            studentRepo.delete(s.get());
        return null;

    }

    @Override
    public List<Student> getStudentByName(String name) {
        return studentRepo.findByName(name);
    }


}
