package com.TEST.springboottestdemo.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
    @Id
   // @NotBlank(message="The column name should not be blank")
    @Column(name = "Id")
    private Integer id;

    @Column(name = "NAME")
    @NotBlank
    private String name;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "ROLLNO")
    private String rollNo;


   // /
}
