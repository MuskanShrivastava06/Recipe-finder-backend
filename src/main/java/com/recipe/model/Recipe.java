//package com.recipe.model;
//import jakarta.persistence.*;
//import jakarta.validation.constraints.NotBlank;
//@Entity
//@Table(name = "recipes")
//public class Recipe {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
////    private String title;
//@NotBlank(message = "Title is required")
//private String title;
////    private String ingredients;
//@NotBlank(message = "Ingredients are required")
//private String ingredients;
////    private String instructions;
//@NotBlank(message = "Instructions are required")
//private String instructions;
//    private String imageUrl;
//
//    public Recipe(Long id, String title, String ingredients, String instructions, String imageUrl) {
//        this.id = id;
//        this.title = title;
//        this.ingredients = ingredients;
//        this.instructions = instructions;
//        this.imageUrl = imageUrl;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getIngredients() {
//        return ingredients;
//    }
//
//    public void setIngredients(String ingredients) {
//        this.ingredients = ingredients;
//    }
//
//    public String getInstructions() {
//        return instructions;
//    }
//
//    public void setInstructions(String instructions) {
//        this.instructions = instructions;
//    }
//
//    public String getImageUrl() {
//        return imageUrl;
//    }
//
//    public void setImageUrl(String imageUrl) {
//        this.imageUrl = imageUrl;
//    }
//}

package com.recipe.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "recipes")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Title is required")
    @Size(min = 3, message = "Title must be at least 3 characters")
    @Column(unique = true)
    private String title;

    @NotBlank(message = "Ingredients are required")
    @Size(min = 5, message = "Ingredients must be at least 5 characters")
    private String ingredients;

    @NotBlank(message = "Instructions are required")
    @Size(min = 10, message = "Instructions must be at least 10 characters")
    private String instructions;

    @NotBlank(message = "Image URL is required")
    private String imageUrl;

    public Recipe() {
    }

    public Recipe(Long id, String title, String ingredients,
                  String instructions, String imageUrl) {

        this.id = id;
        this.title = title;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}