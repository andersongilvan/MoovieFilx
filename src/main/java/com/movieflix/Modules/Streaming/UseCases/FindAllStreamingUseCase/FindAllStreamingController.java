package com.movieflix.Modules.Streaming.UseCases.FindAllStreamingUseCase;


import com.movieflix.Modules.Streaming.DTO.StreamingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/moviefilx/streaming")
public class FindAllStreamingController {

    @Autowired
    private FindAllStreamingService service;

    @GetMapping
    public ResponseEntity<Page<StreamingDTO>> findAllStreamings
            (@PageableDefault(size = 10, sort = "name") Pageable page) {

        var result = this.service.execute(page);

        return ResponseEntity.ok(result);
    }
}
