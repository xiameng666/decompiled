package com.google.android.gms.ads.identifier.settings;

import android.content.Context;
import cljp;
import clkn;
import clko;
import clkq;
import clkr;
import hosu;
import hrwu;

public final class q {
    private static q a;
    private final cljp b;

    static {
    }

    public q(cljp cljp0) {
        this.b = cljp0;
    }

    public static q a(Context context0) {
        synchronized(q.class) {
            if(q.a == null) {
                q q0 = new q(cljp.a(context0));
                q.a = q0;
                q0.b();
                q.a.c();
            }
        }
        return q.a;
    }

    public final void b() {
        if(!hosu.i()) {
            return;
        }
        long v = hosu.a.e().k();
        clkn clkn0 = new clkn();
        clkn0.j = "com.google.android.gms.ads.jams.NegotiationService";
        clkn0.e(0L, v);
        clkn0.t("ads.fetch_integrity_token.one_time");
        clkn0.y(0, ((int)hrwu.a.b().m()));
        clko clko0 = clkn0.a();
        this.b.f(clko0);
    }

    public final void c() {
        if(!hosu.i()) {
            return;
        }
        long v = hosu.a.e().m();
        long v1 = hosu.a.e().l();
        clkq clkq0 = new clkq();
        clkq0.j = "com.google.android.gms.ads.jams.NegotiationService";
        clkq0.b = v1;
        clkq0.a = v;
        clkq0.t("ads.fetch_integrity_token.periodic");
        clkq0.y(0, ((int)hrwu.c()));
        clkq0.x(0, ((int)hrwu.c()));
        clkr clkr0 = clkq0.a();
        this.b.f(clkr0);
    }
}

