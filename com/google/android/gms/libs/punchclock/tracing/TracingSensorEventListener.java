package com.google.android.gms.libs.punchclock.tracing;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import clhv;
import clhx;
import clhy;
import clib;
import clim;
import gdqs;

public abstract class TracingSensorEventListener implements SensorEventListener, clim {
    final clhv p;

    protected TracingSensorEventListener(Context context0) {
        clhy clhy0 = clib.c.c(this.getClass(), 17, context0);
        this.p = clhx.c.a(clhy0);
    }

    protected TracingSensorEventListener(String s, String s1) {
        clhy clhy0 = clib.c.d(this.getClass(), 17, s1, s);
        this.p = clhx.c.a(clhy0);
    }

    public abstract void a(SensorEvent arg1);

    public abstract void b(Sensor arg1);

    @Override  // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor0, int v) {
        try(gdqs gdqs0 = this.p.a()) {
            this.b(sensor0);
        }
    }

    @Override  // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent0) {
        try(gdqs gdqs0 = this.p.a()) {
            this.a(sensorEvent0);
        }
    }
}

