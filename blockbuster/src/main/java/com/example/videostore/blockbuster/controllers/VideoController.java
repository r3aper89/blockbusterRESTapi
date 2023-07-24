package com.example.videostore.blockbuster.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.videostore.blockbuster.model.Video;
import com.example.videostore.blockbuster.service.VideoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/videos")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @GetMapping
    public List<Video> getAllVideos() {
        return videoService.getAllVideos();
    }

    @GetMapping("/{id}")
    public Optional<Video> getVideoById(@PathVariable Long id) {
        return videoService.getVideoById(id);
    }

    @PostMapping
    public Video createVideo(@RequestBody Video video) {
        return videoService.saveVideo(video);
    }

    @PutMapping("/{id}")
    public Video updateVideo(@PathVariable Long id, @RequestBody Video video) {
        return video;
        // Implement code to update video here
    }

    @DeleteMapping("/{id}")
    public void deleteVideo(@PathVariable Long id) {
        videoService.deleteVideo(id);
    }
}
