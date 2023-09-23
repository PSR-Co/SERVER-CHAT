package com.psr.chat.chat.service;

import com.psr.chat.chat.repository.ChatMessageRepository;
import com.psr.chat.chat.repository.ChatRoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChatService {

    private final ChatMessageRepository chatMessageRepository;
    private final ChatRoomRepository chatRoomRepository;

}
