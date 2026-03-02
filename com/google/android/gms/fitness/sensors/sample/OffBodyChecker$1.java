package com.google.android.gms.fitness.sensors.sample;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import brip;
import com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener;
import gmcu;
import j..util.Objects;

public class OffBodyChecker.1 extends TracingSensorEventListener {
    final SensorManager a;
    final gmcu b;

    public OffBodyChecker.1(brip brip0, Context context0, SensorManager sensorManager0, gmcu gmcu0) {
        this.a = sensorManager0;
        this.b = gmcu0;
        Objects.requireNonNull(brip0);
        super(context0);
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
    public final void a(SensorEvent sensorEvent0) {
        this.a.unregisterListener(this);
        this.b.q(Boolean.valueOf(sensorEvent0.values[0] != 0.0f));
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
    public final void b(Sensor sensor0) {
    }
}

