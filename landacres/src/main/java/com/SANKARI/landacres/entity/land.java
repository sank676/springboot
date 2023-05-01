package com.SANKARI.landacres.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class land {
    @Id
    @GeneratedValue
    private Integer id;
    private String location;
    private Double acres;
    private Double price;
}
