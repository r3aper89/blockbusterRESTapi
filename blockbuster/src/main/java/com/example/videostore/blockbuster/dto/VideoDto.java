package com.example.videostore.blockbuster.dto;

//creating a java bean that is a combination of dto and model with boiler

public class VideoDto {

    // variables
    private Integer videoId;
    private String title;
    private String status;

    // constructor
    public VideoDto(Integer videoId, String title, String status) {
        super();
        this.videoId = videoId;
        this.title = title;
        this.status = status;
    }

    // getters and setters
    public Integer getVideoId() {
        return this.videoId;
    }

    public void setVideoId(Integer videoId) {
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
