package com.sankari.ex1.repository;

import com.sankari.ex1.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Courses,String> {
}
