package com.movieflix.Modules.Streaming.UseCases.FindStreamingByIdUseCase;

import com.movieflix.Modules.Streaming.DTO.StreamingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/moviefilx/streaming")
public class FindStreamingByIdController {

    @Autowired
    private FindStreamingByIdService service;

    @GetMapping("/{id}")
    public ResponseEntity<StreamingDTO> findStreamingById(@PathVariable Long id) {
        var result = this.service.execute(id);

        return ResponseEntity.ok(result);
    }

}
