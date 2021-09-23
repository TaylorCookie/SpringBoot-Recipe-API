package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface Repository extends CrudRepository<Recipe, Integer> {
    Recipe findRecipeById(Integer id);
}
