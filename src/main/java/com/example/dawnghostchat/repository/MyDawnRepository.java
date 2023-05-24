package com.example.dawnghostchat.repository;

import com.example.dawnghostchat.domain.basicSettings.MyDawn;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyDawnRepository extends JpaRepository<MyDawn,String> {
}
