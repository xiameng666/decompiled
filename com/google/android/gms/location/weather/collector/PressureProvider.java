package com.google.android.gms.location.weather.collector;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import bblp;
import cnys;
import cnyt;
import com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener;
import fvsy;
import gmcg;
import hecc;
import hecd;
import hupd;
import huvd;
import java.util.concurrent.TimeUnit;

public final class PressureProvider extends TracingSensorEventListener implements hecc {
    public final SensorManager a;
    public final Sensor b;
    public final cnyt c;
    public boolean d;
    private final hecd e;
    private final gmcg f;

    public PressureProvider(SensorManager sensorManager0, hecd hecd0, cnyt cnyt0) {
        super("PressureProvider", "location");
        this.d = false;
        this.a = sensorManager0;
        this.c = cnyt0;
        this.e = hecd0;
        this.b = sensorManager0.getDefaultSensor(6);
        bblp bblp0 = new bblp(1, 9);
        this.f = bblp0;
        if(hupd.h() && huvd.m()) {
            hecd0.d(this, bblp0);
        }
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
    public final void a(SensorEvent sensorEvent0) {
        float f = sensorEvent0.values[0];
        if(sensorEvent0.sensor.getType() != 6) {
            return;
        }
        this.e(TimeUnit.NANOSECONDS.toMillis(sensorEvent0.timestamp), f);
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
    public final void b(Sensor sensor0) {
    }

    @Override  // hecc
    public final void c(fvsy fvsy0) {
        for(int v = 0; true; ++v) {
            long[] arr_v = fvsy0.a;
            if(v >= arr_v.length) {
                break;
            }
            this.e(TimeUnit.NANOSECONDS.toMillis(arr_v[v]), fvsy0.b[v]);
        }
    }

    public final void d() {
        if(this.d) {
            this.d = false;
            if(this.b != null) {
                this.a.unregisterListener(this);
            }
            if(hupd.h()) {
                this.e.b(this);
            }
        }
    }

    private final void e(long v, float f) {
        if(Float.isNaN(f)) {
            return;
        }
        cnys cnys0 = new cnys(this, v, f);
        this.f.execute(cnys0);
    }
}

