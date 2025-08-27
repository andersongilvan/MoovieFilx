package com.movieflix.Modules.Category.UseCases.UpdateCategoryUseCase;


import com.movieflix.Modules.Category.DTO.CategoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movieflix/category")
public class UpdateCategoryController {

    @Autowired
    private UpdateCategoryService service;

    @PutMapping
    public ResponseEntity<CategoryDTO> updateCategory(@RequestBody CategoryDTO data) {
        var result = this.service.execute(data);

        return ResponseEntity.ok(result);
    }

}
