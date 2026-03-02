package com.google.android.gms.libs.punchclock.tracing;

import android.hardware.Sensor;
import android.hardware.SensorEventListener2;
import gdqs;

public abstract class TracingSensorEventListener2 extends TracingSensorEventListener implements SensorEventListener2 {
    protected TracingSensorEventListener2() {
        super("BatchSignalCollector", "location");
    }

    public abstract void c();

    @Override  // android.hardware.SensorEventListener2
    public final void onFlushCompleted(Sensor sensor0) {
        try(gdqs gdqs0 = this.p.a()) {
            this.c();
        }
    }
}

