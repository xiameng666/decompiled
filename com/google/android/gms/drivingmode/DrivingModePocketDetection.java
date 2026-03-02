package com.google.android.gms.drivingmode;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.SystemClock;
import bhix;
import bhiz;
import bhjd;
import bhme;
import com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener;
import gkea;
import gkeb;

public class DrivingModePocketDetection extends TracingSensorEventListener {
    public final Sensor a;
    public final SensorManager b;
    public bhiz c;
    private final float d;

    public DrivingModePocketDetection(Context context0) {
        super("DrivingModePocketDetection", "drivingmode");
        SensorManager sensorManager0 = (SensorManager)context0.getSystemService("sensor");
        this.b = sensorManager0;
        Sensor sensor0 = sensorManager0.getDefaultSensor(8);
        this.a = sensor0;
        if(sensor0 != null) {
            this.d = Math.min(sensor0.getMaximumRange(), 5.0f);
            return;
        }
        this.d = 5.0f;
        bhme.b();
        new bhix(context0).a(gkeb.u, gkea.cs);
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
    public final void a(SensorEvent sensorEvent0) {
        if((sensorEvent0.values[0] >= this.d)) {
            bhiz bhiz0 = this.c;
            if(bhiz0 != null) {
                bhjd bhjd0 = bhiz0.a;
                if(SystemClock.elapsedRealtime() <= bhjd0.f) {
                    bhjd0.c();
                }
                this.c();
            }
        }
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
    public final void b(Sensor sensor0) {
    }

    public final void c() {
        this.c = null;
        this.b.unregisterListener(this);
    }
}

