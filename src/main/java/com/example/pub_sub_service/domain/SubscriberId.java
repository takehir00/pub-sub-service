package com.example.pub_sub_service.domain;

import java.util.UUID;

public record SubscriberId(String value) {
    public static SubscriberId generate() {
        String subscriberId = "subscriberId-" + UUID.randomUUID();
        return new SubscriberId(subscriberId);
    }
}
