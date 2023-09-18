package com.psr.chat.chat.entity;

import com.psr.chat.global.entity.BaseEntity;
import com.psr.chat.user.entity.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChatMessage extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @NotNull
    private String message;

    @ManyToOne
    @JoinColumn(nullable = false, name = "user_id")
    private User sender;

    @ManyToOne
    @JoinColumn(nullable = false, name = "room_id")
    private ChatRoom chatRoom;

}
