package com.movieflix.Modules.Streaming.Entity;


import com.movieflix.Modules.Streaming.DTO.CreateStreamingDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "tb_streamings")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Streaming {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    public Streaming(CreateStreamingDTO data) {
        this.name = data.name().toUpperCase();
    }

    public void update(String name) {
        this.name = name;
    }

}
