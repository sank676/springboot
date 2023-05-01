package com.SANKARI.studentCourses.repository;

import com.SANKARI.studentCourses.entity.Institute;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InstituteRepo extends JpaRepository<Institute, Long> {
    List<Institute> getStudentsByInstitute(Long instituteId);
}
