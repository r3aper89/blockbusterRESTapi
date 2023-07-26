package com.example.videostore.blockbuster.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// local packages
import com.example.videostore.blockbuster.dto.*;
import com.example.videostore.blockbuster.controller.*;
import com.example.videostore.blockbuster.service.*;

@RestController
public class VideoController {

    // use the VideoDaoService in the urls
    public VideoDaoService service;

    public VideoController(VideoDaoService service) {
        this.service = service;
    }

    @GetMapping("/videos")
    public List<Video> listAllVideos() {
        return service.getAllVideos();
    }
}
