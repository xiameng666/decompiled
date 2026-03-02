package com.google.android.gms.ads.social;

import a;
import android.content.Context;
import android.content.SharedPreferences;
import cljp;
import clkm;
import clkn;
import clko;
import clkq;
import clkr;
import com.google.android.gms.ads.internal.util.client.h;
import hopm;
import hrwu;

public final class e {
    public final Context a;
    private static final Object b;
    private static e c;
    private final cljp d;
    private final SharedPreferences e;

    static {
        e.b = new Object();
    }

    public e(Context context0, cljp cljp0, SharedPreferences sharedPreferences0) {
        this.a = context0;
        this.d = cljp0;
        this.e = sharedPreferences0;
    }

    public static e a(Context context0) {
        synchronized(e.b) {
            if(e.c == null) {
                e.c = new e(context0, cljp.a(context0), context0.getSharedPreferences("social.package_doritos", 4));
            }
        }
        return e.c;
    }

    public final void b() {
        if(Long.compare(this.e.getInt("gms:ads:social:doritos:doritos_refresh_period_s", -1), hopm.d()) == 0 && ((long)this.e.getInt("gms:ads:social:doritos:doritos_refresh_flex_s", -1)) == hopm.c()) {
            return;
        }
        h.d("DSID periodic task parameters have changed.");
        this.e();
    }

    public final void c() {
        if(d.b(this.a).a("ads.social.doritos-immediate") != 0) {
            h.i("Immediate DSID task failed. Scheduling one-off");
            this.d();
        }
    }

    public final void d() {
        h.d(a.D(hopm.b(), "Scheduling one-off DSID refresh task. Flex: ", " s."));
        clkn clkn0 = new clkn();
        clkn0.j = "com.google.android.gms.ads.social.GcmSchedulerWakeupService";
        clkn0.t("ads.social.doritos-oneoff");
        clkn0.x(0, 1);
        clkn0.g(0);
        clkn0.v(1);
        clkn0.e(0L, hopm.b());
        clko clko0 = clkn0.a();
        this.d.f(clko0);
    }

    public final void e() {
        int v = (int)hopm.d();
        int v1 = (int)hopm.c();
        h.d(a.x(v1, v, "Scheduling periodic DSID refresh task. period: ", " s, flex: ", " s."));
        clkq clkq0 = new clkq();
        clkq0.j = "com.google.android.gms.ads.social.GcmSchedulerWakeupService";
        clkq0.t("ads.social.doritos");
        clkq0.x(0, ((int)hopm.a.e().l()));
        clkq0.v(1);
        clkq0.y(0, ((int)hopm.a.e().n()));
        clkq0.f(0, ((int)hopm.a.e().m()));
        if(hrwu.a.b().n()) {
            clkq0.j(clkm.a(hopm.d()));
        }
        else {
            clkq0.a = hopm.d();
            clkq0.b = hopm.c();
        }
        clkr clkr0 = clkq0.a();
        this.d.f(clkr0);
        this.e.edit().putInt("gms:ads:social:doritos:doritos_refresh_period_s", v).putInt("gms:ads:social:doritos:doritos_refresh_flex_s", v1).commit();
    }
}

