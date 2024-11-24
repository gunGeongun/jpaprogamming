package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class OrderItem {

    @Id
    @GeneratedValue
    private Long id;

    private Long orderId;

    private Long itemId;

    private int orderPrice;

    private int Count;
}
