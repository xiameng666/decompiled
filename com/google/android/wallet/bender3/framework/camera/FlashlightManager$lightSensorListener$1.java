package com.google.android.wallet.bender3.framework.camera;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.os.SystemClock;
import com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener;
import gaug;
import hziq;
import ibuq;

public final class FlashlightManager.lightSensorListener.1 extends TracingSensorEventListener {
    final gaug a;

    public FlashlightManager.lightSensorListener.1(gaug gaug0) {
        this.a = gaug0;
        super("FlashlightManager$1", "wallet");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
    public final void a(SensorEvent sensorEvent0) {
        ibuq.f(sensorEvent0, "sensorEvent");
        if(sensorEvent0.sensor.getType() == 5 && sensorEvent0.values != null && sensorEvent0.values.length > 0) {
            float f = sensorEvent0.values[0];
            gaug gaug0 = this.a;
            if(SystemClock.uptimeMillis() - gaug0.c > hziq.b()) {
                gaug0.c = SystemClock.uptimeMillis();
                hziq hziq0 = hziq.a;
                if((f < ((float)hziq0.c().e()))) {
                    gaug0.d = true;
                }
                if((f > ((float)hziq0.c().d()))) {
                    gaug0.d = false;
                }
                gaug0.c();
            }
        }
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
    public final void b(Sensor sensor0) {
        ibuq.f(sensor0, "sensor");
    }
}

