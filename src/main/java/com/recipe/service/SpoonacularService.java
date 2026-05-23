package com.recipe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SpoonacularService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${spoonacular.api.key}")
    private String apiKey;

    public String searchRecipes(String query) {

        String url =
                "https://api.spoonacular.com/recipes/complexSearch?query="
                        + query
                        + "&apiKey="
                        + apiKey;

        return restTemplate.getForObject(url, String.class);
    }
}