package com.example.videostore.blockbuster.service;

import java.util.ArrayList;
import java.util.List;
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

    // auto increase member id counter
    public Member save(Member member) {
        member.setMemberId(++memberIdCount);
        members.add(member);
        return member;
    }

    // get all videos
    public List<Member> getAllMembers() {
        return members;
    }

    // 
}
