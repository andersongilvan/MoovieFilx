package com.movieflix.Modules.Category.UseCases.UpdateCategoryUseCase;


import com.movieflix.Modules.Category.DTO.CategoryDTO;
import com.movieflix.Modules.Exceptions.ResourceNotFoundException;
import com.movieflix.Modules.Category.Repository.CategoryRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateCategoryService {

    @Autowired
    private CategoryRepository repository;

    @Transactional
    public CategoryDTO execute(CategoryDTO data) {
        // Verificar se a categoria existe no banco de dados
        var category = this.repository.findById(data.id())
                .orElseThrow(() -> new ResourceNotFoundException("Category not found"));

        category.update(data.name());

        return new CategoryDTO(category.getId(), category.getName());
    }

}
