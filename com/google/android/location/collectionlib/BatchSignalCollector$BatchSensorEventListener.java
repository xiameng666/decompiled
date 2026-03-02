package com.google.android.location.collectionlib;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.util.SparseArray;
import com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener2;
import fvkv;
import fvkx;
import fvlx;
import fvns;
import fvrw;
import j..util.Objects;
import java.util.List;

public class BatchSignalCollector.BatchSensorEventListener extends TracingSensorEventListener2 {
    final fvkx a;

    public BatchSignalCollector.BatchSensorEventListener(fvkx fvkx0) {
        Objects.requireNonNull(fvkx0);
        this.a = fvkx0;
        super();
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
    public final void a(SensorEvent sensorEvent0) {
        fvrw fvrw0;
        fvkx fvkx0 = this.a;
        synchronized(fvkx0.a) {
            Integer integer0 = sensorEvent0.sensor.getType();
            fvns fvns0 = (fvns)RealCollectorConfig.b.get(integer0);
            fvrw0 = null;
            if(fvns0 != null) {
                fvkv fvkv0 = (fvkv)fvkx0.g.get(fvns0.z);
                if(fvkv0 != null) {
                    fvrw0 = fvkv0.a;
                }
            }
        }
        if(fvrw0 != null) {
            fvrw0.f(sensorEvent0.timestamp, sensorEvent0.values);
        }
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
    public final void b(Sensor sensor0) {
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener2
    public final void c() {
        fvkx fvkx0 = this.a;
        synchronized(fvkx0.a) {
            int v1 = fvkx0.h - 1;
            fvkx0.h = v1;
            if(v1 <= 0) {
                long v3 = 0x7FFFFFFFFFFFFFFFL;
                long v4 = 0x8000000000000000L;
                for(int v2 = 0; true; ++v2) {
                    SparseArray sparseArray0 = fvkx0.g;
                    if(v2 >= sparseArray0.size()) {
                        break;
                    }
                    fvrw fvrw0 = ((fvkv)sparseArray0.valueAt(v2)).a;
                    int v5 = fvrw0.c;
                    if(v5 > 0) {
                        long v6 = fvrw0.d(v5 - 1);
                        if(v3 > v6) {
                            v3 = v6;
                        }
                        if(v4 < v6) {
                            v4 = v6;
                        }
                    }
                }
                if(v3 != 0x7FFFFFFFFFFFFFFFL && v4 != 0x8000000000000000L && v4 - v3 > 1000000000L) {
                    return;
                }
                List list0 = fvkx0.f;
                for(Object object1: list0) {
                    ((fvlx)object1).run();
                }
                list0.clear();
            }
        }
    }
}

