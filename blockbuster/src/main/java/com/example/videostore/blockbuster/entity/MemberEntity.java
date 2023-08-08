package com.example.videostore.blockbuster.entity;

import lombok.*;
import jakarta.persistence.*; //fromally javax

@Entity
@Table(name = "MEMBERS")
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer memberId;

    private String memberName;

    private Integer videoId;

}
