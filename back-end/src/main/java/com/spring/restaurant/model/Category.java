package com.spring.restaurant.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;
import net.minidev.json.annotate.JsonIgnore;

import java.util.Set;

@Data // generte getter setter
@NoArgsConstructor

@Entity
@Table(name = "category")
public class Category extends CategoryOrder {

 @Column(name = "categorylogo")
 private String Logo;
 @JsonIgnore
 @OneToMany(mappedBy = "category")
 private Set<Order>orders;
}
