package com.example.videostore.blockbuster.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

//local packages
import com.example.videostore.blockbuster.dto.*;
import com.example.videostore.blockbuster.controller.*;
import com.example.videostore.blockbuster.service.*;

@Component
public class MemberDaoService {

    private static List<Member> members = new ArrayList<>();

    static {
        members.add(new Member(1, "James", 5));
        members.add(new Member(2, "Tim", 2));
    }

    public List<Member> getAllMembers() {
        return members;
    }
}
