package com.example.videostore.blockbuster.dto;

//local
import com.example.videostore.blockbuster.dto.*;
import com.example.videostore.blockbuster.entity.*;
import com.example.videostore.blockbuster.controller.*;
import com.example.videostore.blockbuster.service.*;
import com.example.videostore.blockbuster.dao.*;

//reduce boilerplate
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MemberDto {

    // variables
    private Integer memberId;
    private String memberName;
    private Integer videoId;

}
