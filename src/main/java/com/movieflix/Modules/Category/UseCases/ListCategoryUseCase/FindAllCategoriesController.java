package com.movieflix.Modules.Category.UseCases.ListCategoryUseCase;


import com.movieflix.Modules.Category.Entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/movieflix/category")
public class FindAllCategoriesController {

    @Autowired
    private FindAllCategoriesService service;

    @GetMapping()
    public ResponseEntity<Page<Category>> saveCategory(@PageableDefault(page = 0, size = 10, sort = "name")
                                                       Pageable pageable) {
        var result = service.execute(pageable);

        return ResponseEntity.ok(result);
    }

}
