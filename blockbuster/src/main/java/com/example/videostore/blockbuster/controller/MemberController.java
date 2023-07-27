package com.example.videostore.blockbuster.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

// local packages
import com.example.videostore.blockbuster.dto.*;
import com.example.videostore.blockbuster.controller.*;
import com.example.videostore.blockbuster.service.*;

@RestController
public class MemberController {

    public MemberDaoService service;

    public MemberController(MemberDaoService service) {
        this.service = service;
    }

    // list all members
    @GetMapping("/members")
    public List<Member> showAllMembers() {
        return service.findAllMembers();
    }

    // get member by id
    @GetMapping("/members/{id}")
    public Member showMemberById(@PathVariable int id) {
        return service.findMemberById(id);
    }

    // add new video
    // POST {name:"...", videoId"..."} memberId will auto generate
    @PostMapping("/members")
    public ResponseEntity<Video> addNewMember(@RequestBody Member member) {
        Member saveMember = service.addMember(member);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(saveMember.getMemberId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    // list specific member

}
