package com.example.videostore.blockbuster.entity;

import lombok.*;
import jakarta.persistence.*; //fromally javax

@Data
@Entity
@Table(name = "members")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String memberName;

    @Column
    private Long videoId;

}
