package com.smartmuseum.core.client.web.dto;

public record AckResponse(String status) {
    public static AckResponse accepted(){ //Static factory method
        return new AckResponse("accepted");
    }
}
