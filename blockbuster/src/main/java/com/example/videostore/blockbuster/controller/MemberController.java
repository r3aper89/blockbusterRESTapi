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
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.*;

//interact with the browser 

@RestController
public class MemberController {

    public MemberService service;

    public MemberController(MemberService service) {
        this.service = service;
    }

    // list all members
    @GetMapping("/members")
    public List<MemberDto> showAllMembers() {
        return service.findAllMembers();
    }

    // // get member by id
    // @GetMapping("/members/{id}")
    // public MemberDto showMemberById(@PathVariable int id) {
    // return service.findMemberById(id);
    // }

    // // delete by id
    // @DeleteMapping("/members/{id}")
    // public void deleteMember(@PathVariable int id) {
    // service.deleteMemberById(id);
    // }

    // // add new video
    // // POST {name:"...", videoId"..."} memberId will auto generate
    // @PostMapping("/members")
    // public ResponseEntity<MemberDto> addNewMember(@RequestBody MemberDto member)
    // {
    // MemberDto saveMember = service.addMember(member);
    // URI location = ServletUriComponentsBuilder.fromCurrentRequest()
    // .path("/{id}")
    // .buildAndExpand(saveMember.getMemberId())
    // .toUri();
    // return ResponseEntity.created(location).build();
    // }

    // @PutMapping("/members/{id}")
    // public ResponseEntity<MemberDto> updateMemberVideoId(@PathVariable Integer
    // id, @RequestBody MemberDto member) {
    // MemberDto updateMemberVideo =
    // service.changeMemberVideoId(Integer.valueOf(id), member.getVideoId());
    // if (updateMemberVideo != null) {
    // return new ResponseEntity<>(updateMemberVideo, HttpStatus.OK);
    // } else {
    // return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    // }
    // }

}
