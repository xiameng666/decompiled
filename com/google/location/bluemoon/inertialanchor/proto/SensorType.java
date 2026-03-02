package com.google.location.bluemoon.inertialanchor.proto;

import hfub;

public enum SensorType implements hfub {
    SENSOR_TYPE_UNSPECIFIED(0),
    SENSOR_TYPE_ACCELEROMETER_MPS2(1),
    SENSOR_TYPE_GYROSCOPE_RPS(2),
    SENSOR_TYPE_MAGNETOMETER_UT(3),
    SENSOR_TYPE_IMU_TEMPERATURE_C(4),
    SENSOR_TYPE_BAROMETER_HPA(5),
    SENSOR_TYPE_WIFI_M(6),
    SENSOR_TYPE_VELOCITY_MPS(7),
    SENSOR_TYPE_POSITION_M(8),
    SENSOR_TYPE_WORLD_TO_DEVICE_QUATERNION(9),
    SENSOR_TYPE_WORLD_TO_DEVICE_MRP(10),
    SENSOR_TYPE_HINGE_ANGLE_DEG(11),
    UNRECOGNIZED(-1);

    private final int o;

    private SensorType(int v1) {
        this.o = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != SensorType.UNRECOGNIZED) {
            return this.o;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.o);
    }
}

