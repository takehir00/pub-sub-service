package com.example.pub_sub_service.service.message;


import com.example.pub_sub_service.domain.PublisherId;
import com.example.pub_sub_service.domain.Topic.Topic;
import com.example.pub_sub_service.domain.Topic.TopicId;
import com.example.pub_sub_service.domain.Topic.TopicRepository;
import com.example.pub_sub_service.domain.message.Content;
import com.example.pub_sub_service.domain.message.Message;
import com.example.pub_sub_service.domain.message.MessageId;
import com.example.pub_sub_service.domain.message.MessageRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class MessagePublishService {
    private final TopicRepository topicRepository;
    private final MessageRepository messageRepository;

    public MessagePublishService(TopicRepository topicRepository, MessageRepository messageRepository) {
        this.topicRepository = topicRepository;
        this.messageRepository = messageRepository;
    }

    public void invoke(MessagePublishRequest messagePublishRequest) {
        Optional<Topic> topic = topicRepository.get(new TopicId(messagePublishRequest.topicId()));
        if (topic.isEmpty()) {
            throw new RuntimeException("topic no found");
        }
        if (!topic.get().publisherId()
                .equals(new PublisherId(messagePublishRequest.publisherId()))) {
            throw new RuntimeException("unauthorized to publish to this topic");
        }
        messageRepository.save(
                new Message(
                        MessageId.generate(),
                        new TopicId(messagePublishRequest.topicId()),
                        new Content(messagePublishRequest.message()),
                        LocalDateTime.now())
        );
    }
}
