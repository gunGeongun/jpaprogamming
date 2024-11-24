package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Member {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String city;

    private String street;

    private String zipCode;
}
