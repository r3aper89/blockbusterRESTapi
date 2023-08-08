package com.example.videostore.blockbuster.dao;

//local
import com.example.videostore.blockbuster.entity.*;

import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

//interact with the database

@Repository
public class MemberDao {

    // @Autowired
    private JdbcTemplate jdbcTemplate;

    public Member createMember(Member member) {
        String sql = "INSERT INTO member(name, video_id) VALUES(?, ?)";
        jdbcTemplate.update(sql, member.getName(), member.getVideoId());
        return member; // note: id not set here
    }

    public Member getMemberById(Long id) {
        String sql = "SELECT * FROM member WHERE id = ?";
        List<Member> members = jdbcTemplate.query(sql, new Object[] { id },
                new BeanPropertyRowMapper<>(Member.class));

        if (!members.isEmpty()) {
            return members.get(0);
        } else {
            return null; // or throw an exception indicating that no member was found
        }
    }

    public List<Member> getAllMembers() {
        String sql = "SELECT * FROM member";
        return jdbcTemplate.query(sql,
                (rs, rowNum) -> new Member());
    }

    public Member updateMember(Member member) {
        String sql = "UPDATE member SET name = ?, video_id = ? WHERE id = ?";
        jdbcTemplate.update(sql, member.getName(), member.getVideoId(), member.getId());
        return member;
    }

    public void deleteMember(Long id) {
        String sql = "DELETE FROM member WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}