package com.example.videostore.blockbuster.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import java.util.function.Predicate;

//local packages
import com.example.videostore.blockbuster.dto.*;
import com.example.videostore.blockbuster.controller.*;
import com.example.videostore.blockbuster.service.*;

import io.swagger.v3.oas.annotations.servers.Server;

@Server
public class VideoService {

    private static List<VideoDto> videos = new ArrayList<>();

    // private static int videoIdCount = 0;

    // static {
    // videos.add(new VideoDto(++videoIdCount, "Madagascar", "Available"));
    // videos.add(new VideoDto(++videoIdCount, "Madagascar: Escape 2 Africa",
    // "Rented"));
    // videos.add(new VideoDto(++videoIdCount, "Madagascar 3: Europes Most Wanted",
    // "Available"));
    // videos.add(new VideoDto(++videoIdCount, "Madly Madagascar", "Available"));
    // videos.add(new VideoDto(++videoIdCount, "Penguins of Madagascar", "Rented"));
    // }

    // add new video
    public VideoDto addVideo(VideoDto video) {
        video.setVideoId(++videoIdCount);// auto increment video id
        videos.add(video);
        return video;
    }

    // get all videos
    public List<VideoDto> findAllVideos() {
        return videos;
    }

    // get video by id
    public VideoDto findVideoById(int id) {
        Predicate<? super VideoDto> predicate = video -> video.getVideoId().equals(id);
        return videos.stream().filter(predicate).findFirst().get();
    }

    // delete video by id
    public void deleteVideoById(int id) {
        Predicate<? super VideoDto> predicate = video -> video.getVideoId().equals(id);
        videos.removeIf(predicate);
    }

    // update video status
    public VideoDto changeVideoStatus(Integer id, String status) {
        for (VideoDto video : videos) {
            if (video.getVideoId().equals(id)) {
                video.setStatus(status);
                return video;
            }
        }
        return null;
    }
}
