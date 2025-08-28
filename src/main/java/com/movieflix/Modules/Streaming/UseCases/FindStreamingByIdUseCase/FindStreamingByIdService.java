package com.movieflix.Modules.Streaming.UseCases.FindStreamingByIdUseCase;


import com.movieflix.Modules.Exceptions.ResourceNotFoundException;
import com.movieflix.Modules.Streaming.DTO.StreamingDTO;
import com.movieflix.Modules.Streaming.Repository.StreamingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FindStreamingByIdService {

    @Autowired
    private StreamingRepository repository;

    public StreamingDTO execute(Long id) {

        var streaming = this.repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Streaming not found"));

        return new StreamingDTO(streaming.getId(), streaming.getName());

    }

}
