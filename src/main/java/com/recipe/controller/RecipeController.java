//package com.recipe.controller;
//import com.recipe.model.Recipe;
//import com.recipe.service.RecipeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import com.recipe.service.SpoonacularService;
//import org.springframework.web.bind.annotation.RequestParam;
//import jakarta.validation.Valid;
//import java.util.List;
//
//@RestController
//@RequestMapping("/recipes")
//@CrossOrigin("*")
//public class RecipeController {
//
//    @Autowired
//    private SpoonacularService spoonacularService;
//
//    @Autowired
//    private RecipeService recipeService;
//
//    // Add Recipe API
//    @PostMapping
//    public Recipe addRecipe(@RequestBody Recipe recipe) {
//        return recipeService.addRecipe(recipe);
//    }
//
//    // Get All Recipes API
//    @GetMapping
//    public List<Recipe> getAllRecipes() {
//        return recipeService.getAllRecipes();
//    }
//    // Delete Recipe API
//    @DeleteMapping("/{id}")
//    public String deleteRecipe(@PathVariable Long id) {
//
//        recipeService.deleteRecipe(id);
//
//        return "Recipe Deleted Successfully";
//    }
//    // Search Recipe API
//    @GetMapping("/search")
//    public List<Recipe> searchRecipe(@RequestParam String title) {
//
//        return recipeService.searchRecipe(title);
//    }
//    @GetMapping("/external")
//    public String getExternalRecipes(
//            @RequestParam String query) {
//
//        return spoonacularService.searchRecipes(query);
//    }
//    @PutMapping("/{id}")
//    public Recipe updateRecipe(
//            @PathVariable Long id,
//            @RequestBody Recipe updatedRecipe) {
//
//        Recipe recipe = recipeService
//                .getRecipeById(id);
//
//        recipe.setTitle(updatedRecipe.getTitle());
//        recipe.setIngredients(updatedRecipe.getIngredients());
//        recipe.setInstructions(updatedRecipe.getInstructions());
//        recipe.setImageUrl(updatedRecipe.getImageUrl());
//
//        return recipeService.saveRecipe(recipe);
//    }
//
//}

package com.recipe.controller;

import com.recipe.service.SpoonacularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recipes")
@CrossOrigin("*")
public class RecipeController {

    @Autowired
    private SpoonacularService spoonacularService;

    @GetMapping("/external")
    public String getExternalRecipes(
            @RequestParam String query) {

        return spoonacularService.searchRecipes(query);
    }
}