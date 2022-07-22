package by.glavdel.recipeapp.repositories;

import by.glavdel.recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;


public interface RecipeRepository extends CrudRepository<Recipe, Integer> {

}
