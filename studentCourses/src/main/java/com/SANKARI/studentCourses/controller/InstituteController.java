package com.SANKARI.studentCourses.controller;

import com.SANKARI.studentCourses.entity.Institute;
import com.SANKARI.studentCourses.repository.InstituteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InstituteController {
    @Autowired
    public InstituteRepo instituteRepo;

    @GetMapping("/institute/{instituteId}")
    public List<Institute> getStudentsByInstitute(@PathVariable Long instituteId) {
        return instituteRepo.getStudentsByInstitute(instituteId);

    }

}
