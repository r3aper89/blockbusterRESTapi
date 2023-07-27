package com.example.videostore.blockbuster.dto;

public class Member {

    // variables
    private Integer memberId;
    private String name;
    private Integer videoId;

    // constructor
    public Member(Integer memberId, String name, Integer videoId) {
        super();
        this.memberId = memberId;
        this.name = name;
        this.videoId = videoId;
    }

    // getters and setters
    public Integer getMemberId() {
        return this.memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVideoId() {
        return this.videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    // to string
    @Override
    public String toString() {
        return "{" +
                " memberId='" + getMemberId() + "'" +
                ", name='" + getName() + "'" +
                ", videoId='" + getVideoId() + "'" +
                "}";
    }

}
