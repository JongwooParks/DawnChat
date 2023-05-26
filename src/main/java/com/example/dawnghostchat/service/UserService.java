package com.example.dawnghostchat.service;

import com.example.dawnghostchat.domain.dto.UserDTO;
import com.example.dawnghostchat.domain.user.User;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final ModelMapper modelMapper;
    public UserDTO toDTO(User user){
        UserDTO dto = modelMapper.map(user,UserDTO.class);
        return dto;
    }
}
