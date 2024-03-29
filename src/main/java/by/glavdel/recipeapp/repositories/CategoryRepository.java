package by.glavdel.recipeapp.repositories;

import by.glavdel.recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Integer> {

    Optional<Category> findByDescription(String description);
}
