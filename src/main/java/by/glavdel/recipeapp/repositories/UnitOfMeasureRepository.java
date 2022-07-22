package by.glavdel.recipeapp.repositories;

import by.glavdel.recipeapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Integer> {
    Optional<UnitOfMeasure> findByDescription(String description);

}
