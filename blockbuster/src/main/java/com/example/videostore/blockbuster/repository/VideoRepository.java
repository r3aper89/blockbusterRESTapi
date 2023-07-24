package com.example.videostore.blockbuster.repository;

import com.example.videostore.blockbuster.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends JpaRepository<Video, Long> {
    // Custom queries if any
}
