package com.example.videostore.blockbuster.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/members")
    public List<Member> listAllVideos() {
        return service.getAllMembers();
    }
}
