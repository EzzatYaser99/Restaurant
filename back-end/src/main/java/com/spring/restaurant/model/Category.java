package com.spring.restaurant.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Data // generte getter setter
@NoArgsConstructor

@Entity
@Table(name = "category")
public class Category extends CategoryOrder {


}
