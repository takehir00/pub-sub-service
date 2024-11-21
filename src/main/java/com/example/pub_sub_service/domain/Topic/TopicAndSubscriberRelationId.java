package com.example.pub_sub_service.domain.Topic;

import java.util.UUID;

public record TopicAndSubscriberRelationId(String value) {
    public static TopicAndSubscriberRelationId generate() {
        String topicAndSubscriberRelationId = "top-sub-relation-" + UUID.randomUUID();
        return new TopicAndSubscriberRelationId(topicAndSubscriberRelationId);
    }
}
