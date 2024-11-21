package com.example.pub_sub_service.domain.Topic;

import com.example.pub_sub_service.domain.SubscriberId;

import java.util.Optional;

public interface TopicAndSubscriberRelationRepository {
    void save(TopicAndSubscriberRelation topicAndSubscriberRelation);
    Optional<TopicAndSubscriberRelation> get(TopicId topicId, SubscriberId subscriberId);
}
