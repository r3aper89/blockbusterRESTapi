package com.example.videostore.blockbuster.dao;

//local
import com.example.videostore.blockbuster.dto.*;
import com.example.videostore.blockbuster.entity.*;
import com.example.videostore.blockbuster.controller.*;
import com.example.videostore.blockbuster.service.*;
import com.example.videostore.blockbuster.dao.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//imported
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import org.springframework.jdbc.core.*;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.sql.*;

//interact with the database

@Repository
public class MemberDao {

    private NamedParameterJdbcTemplate jdbcTemplate;

    public MemberDao(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<MemberDto> findAllMembers() {
        String sql = "SELECT * FROM members";
        jdbcTemplate.query(sql, (rs, rowNum) -> {
            MemberDto member = new MemberDto();
            member.setMemberId(rs.getInt("member_id"));
            member.setMemberName(rs.getString("member_name"));
            member.setVideoId(rs.getInt("video_id"));
            return member;
        });
    }

    private static class MemberRowMapper implements RowMapper<Member> {
        @Override
        public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
            Member member = new Member();
            member.setId(rs.getLong("id"));
            member.setName(rs.getString("name"));
            member.setEmail(rs.getString("email"));
            return member;
        }
    }

}
