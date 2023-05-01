package com.SANKARI.studentCourses.service;

import com.SANKARI.studentCourses.entity.Courses;
import com.SANKARI.studentCourses.entity.Courses$;
import com.SANKARI.studentCourses.repository.CourseRepo;
import com.speedment.jpastreamer.application.JPAStreamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class CourseService {
    @Autowired
    public CourseRepo repo;
    @Autowired
    private JPAStreamer jpaStreamer;

    public List<Courses> getByLocation(String location) {
        return jpaStreamer.stream(Courses.class)
                .filter(Courses$.location.equal(location))
                .collect(Collectors.toList());
    }


    public Courses add(Courses interestedCourses) {
        return repo.save(interestedCourses);
    }

    public Long getCountByCourse(String interestedCourses) {
        Predicate<Courses> countt = courses -> courses.getInterestedCourses().contains(interestedCourses);
        return jpaStreamer.stream(Courses.class)
                .filter(countt)
                .count();
    }
}

