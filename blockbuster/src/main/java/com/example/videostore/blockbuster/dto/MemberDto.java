package com.example.videostore.blockbuster.dto;

import lombok.Data;

@Data
public class MemberDto {
    private Long id;
    private String name;
    private VideoDto video;
}
