package com.spring.restaurant.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // generte getter setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryOrder extends BaseEntity{
    private String categoryName;
}
