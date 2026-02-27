package com.smart_museum.core_service.positioning.web.dto;

/*
 * mobile request contract from BLE signal strength
 */

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import java.util.List;

public record PositioningRequest(
    @NotBlank(message = "Device ID is required")
    String deviceId,

    @NotNull
    Long timestamp,

    @NotEmpty
    List<@Valid BleReadingDto> readings

) {
    public record BleReadingDto(
        @NotBlank String beaconId,
        @NotNull Integer rssi
    ) {
    }
}