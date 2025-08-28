package com.movieflix.Modules.Category.UseCases.SaveCategoryUseCase;


import com.movieflix.Modules.Category.DTO.CategoryDTO;
import com.movieflix.Modules.Category.DTO.CreateCategoryDTO;
import com.movieflix.Modules.Category.Entity.Category;
import com.movieflix.Modules.Exceptions.ResourceAlreadyExistException;
import com.movieflix.Modules.Category.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveCategoryService {

    @Autowired
    private CategoryRepository repository;

    public CategoryDTO execute(CreateCategoryDTO data) {

        // Verificar se a categoria já está cadastrada

        this.repository.findByName(data.name().toUpperCase())
                .ifPresent((category) -> {
                    throw new ResourceAlreadyExistException("Category already exist");
                });

        var category = new Category(data);

        this.repository.save(category);

        return new CategoryDTO(category.getId(), category.getName());

    }

}
