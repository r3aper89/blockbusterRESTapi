package com.example.videostore.blockbuster.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

//local packages
import com.example.videostore.blockbuster.dto.*;
import com.example.videostore.blockbuster.controller.*;
import com.example.videostore.blockbuster.service.*;

@Component
public class VideoDaoService {

    private static List<Video> videos = new ArrayList<>();

    static {
        videos.add(new Video(1, "Madagascar", "Available"));
        videos.add(new Video(2, "Madagascar: Escape 2 Africa", "Rented"));
        videos.add(new Video(3, "Madagascar 3: Europes Most Wanted", "Available"));
        videos.add(new Video(4, "Madly Madagascar", "Available"));
        videos.add(new Video(5, "Penguins of Madagascar", "Rented"));
    }

    public List<Video> getAllVideos() {
        return videos;
    }

}
