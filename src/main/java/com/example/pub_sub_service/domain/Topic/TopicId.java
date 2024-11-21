package com.example.pub_sub_service.domain.Topic;

import java.util.UUID;

public record TopicId(String value) {

    public static TopicId generate() {
        String topicId = "topic-" + UUID.randomUUID();
        return new TopicId(topicId);
    }
}
