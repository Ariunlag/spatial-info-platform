package com.smartmuseum.core.client.ws;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.WebSocketSession;

@Component
public class SessionRegistery {
    private final Map<String, WebSocketSession> sessionsByDeviceId = new ConcurrentHashMap<>();

    public void put(String deviceId, WebSocketSession session) {
        sessionsByDeviceId.put(deviceId, session);
    }

    public WebSocketSession get(String deviceId) {
        return sessionsByDeviceId.get(deviceId);
    }

    public void remove(String deviceId) {
        sessionsByDeviceId.remove(deviceId);
    }
}
