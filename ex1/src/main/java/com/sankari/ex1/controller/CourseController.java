package com.sankari.ex1.controller;

import com.sankari.ex1.entity.Courses;
import com.sankari.ex1.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    public CourseService courseService;
    @PostMapping("/add")
    public Courses addDetails(@RequestBody Courses courses) {
        return courseService.add(courses);
    }
	

}
