package com.sankari.ex1.service;

import com.sankari.ex1.entity.Courses;
import com.sankari.ex1.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class CourseService {
    @Autowired
    public CourseRepository repo;


    public  Courses add(Courses courses) {
        return repo.save(courses);
    }
}
