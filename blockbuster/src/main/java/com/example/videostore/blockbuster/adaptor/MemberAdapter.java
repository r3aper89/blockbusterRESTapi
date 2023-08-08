package com.example.videostore.blockbuster.adaptor;

//local
import com.example.videostore.blockbuster.dto.MemberDto;
import com.example.videostore.blockbuster.entity.Member;

//imported
import org.springframework.stereotype.Component;

@Component
public class MemberAdapter {

    public MemberDto entityToDto(Member member) {
        MemberDto dto = new MemberDto();
        dto.setMemberId(member.getMemberId());
        dto.setMemberName(member.getMemberName());
        dto.setVideoId(member.getVideoId());
        return dto;
    }

    public Member dtoToEntity(MemberDto dto) {
        Member member = new Member();
        member.setMemberId(dto.getMemberId());
        member.setMemberName(dto.getMemberName());
        member.setVideoId(dto.getVideoId());
        return member;
    }
}
