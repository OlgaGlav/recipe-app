package by.glavdel.recipeapp.services;

import by.glavdel.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
