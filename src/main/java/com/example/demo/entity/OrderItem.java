package com.example.demo.entity;

import com.example.demo.entity.item.Item;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class OrderItem {

    @Id
    @GeneratedValue
    private Long id;

    private int orderPrice;

    private int Count;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    public void setOrder(Order order) {
        this.order = order;
    }
}
