package com.example.myapp.repository;

import com.example.myapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username); // ID 중복 확인용

    // 사용자 이름과 비밀번호로 사용자 찾기
    Optional<User> findByUsernameAndPassword(String username, String password);
}

