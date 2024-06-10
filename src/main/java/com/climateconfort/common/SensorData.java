package com.climateconfort.common;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class SensorData implements Serializable {
    private long unixTime;
    private long roomId;
    private long buildingId;
    private long clientId;
    private float temperature;
    private float lightLevel;
    private float airQuality;
    private float soundLevel;
    private float humidity;
    private float pressure;
}