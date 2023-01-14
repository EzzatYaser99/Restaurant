package com.spring.restaurant.model;


import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // generte getter setter
@NoArgsConstructor
@AllArgsConstructor

public class BaseEntity {

    @Column(name = "id")
    private long id;

}
