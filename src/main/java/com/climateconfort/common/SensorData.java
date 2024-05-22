package com.climateconfort.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SensorData {
    private long unixTime;
    private long buildingId;
    private long roomId;
    private float temperature;
    private float lightLevel;
    private float airQuality;
    private float soundLevel;
    private float humidity;
    private float pressure;
}