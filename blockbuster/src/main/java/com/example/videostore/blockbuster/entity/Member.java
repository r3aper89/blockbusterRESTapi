package com.example.videostore.blockbuster.entity;

import lombok.*;
import jakarta.persistence.*; //fromally javax

@Entity
@Data
@Table(name = "members")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private Long videoId;

}
