package com.example.pub_sub_service.domain.message;


import java.util.UUID;

public record MessageId(String value) {
    public static MessageId generate() {
        String messageId = "message-" + UUID.randomUUID();
        return new MessageId(messageId);
    }
}
