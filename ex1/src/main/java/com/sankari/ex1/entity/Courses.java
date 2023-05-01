package com.sankari.ex1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
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
    private List<String> Courses;
    private String location;
    private String comment;


}
