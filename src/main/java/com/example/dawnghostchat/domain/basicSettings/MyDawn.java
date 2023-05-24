package com.example.dawnghostchat.domain.basicSettings;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="My_Dawn")
@Getter @Setter
@ToString
public class MyDawn {
    @Id
    private String id;
    private String name;

}
