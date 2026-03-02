package com.google.android.gms.ads.internal.state;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.ads.internal.appcontent.c;
import com.google.android.gms.ads.internal.csi.b;
import com.google.android.gms.ads.internal.flag.s;
import com.google.android.gms.ads.internal.report.d;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.f;
import com.google.android.gms.ads.internal.util.g;
import gmbu;
import gmcd;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class e {
    public final Object a;
    public final g b;
    public final h c;
    public Context d;
    public VersionInfoParcel e;
    public b f;
    public Boolean g;
    public final AtomicInteger h;
    public final AtomicBoolean i;
    private boolean j;
    private final Object k;
    private gmcd l;

    public e() {
        this.a = new Object();
        g g0 = new g();
        this.b = g0;
        this.c = new h(g0);
        this.j = false;
        this.f = null;
        this.g = null;
        this.h = new AtomicInteger(0);
        new AtomicInteger(0);
        this.k = new Object();
        this.i = new AtomicBoolean();
    }

    public final b a() {
        synchronized(this.a) {
        }
        return this.f;
    }

    public final void b(Throwable throwable0, String s) {
        d.b(this.d, this.e).f(throwable0, s, ((Double)s.f.d()).floatValue());
    }

    public final void c(Throwable throwable0, String s) {
        d.b(this.d, this.e).e(throwable0, s);
    }

    public final void d(Context context0, VersionInfoParcel versionInfoParcel0) {
        synchronized(this.a) {
            if(!this.j) {
                this.d = context0.getApplicationContext();
                this.e = versionInfoParcel0;
                c c0 = com.google.android.gms.ads.internal.c.a();
                h h0 = this.c;
                Object object1 = c0.a;
                synchronized(object1) {
                    if(c0.b == null) {
                        c0.b = new com.google.android.gms.ads.internal.appcontent.b();
                    }
                    com.google.android.gms.ads.internal.appcontent.b b0 = c0.b;
                    synchronized(b0.b) {
                        b0.e.add(h0);
                    }
                }
                g g0 = this.b;
                Context context1 = this.d;
                Object object2 = g0.a;
                __monitor_enter(object2);
                if(g0.f == null) {
                    __monitor_exit(object2);
                    f f0 = new f(g0, context1);
                    g0.d = com.google.android.gms.ads.internal.util.future.e.a.d(f0);
                    g0.b = true;
                }
                else {
                    __monitor_exit(object2);
                }
                d.b(this.d, this.e);
                b b1 = ((Boolean)com.google.android.gms.ads.internal.config.s.N.g()).booleanValue() ? new b() : null;
                this.f = b1;
                if(b1 != null) {
                    com.google.android.gms.ads.internal.util.future.h.a(new com.google.android.gms.ads.internal.state.c(this).b(), "AppState.registerCsiReporter");
                }
                Context context2 = this.d;
                if(((Boolean)com.google.android.gms.ads.internal.config.s.bj.g()).booleanValue()) {
                    ConnectivityManager connectivityManager0 = (ConnectivityManager)context2.getSystemService("connectivity");
                    try {
                        connectivityManager0.registerDefaultNetworkCallback(new com.google.android.gms.ads.internal.state.d(this));
                    }
                    catch(RuntimeException runtimeException0) {
                        com.google.android.gms.ads.internal.util.client.h.m("Failed to register network callback", runtimeException0);
                        this.i.set(true);
                    }
                }
                this.j = true;
                if(this.d != null && !((Boolean)com.google.android.gms.ads.internal.config.s.Y.g()).booleanValue()) {
                    Object object3 = this.k;
                    synchronized(object3) {
                        if(this.l == null) {
                            com.google.android.gms.ads.internal.state.b b2 = new com.google.android.gms.ads.internal.state.b(this);
                            this.l = com.google.android.gms.ads.internal.util.future.e.a.e(b2);
                        }
                    }
                }
                else {
                    gmbu.i(new ArrayList());
                }
            }
        }
        com.google.android.gms.ads.internal.c.e().a(context0, versionInfoParcel0.a);
    }
}

