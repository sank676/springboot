package com.SANKARI.studentCourses.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Cacheable
@Table(name = "Studentcourses")
public class Courses {
    @Id
    // @GeneratedValue
    private String studentId;
    private String studentName;
    private String email;
    private String phoneNo;
    private String qualification;
    private String experience;
    @ElementCollection
    private List<String> interestedCourses;
    private String location;
    private String comment;


}