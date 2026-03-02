package com.google.android.contextmanager.producer.module;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener;
import hrgt;
import j..util.Objects;
import xrn;
import xza;

public class DNDModeProducer.2 extends TracingSensorEventListener {
    final xza a;

    public DNDModeProducer.2(xza xza0) {
        Objects.requireNonNull(xza0);
        this.a = xza0;
        super("DNDModeProducer", "contextmanager");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
    public final void a(SensorEvent sensorEvent0) {
        if(sensorEvent0.values != null && sensorEvent0.values.length == 1) {
            this.a.F = sensorEvent0.values[0];
            this.a.r.unregisterListener(this.a.m);
            long v = hrgt.a.w().u();
            xrn xrn0 = new xrn("DNDModeProducer_light_sensor", "com.google.android.gms", null);
            this.a.k.c(this.a.p, v, xrn0);
            this.a.u(0L);
        }
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
    public final void b(Sensor sensor0) {
    }
}

