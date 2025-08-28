package com.movieflix.Modules.Category.UseCases.FindAllCategoryUseCase;

import com.movieflix.Modules.Category.DTO.CategoryDTO;
import com.movieflix.Modules.Category.Entity.Category;
import com.movieflix.Modules.Category.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FindAllCategoriesService {

    @Autowired
    private CategoryRepository repository;


    public Page<CategoryDTO> execute(Pageable page) {

        var allCategories = this.repository.findAll(page);

        return allCategories.map(c -> new CategoryDTO(c.getId(), c.getName()));

    }

}
