package com.google.android.location.collectionlib;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.os.SystemClock;
import com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener;
import fvnz;
import j..util.Objects;

public class SensorTimestampCalibrator.CalibrationSensorListener extends TracingSensorEventListener {
    public boolean a;
    final fvnz b;
    private int c;
    private int d;
    private double e;

    public SensorTimestampCalibrator.CalibrationSensorListener(fvnz fvnz0) {
        Objects.requireNonNull(fvnz0);
        this.b = fvnz0;
        super("CalibrationSensorListener", "location");
        this.c = 0;
        this.d = 0;
        this.e = 0.0;
        this.a = false;
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
    public final void a(SensorEvent sensorEvent0) {
        long v = SystemClock.elapsedRealtimeNanos();
        int v1 = this.c;
        if(v1 < 10) {
            this.c = v1 + 1;
            return;
        }
        if(this.d < 30) {
            this.e += ((double)(sensorEvent0.timestamp - v)) / 30.0;
            int v2 = this.d + 1;
            this.d = v2;
            if(v2 == 30) {
                fvnz fvnz0 = this.b;
                synchronized(fvnz0.d) {
                    if(this.a) {
                        return;
                    }
                    fvnz0.b(true, ((long)this.e));
                }
            }
        }
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
    public final void b(Sensor sensor0) {
    }
}

