package com.spring.restaurant.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // generte getter setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "category")
public class Category  extends CategoryOrder{


}
