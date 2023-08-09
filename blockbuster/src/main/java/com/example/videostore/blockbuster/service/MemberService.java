package com.example.videostore.blockbuster.service;

//local 
import com.example.videostore.blockbuster.dto.*;
import com.example.videostore.blockbuster.entity.*;
import com.example.videostore.blockbuster.adaptor.*;
import com.example.videostore.blockbuster.repository.*;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//importa
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    // ERROR: Member not found
    private static final String ITEM_NOT_FOUND_MESSAGE = "Member not found";

    private final MemberRepository memberRepository;
    private final MemberAdapter memberAdapter;

    @Autowired
    public MemberService(MemberRepository memberRepository, MemberAdapter memberAdapter) {
        this.memberRepository = memberRepository;
        this.memberAdapter = memberAdapter;
    }

    // getMember
    public MemberDto getMember(Long id) {
        Member member = memberRepository.findById(id);
        // .orElseThrow(() -> new RuntimeException(ITEM_NOT_FOUND_MESSAGE));
        return memberAdapter.entityToDto(member);
    }

    // createMember
    public MemberDto createMember(MemberDto memberDto) {
        Member member = memberAdapter.dtoToEntity(memberDto);
        member = memberRepository.save(member);
        return memberAdapter.entityToDto(member);
    }

    // updateMember
    public MemberDto updateMember(Long id, MemberDto memberDto) {
        Member member = memberRepository.findById(id);
        // .orElseThrow(() -> new RuntimeException(ITEM_NOT_FOUND_MESSAGE));
        member.setMemberName(memberDto.getMemberName());
        member.setId(memberDto.getId());
        member.setVideoId(memberDto.getVideoId());
        member = memberRepository.save(member);
        return memberAdapter.entityToDto(member);
    }

    // deleteMember
    public String deleteMember(Long id) {
        Member member = memberRepository.findById(id);
        // .orElseThrow(() -> new RuntimeException(ITEM_NOT_FOUND_MESSAGE));
        memberRepository.delete(member);
        return "Member deleted successfully";
    }

}
