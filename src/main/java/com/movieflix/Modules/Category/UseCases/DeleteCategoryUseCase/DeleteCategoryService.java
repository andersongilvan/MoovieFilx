package com.movieflix.Modules.Category.UseCases.DeleteCategoryUseCase;


import com.movieflix.Modules.Category.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteCategoryService {

    @Autowired
    private CategoryRepository repository;

    public void execute(Long id) {
        this.repository.deleteById(id);
    }

}
