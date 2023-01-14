package com.spring.restaurant.model;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // generte getter setter
@NoArgsConstructor
@AllArgsConstructor

public class CategoryOrder extends BaseEntity{
    @Column(name = "name")
    private String name;
}
