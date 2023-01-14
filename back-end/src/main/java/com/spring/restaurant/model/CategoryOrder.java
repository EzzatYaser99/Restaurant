package com.spring.restaurant.model;

import jakarta.persistence.*;

import lombok.*;


@Data // generte getter setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class CategoryOrder extends BaseEntity {
    @Column(name = "name")
    private String name;
}
