package com.example.dawnghostchat.domain.chat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="CHAT_MESSAGE")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class ChatMessage {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomId;

    private String writer;
    private String message;
    private LocalDateTime time;
}
