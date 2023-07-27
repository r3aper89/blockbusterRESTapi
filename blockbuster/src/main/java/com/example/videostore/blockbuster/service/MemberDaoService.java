package com.example.videostore.blockbuster.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

//local packages
import com.example.videostore.blockbuster.dto.*;
import com.example.videostore.blockbuster.controller.*;
import com.example.videostore.blockbuster.service.*;

@Component
public class MemberDaoService {

    private static List<MemberDto> members = new ArrayList<>();

    private static int memberIdCount = 0;

    static {
        members.add(new MemberDto(++memberIdCount, "James", 5));
        members.add(new MemberDto(++memberIdCount, "Tim", 2));
    }

    // add new member
    public MemberDto addMember(MemberDto member) {
        member.setMemberId(++memberIdCount); // auto increment memberid
        members.add(member);
        return member;
    }

    // get all videos
    public List<MemberDto> findAllMembers() {
        return members;
    }

    // get video by id
    public MemberDto findMemberById(int id) {
        Predicate<? super MemberDto> predicate = member -> member.getVideoId().equals(id);
        return members.stream().filter(predicate).findFirst().get();
    }

}
