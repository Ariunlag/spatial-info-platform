package com.smartmuseum.core.client.web.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.util.List;

public record BleIngestRequest(
    @NotBlank String deviceId,
    @NotNull Long timestamp,
    @NotEmpty List<@Valid BleReadingsDto> readings
) {
    public record BleReadingsDto (
        @NotBlank String beaconId,
        @NotNull Integer rssi
    ){}
}
