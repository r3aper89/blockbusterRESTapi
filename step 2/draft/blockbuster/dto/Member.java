package com.example.videostore.blockbuster.dto;

import java.util.Objects;

//creating a java bean that is a combination of dto and model with boiler

public class Member {

    private Long memberId;
    private String name;
    private Video videoId;

    // constructor
    public Member(Long memberId, String name, Video videoId) {
        this.memberId = memberId;
        this.name = name;
        this.video = videoId;
    }

    // getters & setters
    public Long getMemberId() {
        return this.memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Video getVideoId() {
        return this.videoId;
    }

    public void setVideoId(Video videoId) {
        this.videoId = videoId;
    }

    // toString
    @Override
    public String toString() {
        return "{" +
                " memberId='" + getMemberId() + "'" +
                ", name='" + getName() + "'" +
                ", videoId='" + getVideoId() + "'" +
                "}";
    }

}
