package com.example.dawnghostchat.myDawnTest;

import com.example.dawnghostchat.domain.dto.UserDTO;
import com.example.dawnghostchat.domain.user.Role;
import com.example.dawnghostchat.domain.user.User;
import com.example.dawnghostchat.repository.MyDawnRepository;
import com.example.dawnghostchat.service.UserService;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyDawnTest {
    //access = AccessLevel.PROTECTED
    @Autowired
    private MyDawnRepository repository;
    @Autowired
    private UserService service;

    @Test
    public void test(){
        System.out.println(repository.findAll());
    }

    @Test
    public void test2(){
        ModelMapper modelMapper = new ModelMapper();
        User user = new User();
        user.setPassword("1234");
        user.setRole(Role.USER);

        System.out.println(service.toDTO(user));
    }
}
