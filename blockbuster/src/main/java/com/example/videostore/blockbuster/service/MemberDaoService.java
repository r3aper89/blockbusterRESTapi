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

    // get member by id
    public List<MemberDto> findAllMembers() {
        return members;
    }

    // get member by id
    public MemberDto findMemberById(int id) {
        Predicate<? super MemberDto> predicate = member -> member.getVideoId().equals(id);
        return members.stream().filter(predicate).findFirst().get();
    }

    // delete member by id
    public void deleteMemberById(int id) {
        Predicate<? super MemberDto> predicate = member -> member.getMemberId().equals(id);
        members.removeIf(predicate);
    }

    // update member videoId
    public MemberDto changeMemberVideoId(Integer id, Integer videoId) {
        for (MemberDto member : members) {
            if (member.getMemberId().equals(id)) {
                member.setVideoId(videoId);
                return member;
            }
        }
        return null;
    }

}
