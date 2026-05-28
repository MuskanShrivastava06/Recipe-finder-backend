//package com.recipe.service;
//import com.recipe.model.Recipe;
//import com.recipe.repository.RecipeRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class RecipeService {
//
//    @Autowired
//    private RecipeRepository recipeRepository;
//
//    // Add Recipe
//    public Recipe addRecipe(Recipe recipe) {
//        return recipeRepository.save(recipe);
//    }
//
//    // Get All Recipes
//    public List<Recipe> getAllRecipes() {
//        return recipeRepository.findAll();
//    }
//    // Delete Recipe
//    public void deleteRecipe(Long id) {
//        recipeRepository.deleteById(id);
//    }
//    // Search Recipe
//    public List<Recipe> searchRecipe(String title) {
//        return recipeRepository.findByTitleContaining(title);
//    }
//    public Recipe getRecipeById(Long id) {
//        return recipeRepository.findById(id).orElse(null);
//    }
//
//    public Recipe saveRecipe(Recipe recipe) {
//        return recipeRepository.save(recipe);
//    }
//}
