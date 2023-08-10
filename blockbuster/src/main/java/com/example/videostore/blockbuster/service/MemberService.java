package com.example.videostore.blockbuster.service;

//local 
import com.example.videostore.blockbuster.dto.*;
import com.example.videostore.blockbuster.entity.*;
import com.example.videostore.blockbuster.adaptor.MemberAdapter;
import com.example.videostore.blockbuster.dao.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;

@Service
public class MemberService {

    @Autowired
    private JdbcMemberDao memberDao;
    @Autowired
    private MemberAdapter memberAdapter;

    public MemberDto createMember(MemberDto memberDto) {
        Member member = memberAdapter.dtoToEntity(memberDto);
        return memberAdapter.entityToDto(memberDao.createMember(member));
    }

    public MemberDto getMemberById(Long id) {
        return memberAdapter.entityToDto(memberDao.getMemberById(id));
    }

    public List<MemberDto> getAllMembers() {
        return memberDao.getAllMembers().stream()
                .map(memberAdapter::entityToDto)
                .collect(Collectors.toList());
    }

    public MemberDto updateMember(MemberDto memberDto) {
        Member member = memberAdapter.dtoToEntity(memberDto);
        return memberAdapter.entityToDto(memberDao.updateMember(member));
    }

    public void deleteMember(Long id) {
        memberDao.deleteMember(id);
    }
}
