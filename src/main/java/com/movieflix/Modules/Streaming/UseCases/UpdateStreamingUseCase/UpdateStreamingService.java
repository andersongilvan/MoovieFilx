package com.movieflix.Modules.Streaming.UseCases.UpdateStreamingUseCase;


import com.movieflix.Modules.Exceptions.ResourceNotFoundException;
import com.movieflix.Modules.Streaming.DTO.StreamingDTO;
import com.movieflix.Modules.Streaming.DTO.UpdateStreamingDTO;
import com.movieflix.Modules.Streaming.Repository.StreamingRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateStreamingService {

    @Autowired
    private StreamingRepository repository;

    @Transactional
    public StreamingDTO execute(UpdateStreamingDTO data) {
        // Verificar se o streaming existe no banco de dados
        var streaming = this.repository.findById(data.id())
                .orElseThrow(() -> new ResourceNotFoundException("Streaming not found"));

        streaming.update(data.name());

        return new StreamingDTO(streaming.getId(), streaming.getName());

    }

}
