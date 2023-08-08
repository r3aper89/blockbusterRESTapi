package com.example.videostore.blockbuster.controller;

//local
import com.example.videostore.blockbuster.dto.*;
import com.example.videostore.blockbuster.entity.*;
import com.example.videostore.blockbuster.controller.*;
import com.example.videostore.blockbuster.service.*;
import com.example.videostore.blockbuster.dao.*;

//imported
import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//interact with the browser 

@RestController
@RequestMapping("/members")
public class MemberController {

    public MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    // Read: get
    // Description: Retrieves the details of a specific item by providing its unique
    // `id`.
    @GetMapping("/{id}")
    public ResponseEntity<MemberDto> getMember(@PathVariable Long id) {
        return ResponseEntity.ok(memberService.getMember(id));
    }

}
