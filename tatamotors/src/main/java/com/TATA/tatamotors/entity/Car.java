package com.TATA.tatamotors.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Car {
    @Id
    @GeneratedValue
    private Long carId;
    private String carName;
    private String manufacturedYear;
    @ElementCollection
    private List<String> colours;
    @ElementCollection
    private List<String> paymentWays;
    @ElementCollection
    private List<String> cities;
    @ElementCollection
    private List<String> accessories;
    private String model;
    private String price;

}
