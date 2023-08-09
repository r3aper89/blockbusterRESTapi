package com.example.videostore.blockbuster.dto;

//reduce boilerplate
import lombok.*;

@Data
public class MemberDto {

    // variables
    private Long id;
    private String memberName;
    private Long videoId;

}
