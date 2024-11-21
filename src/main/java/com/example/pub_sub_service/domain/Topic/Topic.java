package com.example.pub_sub_service.domain.Topic;

import com.example.pub_sub_service.domain.PublisherId;
import lombok.Getter;

@Getter
public record Topic(TopicId topicId, PublisherId publisherId) {
}
