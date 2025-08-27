package com.movieflix.Modules.Category.UseCases.FindCategoryById;


import com.movieflix.Modules.Category.Entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movieflix/category")
public class FindCategoryByIdController {

    @Autowired
    private FindCategoryByIdService service;

    @GetMapping("/{id}")
    public ResponseEntity<Category> findCategoryById(@PathVariable Long id) {
        var result = this.service.execute(id);

        return ResponseEntity.ok(result);
    }

}
