package com.example.videostore.blockbuster.repository;

//local
import com.example.videostore.blockbuster.entity.*;

//imported
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}

