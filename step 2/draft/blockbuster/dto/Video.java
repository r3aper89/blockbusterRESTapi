package com.example.videostore.blockbuster.dto;

import java.util.Objects;

//creating a java bean that is a combination of dto and model with boiler

public class Video {

    private Long videoId;
    private String title;
    private String status;

    public Video(Long videoId, String title, String status) {
        this.videoId = videoId;
        this.title = title;
        this.status = status;
    }

    // getters and setters

    public Long getVideoId() {
        return this.videoId;
    }

    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // toString
    @Override
    public String toString() {
        return "{" +
                " videoId='" + getVideoId() + "'" +
                ", title='" + getTitle() + "'" +
                ", status='" + getStatus() + "'" +
                "}";
    }

}
