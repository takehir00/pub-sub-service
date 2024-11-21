package com.example.pub_sub_service.domain.message;

import com.mercari.merpay.pubsub.domain.Topic.TopicId;

import java.util.List;
import java.util.Optional;

public interface MessageRepository {
    void save(Message message);
    Optional<Message> get(MessageId messageId);
    List<Message> get(TopicId topicId);
}
