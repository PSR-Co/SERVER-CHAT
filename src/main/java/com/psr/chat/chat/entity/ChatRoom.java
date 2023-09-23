package com.psr.chat.chat.entity;

import com.psr.chat.global.entity.BaseEntity;
import com.psr.chat.user.entity.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChatRoom extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(nullable = false, name = "sender_user_id")
    private User senderUser;

    @ManyToOne
    @JoinColumn(nullable = false, name = "receiver_user_id")
    private User receiverUser;

}
