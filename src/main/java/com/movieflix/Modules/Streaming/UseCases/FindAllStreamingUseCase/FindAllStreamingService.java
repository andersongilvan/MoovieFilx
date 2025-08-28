package com.movieflix.Modules.Streaming.UseCases.FindAllStreamingUseCase;


import com.movieflix.Modules.Streaming.DTO.StreamingDTO;
import com.movieflix.Modules.Streaming.Repository.StreamingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FindAllStreamingService {

    @Autowired
    private StreamingRepository repository;

    public Page<StreamingDTO> execute(Pageable page) {

        var allStreamings = this.repository.findAll(page);

        return allStreamings.map(s -> new StreamingDTO(s.getId(), s.getName()));

    }

}
