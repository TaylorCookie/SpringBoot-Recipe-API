package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@CrossOrigin
@RestController
public class RecipeController {

    @Autowired
    private Repository repository;

    @GetMapping("/recipes")
    public Iterable<Recipe> get_recipes() {
        return repository.findAll();
    }

    @GetMapping("recipe/{id}")
    public Optional<Recipe> get_recipe_by_id(@PathVariable Integer id) {
        return repository.findById(id);
    }

    @PostMapping(path = "add-recipe")
    public Recipe add_recipe(@RequestBody Recipe recipe) {
        return repository.save(recipe);
    }

    @PutMapping("update-recipe/{id}")
    public Optional<Recipe> update_recipe(@PathVariable Integer id, @RequestBody Recipe newRecipe) {
        return repository.findById(id)
                .map(recipe -> {
                    recipe.setTitle(newRecipe.getTitle());
                    recipe.setTime(newRecipe.getTime());
                    recipe.setPrimaryTag(newRecipe.getPrimaryTag());
                    recipe.setServes(newRecipe.getServes());
                    recipe.setImageSrc(newRecipe.getImageSrc());
                    recipe.setFavorite(newRecipe.isFavorite());
                    recipe.setTags(newRecipe.getTags());
                    recipe.setIngredients(newRecipe.getIngredients());
                    recipe.setInstructions(newRecipe.getInstructions());
                    recipe.setNotes(newRecipe.getNotes());
                    return repository.save(recipe);
                });
    }

    @DeleteMapping("delete-recipe/{id}")
    public void delete_recipe(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}

