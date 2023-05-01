package com.SANKARI.studentCourses.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Cacheable
public class Institute {
    @Id
    @GeneratedValue
    private Long id;

    private String instituteName;

    private String instituteLocation;

    @ElementCollection
    private List<String> coursesAvailable;

    @ElementCollection
    private HashMap<String, Double> fees;
}
