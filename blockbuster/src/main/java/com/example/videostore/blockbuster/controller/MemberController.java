package com.example.videostore.blockbuster.controller;

//local
import com.example.videostore.blockbuster.dto.*;
import com.example.videostore.blockbuster.service.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

//interact with the browser 

@RestController
@RequestMapping("/members")
public class MemberController {

    public final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    // Create: post
    // Description: Allows the user to create a new Member by providing the `name`
    @PostMapping
    public ResponseEntity<MemberDto> createMember(@RequestBody MemberDto memberDto) {
        return ResponseEntity.ok(memberService.createMember(memberDto));
    }

    // Read: get
    // Description: Retrieves the details of a specific member by providing its
    // unique
    // `id`.
    @GetMapping("/{id}")
    public ResponseEntity<MemberDto> getMember(@PathVariable Long id) {
        return ResponseEntity.ok(memberService.getMember(id));
    }

    // Update: put
    // Description: Allows the user to update an existing Member's `name` and/or
    // `description` by providing the updated values in the request body. The `id`
    // should remain unchanged.
    @PutMapping("/{id}")
    public ResponseEntity<MemberDto> updateMember(@PathVariable Long id, @RequestBody MemberDto memberDto) {
        return ResponseEntity.ok(memberService.updateMember(id, memberDto));
    }

    // Delete: delete
    // Description: Deletes an Member with the provided `id`.
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMember(@PathVariable Long id) {
        return ResponseEntity.ok(memberService.deleteMember(id));
    }

}
