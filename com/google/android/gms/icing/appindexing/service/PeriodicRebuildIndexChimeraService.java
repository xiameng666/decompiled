package com.google.android.gms.icing.appindexing.service;

import android.content.SharedPreferences;
import bbdg;
import bwne;
import bwqx;
import bwrn;
import bwtj;
import bwts;
import bxax;
import ccmq;
import cljp;
import clks;
import clkz;
import cllr;
import glru;
import glrw;
import huar;
import hubu;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class PeriodicRebuildIndexChimeraService extends RebuildIndexChimeraService {
    private static final Charset a;

    static {
        PeriodicRebuildIndexChimeraService.a = Charset.forName("UTF-8");
    }

    @Override  // com.google.android.gms.icing.appindexing.service.RebuildIndexChimeraService
    public final int d(cllr cllr0, bwqx bwqx0) {
        bwqx bwqx1 = bwqx0;
        if(!huar.a.d().X()) {
            bwne.a("UPDATE_INDEX Periodic Task Disabled.");
            return 0;
        }
        bxax bxax0 = bwqx1.b;
        bwts bwts0 = bwqx1.c;
        SharedPreferences sharedPreferences0 = bxax0.c;
        long v = System.currentTimeMillis();
        long v1 = sharedPreferences0.getLong("last-periodic-rebuild", 0L);
        Set set0 = bwqx.b(bwqx1.a);
        String s = sharedPreferences0.getString("instance-id", null);
        if(s == null) {
            synchronized(bxax0.h) {
                s = sharedPreferences0.getString("instance-id", null);
                if(s == null) {
                    s = UUID.randomUUID().toString();
                    sharedPreferences0.edit().putString("instance-id", s).commit();
                }
            }
        }
        bwne.b("Considering %d packages for index rebuild.", Integer.valueOf(set0.size()));
        for(Object object1: set0) {
            String s1 = (String)object1;
            if(bwtj.f(s1)) {
                bwne.b("Skipping package %s because automatic document deletion is disabled for it.", s1);
            }
            else {
                long v3 = huar.b();
                long v4 = PeriodicRebuildIndexChimeraService.f(v1, huar.b());
                long v5 = huar.b();
                if(PeriodicRebuildIndexChimeraService.f(PeriodicRebuildIndexChimeraService.f(bwrn.a(bwrn.a(0xCBF29CE484222325L, s1.getBytes(PeriodicRebuildIndexChimeraService.a)), s.getBytes(PeriodicRebuildIndexChimeraService.a)), v3) - v4, v5) + v1 < v) {
                    long v6 = v - bxax0.d(s1);
                    if(v6 < huar.a.d().s()) {
                        bwne.d("Skipping package %s because we just indexed it %d minutes ago.", s1, Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(v6)));
                        bwts0.f(s1, glrw.b, glru.i);
                    }
                    else {
                        if(bwqx1.e(s1, v, glrw.b, false)) {
                            bwne.b("Sent index request to package %s.", s1);
                        }
                        else {
                            bwne.b("Failed to send index request to package %s.", s1);
                        }
                        bwqx1 = bwqx0;
                        v = v;
                    }
                }
                else {
                    bwne.b("Skipping package %s because it is not scheduled in the current window.", s1);
                    bwqx1 = bwqx0;
                }
            }
        }
        bxax0.c.edit().putLong("last-periodic-rebuild", v).commit();
        return 0;
    }

    public static void e(cljp cljp0) {
        if(!huar.a.d().W()) {
            bwne.a("UPDATE_INDEX Periodic Scheduling Disabled.");
            return;
        }
        clks clks0 = new clks();
        clks0.j = "com.google.android.gms.icing.indexapi.PeriodicRebuildIndexService";
        clks0.t("PeriodicIndexRebuild");
        clks0.l(false);
        clks0.a = clkz.j;
        clks0.v(1);
        clks0.e();
        if(!hubu.l()) {
            clks0.j();
        }
        cljp0.f(clks0.a());
        bwne.a("Task scheduled.");
    }

    private static long f(long v, long v1) {
        long v2 = v % v1;
        return v2 >= 0L ? v2 : v2 + Math.abs(v1);
    }

    @Override  // com.google.android.gms.icing.appindexing.service.RebuildIndexChimeraService
    public final void onCreate() {
        super.onCreate();
        ccmq.a().a(bbdg.nu);
    }
}

