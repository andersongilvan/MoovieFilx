package com.movieflix.Modules.Streaming.DTO;

import jakarta.validation.constraints.NotBlank;

public record CreateStreamingDTO(
        @NotBlank(message = "Required field")
        String name) {
}
