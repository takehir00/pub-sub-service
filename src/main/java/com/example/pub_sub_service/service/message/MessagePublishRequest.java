package com.example.pub_sub_service.service.message;

public record MessagePublishRequest(String publisherId,String topicId,String message) {

}
