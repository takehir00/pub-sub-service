package com.example.pub_sub_service.service.topic;

import com.example.pub_sub_service.domain.PublisherId;
import com.example.pub_sub_service.domain.Topic.Topic;
import com.example.pub_sub_service.domain.Topic.TopicId;
import com.example.pub_sub_service.domain.Topic.TopicRepository;
import org.springframework.stereotype.Service;

@Service
public class TopicRegisterService {

    private final TopicRepository topicRepository;

    public TopicRegisterService(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    public TopicId invoke(TopicRegisterRequest topicRegisterRequest) {
        Topic topic = new Topic(
                TopicId.generate(),
                new PublisherId(topicRegisterRequest.publisherId()));
        topicRepository.save(topic);
        return topic.topicId();
    }
}
