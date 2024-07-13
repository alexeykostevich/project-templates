package com.alexeykostevich.springmvcapp.web.models;

public record HealthStatusResponse(
        String status
) {
    public static HealthStatusResponse ok() {
        return new HealthStatusResponse("OK");
    }
}
