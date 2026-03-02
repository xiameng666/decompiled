package com.google.android.gms.location.bluestar.android;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.location.Location;
import cmpo;
import cmqa;
import cmqj;
import com.google.android.gms.libs.punchclock.tracing.TracingLocationListener;
import gwsr;
import gxlr;
import j..util.Objects;
import java.util.concurrent.TimeUnit;

public class AndroidMeasurementManager.4 extends TracingLocationListener {
    final cmqa a;

    public AndroidMeasurementManager.4(cmqa cmqa0) {
        Objects.requireNonNull(cmqa0);
        this.a = cmqa0;
        super("BlueStar");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingLocationListener
    public final void b(Location location0) {
        if(Objects.equals(location0.getProvider(), "fused")) {
            cmqj cmqj0 = this.a.u;
            if(cmqj0 != null) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwsr.a).v_newBuilder();
                gxlr gxlr0 = cmpo.b(location0);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwsr gwsr0 = (gwsr)hftp0.b_message;
                gxlr0.getClass();
                gwsr0.c = gxlr0;
                gwsr0.b = 13;
                cmqj0.a(((gwsr)hftp0.N_build()), TimeUnit.NANOSECONDS.toMillis(location0.getElapsedRealtimeNanos()));
            }
        }
    }
}

