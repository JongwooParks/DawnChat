package com.example.dawnghostchat.myDawnTest;

import com.example.dawnghostchat.repository.MyDawnRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyDawnTest {
    @Autowired
    private MyDawnRepository repository;

    @Test
    public void test(){
        System.out.println(repository.findAll());
    }
}
