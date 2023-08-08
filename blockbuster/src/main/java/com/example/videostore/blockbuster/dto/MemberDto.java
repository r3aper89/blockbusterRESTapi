package com.example.videostore.blockbuster.dto;

//reduce boilerplate
import lombok.*;

@Data
public class MemberDto {

    private Long id;
    private String name;
    private Long videoId;

}