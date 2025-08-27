package com.movieflix.Modules.Category.UseCases.ListCategoryUseCase;

import com.movieflix.Modules.Category.Entity.Category;
import com.movieflix.Modules.Category.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindAllCategoriesService {

    @Autowired
    private CategoryRepository repository;


    public Page<Category> execute(Pageable page)  {
        return this.repository.findAll(page);
    }


}
