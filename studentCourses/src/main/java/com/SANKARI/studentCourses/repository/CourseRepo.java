package com.SANKARI.studentCourses.repository;

import com.SANKARI.studentCourses.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;

@Repository
public interface CourseRepo extends JpaRepository<Courses,String>{
    Arrays findByInstituteId(Long instituteId);
}
