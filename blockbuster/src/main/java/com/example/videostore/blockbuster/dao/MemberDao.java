package com.example.videostore.blockbuster.dao;

import org.springframework.stereotype.Repository;

//interact with the database

@Repository
public class MemberDao {

    // public Object findById(Long id) {
    // return null;
    // }

    // private NamedParameterJdbcTemplate jdbcTemplate;

    // public MemberDao(NamedParameterJdbcTemplate jdbcTemplate) {
    // this.jdbcTemplate = jdbcTemplate;
    // }

    // public List<MemberDto> findAllMembers() {
    // String sql = "SELECT * FROM members";
    // return jdbcTemplate.query(sql, (rs, rowNum) -> {
    // MemberDto member = new MemberDto();
    // member.setId(rs.getInt("member_id"));
    // member.setMemberName(rs.getString("member_name"));
    // member.setVideoId(rs.getInt("video_id"));
    // return member;
    // });
    // }

}
