package com.example.videostore.blockbuster.adaptor;

import com.example.videostore.blockbuster.dto.MemberDto;
import com.example.videostore.blockbuster.entity.Member;

import org.springframework.stereotype.Component;

@Component
public class MemberAdapter {

    public MemberDto entityToDto(Member member) {
        MemberDto memberDto = new MemberDto();
        memberDto.setId(member.getId());
        memberDto.setName(member.getName());
        memberDto.setVideoId(member.getVideoId());
        return memberDto;
    }

    public Member dtoToEntity(MemberDto memberDto) {
        Member member = new Member();
        member.setId(memberDto.getVideoId());
        member.setName(memberDto.getName());
        member.setVideoId(memberDto.getVideoId());
        return member;
    }
}
