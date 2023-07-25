package com.example.videostore.blockbuster.service;

import java.util.ArrayList;
import java.util.List;

import com.example.videostore.blockbuster.dto.Member;

import main.java.com.example.videostore.blockbuster.dto.Video;

public class MemberDaoService {

    private static List<Member> members = new ArrayList<>(null);
    static {
        members.add(new member(1, "James", 5));
        members.add(new member(2, "Tim", 2));
    }

    public List<Member> findAll() {
        return members;
    }

}
