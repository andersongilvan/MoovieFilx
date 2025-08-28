package com.movieflix.Modules.Streaming.UseCases.DeleteStreamingUseCase;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/moviefilx/streaming")
public class DeleteStreamingController {

    @Autowired
    private DeleteStreamingService service;

    @DeleteMapping("/{id}")
    public ResponseEntity deleteStreaming(@PathVariable Long id) {
        this.service.execute(id);

        return ResponseEntity.noContent().build();
    }

}
