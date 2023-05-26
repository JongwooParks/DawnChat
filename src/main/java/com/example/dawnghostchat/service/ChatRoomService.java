package com.example.dawnghostchat.service;

import com.example.dawnghostchat.domain.dto.ChatRoomDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ChatRoomService {

    public ChatRoomDTO create(String name){
        ChatRoomDTO room = new ChatRoomDTO();
        room.setRoomId(UUID.randomUUID().toString());
        room.setName(name);
        return room;
    }

}
