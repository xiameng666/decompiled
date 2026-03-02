package com.google.android.gms.location.bluestar.android;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.location.Location;
import android.os.SystemClock;
import cmpa;
import cmpf;
import cmpo;
import cmqa;
import cmqj;
import com.google.android.gms.libs.punchclock.tracing.TracingLocationListener;
import gwsr;
import gxlr;
import gxlx;
import j..util.Objects;
import java.util.concurrent.TimeUnit;

public class AndroidMeasurementManager.3 extends TracingLocationListener {
    final cmqa a;

    public AndroidMeasurementManager.3(cmqa cmqa0) {
        Objects.requireNonNull(cmqa0);
        this.a = cmqa0;
        super("BlueStar");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingLocationListener
    public final void b(Location location0) {
        cmqa cmqa0 = this.a;
        cmpa cmpa0 = cmqa0.t;
        if(cmpa0 != null) {
            long v = SystemClock.elapsedRealtimeNanos();
            gxlr gxlr0 = cmpo.b(location0);
            cmpf cmpf0 = cmpa0.a;
            if((cmpf0.d.d == null ? gxlx.a : cmpf0.d.d).b) {
                cmpf0.e = gxlr0;
                cmpf0.a(v, false);
            }
            cmqj cmqj0 = cmqa0.u;
            if(cmqj0 != null) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwsr.a).v_newBuilder();
                gxlr gxlr1 = cmpo.b(location0);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwsr gwsr0 = (gwsr)hftp0.b_message;
                gxlr1.getClass();
                gwsr0.c = gxlr1;
                gwsr0.b = 5;
                cmqj0.a(((gwsr)hftp0.N_build()), TimeUnit.NANOSECONDS.toMillis(location0.getElapsedRealtimeNanos()));
            }
        }
    }
}

