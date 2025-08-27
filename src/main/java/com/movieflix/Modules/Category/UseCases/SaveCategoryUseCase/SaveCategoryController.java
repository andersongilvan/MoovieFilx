package com.movieflix.Modules.Category.UseCases.SaveCategoryUseCase;

import com.movieflix.Modules.Category.DTO.CategoryDTO;
import com.movieflix.Modules.Category.DTO.CreateCategoryDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movieflix/category")
public class SaveCategoryController {

    @Autowired
    private SaveCategoryService service;

    @PostMapping
    public ResponseEntity<CategoryDTO> saveCategory(@RequestBody @Valid CreateCategoryDTO data) {
        var result = this.service.execute(data);

        System.out.println(result.toString());

        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

}
