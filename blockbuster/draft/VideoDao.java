package com.example.videostore.blockbuster.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class VideoDao {
    
    private VideoService videoService;

    @Autowired
    public VideoDao(VideoService videoService) {
        this.videoService = videoService;
    }

    public List<VideoDto> showAllVideos() {
        return videoService.findAllVideos();
    }

    

}
