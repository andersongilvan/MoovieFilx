package com.movieflix.Modules.Streaming.UseCases.UpdateStreamingUseCase;


import com.movieflix.Modules.Streaming.DTO.StreamingDTO;
import com.movieflix.Modules.Streaming.DTO.UpdateStreamingDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movieflix/streaming")
public class UpdateStreamingController {

    @Autowired
    private UpdateStreamingService service;

    @PutMapping
    public ResponseEntity<StreamingDTO> updateStreaming(
            @RequestBody @Valid UpdateStreamingDTO data) {

        var result = this.service.execute(data);

        return ResponseEntity.ok(result);

    }

}

