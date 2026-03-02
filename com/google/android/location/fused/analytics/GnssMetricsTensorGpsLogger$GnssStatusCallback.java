package com.google.android.location.fused.analytics;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.libs.punchclock.tracing.TracingGnssStatusCallback;
import fvyh;
import fvyu;
import j..time.Duration;
import j..util.Objects;
import jyf;

public class GnssMetricsTensorGpsLogger.GnssStatusCallback extends TracingGnssStatusCallback {
    final fvyu a;

    public GnssMetricsTensorGpsLogger.GnssStatusCallback(fvyu fvyu0, Context context0) {
        Objects.requireNonNull(fvyu0);
        this.a = fvyu0;
        super(context0);
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingGnssStatusCallback
    public final void e(int v) {
        fvyu fvyu0 = this.a;
        synchronized(fvyu0.a) {
            if(!fvyu0.g) {
                return;
            }
            if(fvyu0.k) {
                fvyh fvyh0 = fvyu0.l;
                if(fvyh0 == null) {
                    goto label_17;
                }
                else if(fvyh0.b().isZero()) {
                    fvyh0.e(Duration.ofMillis(v));
                    if(fvyu0.i()) {
                        fvyu0.f();
                    }
                }
            }
            else {
            label_17:
                fvyu0.h = v;
                Location location0 = fvyu0.j;
                if(location0 != null) {
                    fvyu0.h(location0);
                }
            }
        }
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingGnssStatusCallback
    public final void f(jyf jyf0) {
        fvyu fvyu0 = this.a;
        synchronized(fvyu0.a) {
            if(fvyu0.g && fvyu0.k) {
                fvyh fvyh0 = fvyu0.l;
                if(fvyh0 != null) {
                    if(fvyh0.a() > 0 && fvyh0.d != null) {
                        return;
                    }
                    int v2 = 0;
                    int v3 = 0;
                    int v4 = 0;
                    int v5 = 0;
                    int v6 = 0;
                    int v7 = 0;
                    int v8 = 0;
                    for(int v1 = 0; v1 < jyf0.g(); ++v1) {
                        if(jyf0.m(v1)) {
                            ++v2;
                            v4 = Math.max(v4, ((int)jyf0.d(v1)));
                            v3 += (int)jyf0.d(v1);
                            if(jyf0.f(v1) == 1) {
                                ++v5;
                                if((jyf0.d(v1) > ((float)v6))) {
                                    v6 = (int)jyf0.d(v1);
                                    v8 = (int)jyf0.e(v1);
                                }
                                v7 += (int)jyf0.d(v1);
                            }
                        }
                    }
                    if(v2 > 0) {
                        fvyh0.c(v2);
                        fvyh0.i(v4);
                        fvyh0.k(v3 / v2);
                    }
                    if(v5 > 0) {
                        fvyh0.f(v5);
                        fvyh0.h(v6);
                        fvyh0.j(v7 / v5);
                        fvyh0.g(v8);
                    }
                    if(fvyu0.i()) {
                        fvyu0.f();
                    }
                }
            }
        }
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingGnssStatusCallback
    public final void g() {
        fvyu fvyu0 = this.a;
        Location location0 = fvyu0.c.getLastKnownLocation("gps");
        if(location0 != null) {
            synchronized(fvyu0.a) {
                fvyu0.i = location0.getElapsedRealtimeNanos();
            }
        }
    }
}

