package com.example.videostore.blockbuster.service;

//local 
import com.example.videostore.blockbuster.dto.*;
import com.example.videostore.blockbuster.entity.*;
import com.example.videostore.blockbuster.adaptor.*;
import com.example.videostore.blockbuster.controller.*;
import com.example.videostore.blockbuster.service.*;
import com.example.videostore.blockbuster.dao.*;
import com.example.videostore.blockbuster.repository.*;

//importa
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.servers.Server;

@Service
public class MemberService {

    // ERROR: Item not found
    private static final String ITEM_NOT_FOUND_MESSAGE = "Item not found";

    private MemberRepository memberRepository;
    private MemberAdapter memberAdapter;

    @Autowired
    public MemberService(MemberRepository memberRepository, MemberAdapter memberAdapter) {
        this.memberRepository = memberRepository;
        this.memberAdapter = memberAdapter;
    }

    public MemberDto getMember(Long id) {
        Member member = memberRepository.findById(id).orElseThrow(() -> new RuntimeException(ITEM_NOT_FOUND_MESSAGE));
        return memberAdapter.entityToDto(member);
    }

}
