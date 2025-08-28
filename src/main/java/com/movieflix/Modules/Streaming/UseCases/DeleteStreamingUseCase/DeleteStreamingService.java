package com.movieflix.Modules.Streaming.UseCases.DeleteStreamingUseCase;


import com.movieflix.Modules.Streaming.Repository.StreamingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteStreamingService {

    @Autowired
    private StreamingRepository repository;

    public void execute(Long id) {
        this.repository.deleteById(id);
    }

}
