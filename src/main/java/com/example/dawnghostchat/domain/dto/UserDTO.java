package com.example.dawnghostchat.domain.dto;

import com.example.dawnghostchat.domain.user.Role;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class UserDTO {

    private Long id;
    private String username;
    private String password;
    private String email;
    private Role role;
    private LocalDateTime createTime;
    private String provider;    // oauth2를 이용할 경우 어떤 플랫폼을 이용하는지
    private String providerId;  // oauth2를 이용할 경우 아이디값

    private String profile;

}
