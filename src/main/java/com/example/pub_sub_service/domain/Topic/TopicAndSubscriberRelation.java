package com.example.pub_sub_service.domain.Topic;

import com.example.pub_sub_service.domain.SubscriberId;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public record TopicAndSubscriberRelation(
        TopicAndSubscriberRelationId topicAndSubscriberRelationId,
        TopicId topicId,
        SubscriberId subscriberId,
        LocalDateTime createdAt) {
}
