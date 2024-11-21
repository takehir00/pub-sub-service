package com.example.pub_sub_service.service.topic;


import com.example.pub_sub_service.domain.SubscriberId;
import com.example.pub_sub_service.domain.Topic.TopicAndSubscriberRelation;
import com.example.pub_sub_service.domain.Topic.TopicAndSubscriberRelationId;
import com.example.pub_sub_service.domain.Topic.TopicAndSubscriberRelationRepository;
import com.example.pub_sub_service.domain.Topic.TopicId;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service public class TopicSubscribeService {

    private final TopicAndSubscriberRelationRepository topicAndSubscriberRelationRepository;

    public TopicSubscribeService(TopicAndSubscriberRelationRepository topicAndSubscriberRelationRepository) {
        this.topicAndSubscriberRelationRepository = topicAndSubscriberRelationRepository;
    }

    public void invoke(TopicSubscribeRequest topicSubscribeRequest) {

        TopicAndSubscriberRelation topicAndSubscriberRelation =
                new TopicAndSubscriberRelation(
                        TopicAndSubscriberRelationId.generate(),
                        new TopicId(topicSubscribeRequest.topicId()),
                        new SubscriberId(topicSubscribeRequest.subscriberId()),
                        LocalDateTime.now());
        topicAndSubscriberRelationRepository.save(topicAndSubscriberRelation);
    }
}
