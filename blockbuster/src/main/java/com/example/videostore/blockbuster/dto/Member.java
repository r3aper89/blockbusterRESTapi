package com.example.videostore.blockbuster.dto;

public class Member {

    // variables
    private int memberId;
    private String name;
    private int videoId;

    // constructor
    public Member(int memberId, String name, int videoId) {
        super();
        this.memberId = memberId;
        this.name = name;
        this.videoId = videoId;
    }

    // getters and setters
    public int getMemberId() {
        return this.memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVideoId() {
        return this.videoId;
    }

    public void setVideoId(int videoId) {
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
