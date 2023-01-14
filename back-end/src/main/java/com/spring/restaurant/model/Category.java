package com.spring.restaurant.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Set;

@Data // generte getter setter
@NoArgsConstructor

@Entity
@Table(name = "category")
public class Category extends CategoryOrder {


 @OneToMany(mappedBy = "category")
 private Set<Order>orders;
}
