package com.movieflix.Modules.Streaming.UseCases.SaveStreamingUseCase;


import com.movieflix.Modules.Streaming.DTO.CreateStreamingDTO;
import com.movieflix.Modules.Streaming.DTO.StreamingDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/moviefilx/streaming")
public class SaveStreamingController {

    @Autowired
    private SaveStreamingService service;

    @PostMapping
    public ResponseEntity<StreamingDTO> saveStreaming(@RequestBody @Valid CreateStreamingDTO data) {
        var result = this.service.execute(data);

        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

}
