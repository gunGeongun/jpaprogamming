package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;

import java.util.Date;

@Entity
@Getter
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    private Long memberId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;




}
