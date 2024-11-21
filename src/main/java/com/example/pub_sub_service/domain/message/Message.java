package com.example.pub_sub_service.domain.message;

import com.example.pub_sub_service.domain.Topic.TopicId;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public record Message(MessageId messageId, TopicId topicId, Content content, LocalDateTime createdAt) {

    public static Message empty() {
        return new Message(new MessageId(""),new TopicId(""),new Content(""),null);
    }
}
