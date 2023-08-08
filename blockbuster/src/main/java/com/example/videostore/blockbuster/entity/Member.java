package com.example.videostore.blockbuster.entity;

import lombok.*;
import jakarta.persistence.*; //fromally javax

@Data
@Entity
@Table(name = "MEMBERS")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long memberId;

    @Column
    private String memberName;

    @Column
    private Long videoId;

}
