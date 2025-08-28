package com.movieflix.Modules.Streaming.Repository;

import com.movieflix.Modules.Streaming.Entity.Streaming;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface StreamingRepository extends JpaRepository<Streaming, Long> {
    Optional<Streaming> findByName(String name);
}
