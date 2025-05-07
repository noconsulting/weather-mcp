package org.acme.dto;

public record Properties(
        String id,
        String areaDesc,
        String event,
        String severity,
        String description,
        String instruction) {
}
