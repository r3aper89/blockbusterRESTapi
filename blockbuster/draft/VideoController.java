package com.example.videostore.blockbuster.controller;

import java.net.URI;
import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.videorDao.annotation.PatchExchange;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

// local packages
import com.example.videostore.blockbuster.dto.*;
import com.example.videostore.blockbuster.controller.*;
import com.example.videostore.blockbuster.dao.VideoDao;
import com.example.videostore.blockbuster.videorDao.*;

@RestController
public class VideoController {

    // use the VideoDaoService in the urls
    public VideoDao videorDao;

    @Autowired
    public VideoController(VideoDao videorDao) {
        this.videorDao = videorDao;
    }

    // list all videos
    @GetMapping("/videos")
    public List<VideoDto> showAllVideos() {
        return videorDao.findAllVideos();
    }

    // get vid by id
    @GetMapping("/videos/{id}")
    public VideoDto showVideoById(@PathVariable int id) {
        return videorDao.findVideoById(id);
    }

    // delete by id
    @DeleteMapping("/videos/{id}")
    public void deleteVideo(@PathVariable int id) {
        videorDao.deleteVideoById(id);
    }

    // add new video
    // POST {title:"...", status"..."} videoId will auto generate
    @PostMapping("/videos")
    public ResponseEntity<VideoDto> addNewVideo(@RequestBody VideoDto video) {
        VideoDto saveVideo = videorDao.addVideo(video);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(saveVideo.getVideoId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    // update video status
    // PUT {status:"..."} change the video status
    @PutMapping("/videos/{id}")
    public ResponseEntity<VideoDto> updateVideoStatus(@PathVariable Integer id, @RequestBody VideoDto video) {
        VideoDto updateVideo = videorDao.changeVideoStatus(Integer.valueOf(id), video.getStatus());
        if (updateVideo != null) {
            return new ResponseEntity<>(updateVideo, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
