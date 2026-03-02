package com.google.android.location.fused.orientation;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener;
import com.google.googlex.insight.shared.sensorfusion.particlefilter.adapter.attitude.math.Quaternion;
import fwbb;
import fwbc;
import j..util.Objects;

public class AndroidRotationVectorOrientationEngine.SensorEventListenerAdapter extends TracingSensorEventListener {
    public final fwbc a;

    public AndroidRotationVectorOrientationEngine.SensorEventListenerAdapter(fwbc fwbc0, Context context0) {
        Objects.requireNonNull(fwbc0);
        this.a = fwbc0;
        super(context0);
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
    public final void a(SensorEvent sensorEvent0) {
        switch(sensorEvent0.sensor.getType()) {
            case 11: 
            case 20: {
                fwbb fwbb0 = new fwbb(this, new Quaternion(((double)sensorEvent0.values[0]), ((double)sensorEvent0.values[1]), ((double)sensorEvent0.values[2]), ((double)sensorEvent0.values[3])), sensorEvent0.values[4], sensorEvent0.timestamp);
                this.a.b.execute(fwbb0);
            }
        }
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
    public final void b(Sensor sensor0) {
    }
}

