package com.example.videostore.blockbuster.dto;

//creating a java bean that is a combination of dto and model with boiler

public class Video {

    // variables
    private int videoId;
    private String title;
    private String status;

    // contractor
    public Video(int videoId, String title, String status) {
        super();
        this.videoId = videoId;
        this.title = title;
        this.status = status;
    }

    // getters and setters

    public int getVideoId() {
        return this.videoId;
    }

    public void setVideoId(int videoId) {
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
