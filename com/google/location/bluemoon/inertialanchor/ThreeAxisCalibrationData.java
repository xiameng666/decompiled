package com.google.location.bluemoon.inertialanchor;

import com.google.googlex.insight.shared.sensorfusion.particlefilter.adapter.attitude.math.Vector3d;
import com.google.location.bluemoon.inertialanchor.proto.SensorType;

public final class ThreeAxisCalibrationData {
    public Vector3d bias;
    public float quality;
    public SensorType sensorType;
    public long timestampNanos;

    public ThreeAxisCalibrationData(SensorType sensorType0, Vector3d vector3d0) {
        this.sensorType = sensorType0;
        this.timestampNanos = -1L;
        Vector3d vector3d1 = new Vector3d();
        vector3d1.b = vector3d0.b;
        vector3d1.c = vector3d0.c;
        vector3d1.d = vector3d0.d;
        this.bias = vector3d1;
        this.quality = Infinityf;
    }

    private void setBias(double f, double f1, double f2) {
        this.bias.b = f;
        this.bias.c = f1;
        this.bias.d = f2;
    }

    private void setSensorTypeFromInt(int v) {
        SensorType sensorType0;
        switch(v) {
            case 0: {
                sensorType0 = SensorType.SENSOR_TYPE_UNSPECIFIED;
                break;
            }
            case 1: {
                sensorType0 = SensorType.SENSOR_TYPE_ACCELEROMETER_MPS2;
                break;
            }
            case 2: {
                sensorType0 = SensorType.SENSOR_TYPE_GYROSCOPE_RPS;
                break;
            }
            case 3: {
                sensorType0 = SensorType.SENSOR_TYPE_MAGNETOMETER_UT;
                break;
            }
            case 4: {
                sensorType0 = SensorType.SENSOR_TYPE_IMU_TEMPERATURE_C;
                break;
            }
            case 5: {
                sensorType0 = SensorType.SENSOR_TYPE_BAROMETER_HPA;
                break;
            }
            case 6: {
                sensorType0 = SensorType.SENSOR_TYPE_WIFI_M;
                break;
            }
            case 7: {
                sensorType0 = SensorType.SENSOR_TYPE_VELOCITY_MPS;
                break;
            }
            case 8: {
                sensorType0 = SensorType.SENSOR_TYPE_POSITION_M;
                break;
            }
            case 9: {
                sensorType0 = SensorType.SENSOR_TYPE_WORLD_TO_DEVICE_QUATERNION;
                break;
            }
            case 10: {
                sensorType0 = SensorType.SENSOR_TYPE_WORLD_TO_DEVICE_MRP;
                break;
            }
            case 11: {
                sensorType0 = SensorType.SENSOR_TYPE_HINGE_ANGLE_DEG;
                break;
            }
            default: {
                sensorType0 = null;
            }
        }
        this.sensorType = sensorType0;
    }
}

