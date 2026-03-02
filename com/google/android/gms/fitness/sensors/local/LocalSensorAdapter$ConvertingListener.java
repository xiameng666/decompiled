package com.google.android.gms.fitness.sensors.local;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import bqwj;
import bqwq;
import breb;
import brgq;
import brgu;
import brgv;
import brgw;
import brgx;
import brhb;
import com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener;
import ggtj;
import hldp;
import hleg;
import hlje;
import hljf;
import htaf;
import j..util.Objects;
import java.util.concurrent.TimeUnit;

public class LocalSensorAdapter.ConvertingListener extends TracingSensorEventListener {
    public final breb a;
    public final hldp b;
    public final brgx c;
    public final brhb d;
    public final brgv e;
    private final brgq f;
    private final brgw g;

    public LocalSensorAdapter.ConvertingListener(brgv brgv0, breb breb0, brgq brgq0, hldp hldp0, brgw brgw0, brgx brgx0, brhb brhb0) {
        Objects.requireNonNull(brgv0);
        this.e = brgv0;
        super("LocalSensorAdapter$ConvertingListener", "fitness");
        this.a = breb0;
        this.f = brgq0;
        this.b = hldp0;
        this.g = brgw0;
        this.c = brgx0;
        this.d = brhb0;
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
    public final void a(SensorEvent sensorEvent0) {
        hljf hljf1;
        long v = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        Sensor sensor0 = sensorEvent0.sensor;
        String s = sensor0.getType() + ":" + sensor0.getName();
        brgw brgw0 = this.g;
        SharedPreferences sharedPreferences0 = brgw0.b;
        long v1 = sharedPreferences0.getLong(s, -1L);
        if(v1 == -1L || (v1 < 0L || sensorEvent0.timestamp + v1 > v)) {
            v1 = v - sensorEvent0.timestamp;
            sharedPreferences0.edit().putLong(s, v1).apply();
        }
        hldp hldp0 = this.b;
        long v2 = brgw0.a();
        hljf hljf0 = null;
        switch(this.f.ordinal()) {
            case 0: {
                float f = sensorEvent0.values[0];
                if((f > 0.0f) && sensorEvent0.accuracy >= ((int)htaf.a.b().a())) {
                    hljf1 = bqwj.j(hldp0, brgq.a(sensorEvent0.timestamp, v2, v1), TimeUnit.NANOSECONDS, ((double)f));
                }
                else {
                    brgq.c(sensorEvent0);
                    hljf1 = null;
                }
                break;
            }
            case 1: {
                long v3 = brgq.a(sensorEvent0.timestamp, v2, v1);
                if(brgw.b(v2)) {
                    hljf1 = bqwj.h(hldp0, v2, v3, TimeUnit.NANOSECONDS, new hleg[]{bqwq.b(((int)sensorEvent0.values[0]))});
                }
                else {
                    ((ggtj)((ggtj)brgq.c.j()).ar(5318)).L("Invalid boot time: %s. Event discarded: %s.", v2, brgq.c(sensorEvent0));
                    hljf1 = null;
                }
                break;
            }
            default: {
                throw null;
            }
        }
        if(hljf1 != null) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hljf1).jf(5, null);
            hftp0.X(((ProtoLiteMessage)hljf1));
            long v4 = sensorEvent0.timestamp;
            if(!((hlje)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((hlje)hftp0))).ensureMutable();
            }
            hljf hljf2 = (hljf)((hlje)hftp0).b_message;
            hljf2.b |= 16;
            hljf2.h = v4;
            long v5 = System.currentTimeMillis();
            if(!((hlje)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((hlje)hftp0))).ensureMutable();
            }
            hljf hljf3 = (hljf)((hlje)hftp0).b_message;
            hljf3.b |= 0x20;
            hljf3.i = v5;
            hljf0 = (hljf)((ProtoLiteBuilder)(((hlje)hftp0))).N_build();
        }
        brgu brgu0 = new brgu(this, sensorEvent0, hljf0);
        this.e.b.execute(brgu0);
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
    public final void b(Sensor sensor0) {
    }
}

