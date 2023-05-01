package com.SANKARI.studentCourses.controller;

import com.SANKARI.studentCourses.entity.Courses;
import com.SANKARI.studentCourses.entity.Institute;
import com.SANKARI.studentCourses.repository.InstituteRepo;
import com.SANKARI.studentCourses.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
@RequestMapping("/student")
public class CourseController {
    @Autowired
    public CourseService courseService;
    @Autowired
    public InstituteRepo instituteRepo;

    @PostMapping("/add")
    public Courses addDetails(@RequestBody Courses courses) {
        return courseService.add(courses);
    }


    @GetMapping("/count/{interestedCourses}")
    public long getCountByCourse(@PathVariable String interestedCourses) {
        return courseService.getCountByCourse(interestedCourses);
    }



    @GetMapping("/location/{location}")
    public List<Courses> getByLocation(@PathVariable String location) {
        return courseService.getByLocation(location);

}



}
