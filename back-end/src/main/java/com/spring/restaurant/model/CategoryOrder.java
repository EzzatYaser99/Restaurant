package com.spring.restaurant.model;

import jakarta.persistence.*;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;


@Data // generte getter setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class CategoryOrder extends BaseEntity {
    @Column(name = "name")
    private String name;


    @Column(name = "date-create")
    @CreationTimestamp
    private Date dateCreate;

    @Column(name = "date-update")
    @UpdateTimestamp
    private Date dateUpdate;
}
