package com.example.videostore.blockbuster.repository;

import net.javaguides.springboot.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface videosRepository extends JpaRepository<videosModel, Integer> {

}
