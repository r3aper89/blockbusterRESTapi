package com.example.videostore.blockbuster.service;

//local 
import com.example.videostore.blockbuster.dto.*;
import com.example.videostore.blockbuster.entity.*;
import com.example.videostore.blockbuster.controller.*;
import com.example.videostore.blockbuster.service.*;

import io.swagger.v3.oas.annotations.servers.Server;

import com.example.videostore.blockbuster.dao.*;

//importa
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service
public class MemberService {

    private MemberDao memberDao;

    @Autowired
    public MemberService(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    // get member by id
    public List<MemberDto> findAllMembers() {
        List<MemberDto> members = new ArrayList<>();
        return members;
    }

    // // add new member
    // public MemberDto addMember(MemberDto member) {
    // member.setMemberId(++memberIdCount); // auto increment memberid
    // members.add(member);
    // return member;
    // }

    // // get member by id
    // public MemberDto findMemberById(int id) {
    // Predicate<? super MemberDto> predicate = member ->
    // member.getVideoId().equals(id);
    // return members.stream().filter(predicate).findFirst().get();
    // }

    // // delete member by id
    // public void deleteMemberById(int id) {
    // Predicate<? super MemberDto> predicate = member ->
    // member.getMemberId().equals(id);
    // members.removeIf(predicate);
    // }

    // // update member videoId
    // public MemberDto changeMemberVideoId(Integer id, Integer videoId) {
    // for (MemberDto member : members) {
    // if (member.getMemberId().equals(id)) {
    // member.setVideoId(videoId);
    // return member;
    // }
    // }
    // return null;
    // }

}
