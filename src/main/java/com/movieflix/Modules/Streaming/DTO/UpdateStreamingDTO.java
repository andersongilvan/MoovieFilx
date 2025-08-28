package com.movieflix.Modules.Streaming.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UpdateStreamingDTO(
        @NotNull(message = "Required field")
        Long id,
        @NotBlank(message = "Required field")
        String name) {
}
