package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Member extends BaseEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String city;

    private String street;

    private String zipCode;

    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<Order>();
}
