package com.spring.restaurant.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Data // generte getter setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order")
public class Category extends CategoryOrder {


}
