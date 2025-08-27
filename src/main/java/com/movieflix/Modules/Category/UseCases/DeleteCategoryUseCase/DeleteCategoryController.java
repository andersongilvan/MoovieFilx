package com.movieflix.Modules.Category.UseCases.DeleteCategoryUseCase;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movieflix/category")
public class DeleteCategoryController {

    @Autowired
    private DeleteCategoryService service;

    @DeleteMapping("/{id}")
    public ResponseEntity deleteCategory(@PathVariable Long id) {
        this.service.execute(id);

        return ResponseEntity.noContent().build();
    }

}
