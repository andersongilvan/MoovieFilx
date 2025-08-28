package com.movieflix.Modules.Streaming.UseCases.SaveStreamingUseCase;


import com.movieflix.Modules.Exceptions.ResourceAlreadyExistException;
import com.movieflix.Modules.Streaming.DTO.CreateStreamingDTO;
import com.movieflix.Modules.Streaming.DTO.StreamingDTO;
import com.movieflix.Modules.Streaming.Entity.Streaming;
import com.movieflix.Modules.Streaming.Repository.StreamingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveStreamingService {

    @Autowired
    private StreamingRepository repository;

    public StreamingDTO execute(CreateStreamingDTO data) {
        // /verificar se o Streaming já esta cadastrado no banco de dados
        System.out.println(data.name().toUpperCase());
        this.repository.findByName(data.name().toUpperCase())
                .ifPresent((streaming) -> {
                    throw new ResourceAlreadyExistException("Streaming already exist");
                });

        var streaming = new Streaming(data);

        this.repository.save(streaming);

        return new StreamingDTO(streaming.getId(), streaming.getName());

    }

}
