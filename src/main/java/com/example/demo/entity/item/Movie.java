package com.example.demo.entity.item;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;

@Entity
@Getter
@DiscriminatorValue("M") //구분 컬럼 DTYPE에 입력될 값
public class Movie extends Item {

    private String director;
    private String actor;
}
