package com.example.videostore.blockbuster.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
    public List<Member> listAllMembers() {
        return service.getAllMembers();
    }

    //add new video
    @PostMapping("/members")
    public ResponseEntity<Video> createMember(@RequestBody Member member) {
        Member saveMember = service.save(member);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(saveMember.getVideoId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    // list specific member

}
