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
        dto.setId(member.getId());
        dto.setMemberName(member.getMemberName());
        dto.setVideoId(member.getVideoId());
        return dto;
    }

    public Member dtoToEntity(MemberDto dto) {
        Member member = new Member();
        member.setId(dto.getId());
        member.setMemberName(dto.getMemberName());
        member.setVideoId(dto.getVideoId());
        return member;
    }
}
