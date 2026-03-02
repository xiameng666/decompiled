package com.google.android.gms.personalsafety.ars.datacollection;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener;
import ehsz;
import ehtr;
import hrto;
import j..util.Objects;

public class SensorStreamer.SensorEventListener extends TracingSensorEventListener {
    final ehtr a;

    public SensorStreamer.SensorEventListener(ehtr ehtr0, Context context0) {
        Objects.requireNonNull(ehtr0);
        this.a = ehtr0;
        super(context0);
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
    public final void a(SensorEvent sensorEvent0) {
        ehsz ehsz0 = this.a.a;
        boolean z = !hrto.a.o().E() || sensorEvent0.timestamp >= this.a.c;
        if(ehsz0 != null && sensorEvent0.sensor.getType() == 1 && z) {
            ehsz0.a(sensorEvent0.timestamp, sensorEvent0.values[0], sensorEvent0.values[1], sensorEvent0.values[2]);
        }
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
    public final void b(Sensor sensor0) {
    }
}

