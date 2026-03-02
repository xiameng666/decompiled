package com.google.android.gms.ocr.camera;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener;
import dkja;
import j..util.Objects;

public class FlashlightManager.LightSensorListener extends TracingSensorEventListener {
    final dkja a;

    public FlashlightManager.LightSensorListener(dkja dkja0) {
        Objects.requireNonNull(dkja0);
        this.a = dkja0;
        super("FlashlightManager$LightSensorListener", "ocr");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
    public final void a(SensorEvent sensorEvent0) {
        if(sensorEvent0.sensor.getType() == 5 && sensorEvent0.values != null && sensorEvent0.values.length > 0) {
            float f = sensorEvent0.values[0];
            this.a.h = sensorEvent0.values[0];
        }
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
    public final void b(Sensor sensor0) {
    }
}

