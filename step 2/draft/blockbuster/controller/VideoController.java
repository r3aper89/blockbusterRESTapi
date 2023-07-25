package com.example.videostore.blockbuster.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.videostore.blockbuster.dto.Video;

@RestController
public class VideoController {

    public VideoController controller;

    public VideoController(VideoController controller) {
        this.controller = controller;
    }

    @GetMapping(path = "/video")
    public List<Video> retrieveAllVideos() {
        return controller.findAll();
    }

}
