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

    private static List<Member> members = new ArrayList<>();

    private static int memberIdCount = 0;

    static {
        members.add(new Member(++memberIdCount, "James", 5));
        members.add(new Member(++memberIdCount, "Tim", 2));
    }

    // add new member
    public Member addMember(Member member) {
        member.setMemberId(++memberIdCount); // auto increment memberid
        members.add(member);
        return member;
    }

    // get all videos
    public List<Member> findAllMembers() {
        return members;
    }

    // get video by id
    public Member findMemberById(int id) {
        Predicate<? super Member> predicate = member -> member.getVideoId().equals(id);
        return members.stream().filter(predicate).findFirst().get();
    }

}
