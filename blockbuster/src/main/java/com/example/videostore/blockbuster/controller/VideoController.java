package com.example.videostore.blockbuster.controller;

import java.net.URI;
import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PatchExchange;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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

    // list all videos
    @GetMapping("/videos")
    public List<Video> showAllVideos() {
        return service.findAllVideos();
    }

    // get vid by id
    @GetMapping("/videos/{id}")
    public Video showVideoById(@PathVariable int id) {
        return service.findVideoById(id);
    }

    // add new video
    // @PostMapping("/videos")
    // public ResponseEntity<Video> createVideo(@RequestBody Video video) {
    // Video saveVideo = service.save(video);
    // URI location = ServletUriComponentsBuilder.fromCurrentRequest()
    // .path("/{id}")
    // .buildAndExpand(saveVideo.getVideoId())
    // .toUri();
    // return ResponseEntity.created(location).build();
    // }

}
