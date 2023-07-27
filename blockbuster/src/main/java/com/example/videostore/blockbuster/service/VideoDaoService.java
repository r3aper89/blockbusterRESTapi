package com.example.videostore.blockbuster.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import java.util.function.Predicate;

//local packages
import com.example.videostore.blockbuster.dto.*;
import com.example.videostore.blockbuster.controller.*;
import com.example.videostore.blockbuster.service.*;

@Component
public class VideoDaoService {

    private static List<Video> videos = new ArrayList<>();

    private static int videoIdCount = 0;

    static {
        videos.add(new Video(++videoIdCount, "Madagascar", "Available"));
        videos.add(new Video(++videoIdCount, "Madagascar: Escape 2 Africa", "Rented"));
        videos.add(new Video(++videoIdCount, "Madagascar 3: Europes Most Wanted", "Available"));
        videos.add(new Video(++videoIdCount, "Madly Madagascar", "Available"));
        videos.add(new Video(++videoIdCount, "Penguins of Madagascar", "Rented"));
    }

    // add new video
    public Video addVideo(Video video) {
        video.setVideoId(++videoIdCount);// auto increment video id
        videos.add(video);
        return video;
    }

    // get all videos
    public List<Video> findAllVideos() {
        return videos;
    }

    // get video by id
    public Video findVideoById(int id) {
        Predicate<? super Video> predicate = video -> video.getVideoId().equals(id);
        return videos.stream().filter(predicate).findFirst().get();
    }

}
