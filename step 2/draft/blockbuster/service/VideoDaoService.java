package com.example.videostore.blockbuster.service;

import java.nio.channels.MembershipKey;
import java.util.ArrayList;
import java.util.List;

import main.java.com.example.videostore.blockbuster.dto.Video;

public class VideoDaoService {

    // JPA/hybernate > Database
    // videoDaoService > static list

    private static List<Video> videos = new ArrayList<>(null);
    static {
        videos.add(new Video(1, "Madagascar", "Available"));
        videos.add(new Video(2, "Madagascar: Escape 2 Africa", "Rented"));
        videos.add(new Video(3, "Madagascar 3: Europes Most Wanted", "Available"));
        videos.add(new Video(4, "Madly Madagascar", "Available"));
        videos.add(new Video(5, "Penguins of Madagascar", "Rented"));
    }

    public List<Video> findAll() {
        return videos;
    }

    // list of videos
    // list available and unavailable videos
    // save video
    // find video by id
}
