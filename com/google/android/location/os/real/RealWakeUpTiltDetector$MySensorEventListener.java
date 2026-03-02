package com.google.android.location.os.real;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.os.SystemClock;
import com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener;
import fwvp;
import fwvq;
import j..util.Objects;

public class RealWakeUpTiltDetector.MySensorEventListener extends TracingSensorEventListener {
    public final fwvq a;
    private final long b;

    public RealWakeUpTiltDetector.MySensorEventListener(fwvq fwvq0, long v) {
        Objects.requireNonNull(fwvq0);
        this.a = fwvq0;
        super("RealWakeUpTiltDetector", "location");
        this.b = v;
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
    public final void a(SensorEvent sensorEvent0) {
        if(SystemClock.elapsedRealtime() - this.b < 1000L) {
            return;
        }
        this.a.c.g(57);
        fwvp fwvp0 = new fwvp(this);
        this.a.b.m(fwvp0);
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
    public final void b(Sensor sensor0) {
    }
}

