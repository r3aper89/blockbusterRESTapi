package com.example.videostore.blockbuster.repository;

import com.example.videostore.blockbuster.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    // Custom queries if any
}
