package com.spring.restaurant.controller;


import com.spring.restaurant.model.Category;
import com.spring.restaurant.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    private CategoryService categoryService ;

    @Autowired
    public CategoryController(CategoryService categoryService) {

        this.categoryService = categoryService;
    }

    // http://localhost:8080/api/allCategories

    @GetMapping("/api/allCategories")
    public List<Category>getAllCategory(){
        return categoryService.allCategories();

    }

}