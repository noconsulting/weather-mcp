package org.acme.dto;

public record Feature(
        String id,
        String type,
        Object geometry,
        Properties properties) {
}