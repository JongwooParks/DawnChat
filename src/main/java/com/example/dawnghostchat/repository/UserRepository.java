package com.example.dawnghostchat.repository;

import com.example.dawnghostchat.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
   public User findByUsername(String userName);
}
