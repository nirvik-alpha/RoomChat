package com.room.chat.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Message {

    private String member;
    private String content;
    private LocalDateTime timeStamp;

    public Message(String member, String content) {
        this.member = member;
        this.content = content;
        this.timeStamp = LocalDateTime.now();   // time will come automatically
    }
}
