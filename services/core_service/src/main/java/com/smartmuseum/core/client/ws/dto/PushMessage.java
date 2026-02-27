package com.smartmuseum.core.client.ws.dto;

public record PushMessage(
    String type, // content_update | location_update
    String deviceId,
    Object payload) {} 