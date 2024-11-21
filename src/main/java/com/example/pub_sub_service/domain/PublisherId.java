package com.example.pub_sub_service.domain;

import java.util.UUID;

public record PublisherId(String value) {
    public static PublisherId generate() {
        String publisherId = "publish-" + UUID.randomUUID();
        return new PublisherId(publisherId);
    }
}
