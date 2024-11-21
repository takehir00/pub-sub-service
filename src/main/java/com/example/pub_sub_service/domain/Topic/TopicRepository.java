package com.example.pub_sub_service.domain.Topic;

import java.util.Optional;

public interface TopicRepository {

    void save(Topic topic);
    Optional<Topic> get(TopicId topicId);
}
