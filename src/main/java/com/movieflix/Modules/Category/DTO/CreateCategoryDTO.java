package com.movieflix.Modules.Category.DTO;

import jakarta.validation.constraints.NotBlank;

public record CreateCategoryDTO(
        @NotBlank(message = "Required field")
        String name) {
}
