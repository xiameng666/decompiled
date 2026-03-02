package com.google.android.gms.ads.internal.state;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.ads.internal.config.s;
import java.util.HashSet;

public final class h {
    public final g a;
    final f b;
    private final com.google.android.gms.ads.internal.util.g c;

    public h(com.google.android.gms.ads.internal.util.g g0) {
        new HashSet();
        new HashSet();
        this.b = new f();
        this.c = g0;
        this.a = new g();
    }

    public final void a(boolean z) {
        long v = System.currentTimeMillis();
        if(z) {
            this.c.a();
            if(v - this.c.o > ((long)(((Long)s.J.g())))) {
                this.b.a = -1;
                return;
            }
            this.c.a();
            this.b.a = this.c.q;
            return;
        }
        com.google.android.gms.ads.internal.util.g g0 = this.c;
        g0.a();
        synchronized(g0.a) {
            if(g0.o != v) {
                g0.o = v;
                SharedPreferences.Editor sharedPreferences$Editor0 = g0.g;
                if(sharedPreferences$Editor0 != null) {
                    sharedPreferences$Editor0.putLong("app_last_background_time_ms", v);
                    g0.g.apply();
                }
                g0.b();
            }
        }
        com.google.android.gms.ads.internal.util.g g1 = this.c;
        int v2 = this.b.a;
        g1.a();
        synchronized(g1.a) {
            if(g1.q == v2) {
                return;
            }
            g1.q = v2;
            SharedPreferences.Editor sharedPreferences$Editor1 = g1.g;
            if(sharedPreferences$Editor1 != null) {
                sharedPreferences$Editor1.putInt("request_in_session_count", v2);
                g1.g.apply();
            }
            g1.b();
        }
    }
}

