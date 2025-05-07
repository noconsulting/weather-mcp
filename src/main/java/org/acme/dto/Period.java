package org.acme.dto;

public record Period(String name, int temperature, String temperatureUnit, String windSpeed, String windDirection,
                     String detailedForecast) {
}
