package by.glavdel.recipeapp.controllers;

import by.glavdel.recipeapp.domain.Category;
import by.glavdel.recipeapp.domain.UnitOfMeasure;
import by.glavdel.recipeapp.repositories.CategoryRepository;
import by.glavdel.recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final CategoryRepository categoryRepository;
    private final UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository,
                           UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {
        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Cup");
        System.out.println("Cat id is " + categoryOptional.get().getId());
        System.out.println("Uom id is " + unitOfMeasure.get().getId());
        return "index";
    }

}
