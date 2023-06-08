package com.example.dawnghostchat.domain.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Getter
@Setter
@ToString
@NoArgsConstructor
public class ChatMessageDTO {
    private String roomId;
    private String writer;
    private String message;

    private LocalDateTime time;
}
