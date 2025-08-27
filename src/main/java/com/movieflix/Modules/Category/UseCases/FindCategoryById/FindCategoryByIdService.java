package com.movieflix.Modules.Category.UseCases.FindCategoryById;


import com.movieflix.Modules.Category.Entity.Category;
import com.movieflix.Modules.Category.Exceptions.ResourceNotFoundException;
import com.movieflix.Modules.Category.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindCategoryByIdService {

    @Autowired
    private CategoryRepository repository;

    public Category execute(Long id) {
        return this.repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Category not found!"));
    }
}
