package com.example.reservation.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalTime;

@Entity
@Data
@Table(name = "RESTAURANT")
public class RestaurantModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "IDENTIFIER", unique = true, length = 128)
    private String identifier;
    @Column(name = "NAME", length = 128)
    private String name;
    @Column(name = "STREET", length = 128)
    private String street;
    @Column(name = "BUILDING_NUMBER", length = 128)
    private String buildingNumber;
    @Column(name = "CITY", length = 128)
    private String city;
    @Column(name = "POSTAL_CODE", length = 128)
    private String postalCode;
    @Column(name = "OPENING_HOURS")
    private LocalTime openingHours;
    @Column(name = "CLOSING_HOURS")
    private LocalTime closingHours;
    @Column(name = "RESTAURANT", columnDefinition = "TEXT", nullable = false)
    private String restaurant;

//    @Lob
//    @Column(name = "IMAGE", nullable = true)
//    private byte[] image;


}
