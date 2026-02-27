package com.smartmuseum.core.orchestration.port;

public interface PushNotifier {
    void pushJson(String deviceId, String json);
    
} 