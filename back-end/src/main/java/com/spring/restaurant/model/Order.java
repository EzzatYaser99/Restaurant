package com.spring.restaurant.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data // generte getter setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order extends CategoryOrder {
    @Column(name = "price")
    private int price;

    @Column(name = "image")
    private String img;

    @Column(name = "description")
    @Lob
    private String description;

    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;

}
