package org.acme.dto;

import java.util.List;

public record Alerts(
        List<String> context,
        String type,
        List<Feature> features,
        String title,
        String updated) {
}