package com.google.android.gms.nearby.fastpair.service;

import a;
import android.content.Context;
import android.os.Bundle;
import bbll;
import cljp;
import clkm;
import clkn;
import clkq;
import clkr;
import clks;
import clkz;
import clla;
import cllc;
import cllr;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import cunt;
import cust;
import cxzx;
import cyjh;
import cysr;
import cyss;
import cyst;
import ggtj;
import gmbu;
import gmcd;
import gmcg;
import hvpg;
import hvpp;
import java.util.concurrent.TimeUnit;

public class TaskSchedulerChimeraService extends GmsTaskBoundService {
    public static final int a;
    private final gmcg b;

    public TaskSchedulerChimeraService() {
        this.b = new bbll(1, 10);
    }

    public static clkr d(String s, clkm clkm0) {
        clkq clkq0 = new clkq();
        clkq0.w("com.google.android.gms.nearby.fastpair.service.TaskSchedulerChimeraService");
        clkq0.t(s);
        clkq0.j(clkm0);
        clkq0.v(1);
        clkq0.t = cllc.a;
        clkq0.y(0, 1);
        clkq0.x(0, 1);
        return clkq0.a();
    }

    public static clla e(String s, clkz clkz0) {
        clks clks0 = new clks();
        clks0.q(s);
        clks0.w("com.google.android.gms.nearby.fastpair.service.TaskSchedulerChimeraService");
        clks0.a = clkz0;
        clks0.v(1);
        clks0.l(true);
        return clks0.a();
    }

    public static void f(Context context0) {
        cyst.b(context0, "TAG_FOOTPRINTS_PERIODIC_SCHEDULE");
    }

    public static void g(Context context0, boolean z) {
        if(hvpp.S()) {
            clkn clkn0 = new clkn();
            clkn0.w("com.google.android.gms.nearby.fastpair.service.TaskSchedulerChimeraService");
            clkn0.t("TAG_FOOTPRINTS_ONE_OFF_SCHEDULE");
            clkn0.v(0);
            clkn0.e((z ? 0L : hvpg.B()), (z ? 1L : hvpg.B() + 60L));
            clkn0.t = cllc.a;
            clkn0.y(0, 0);
            clkn0.x(0, 0);
            cyst.d(context0, clkn0.a());
            return;
        }
        ((ggtj)cyjh.a.d().ar(0x1FC4)).x("TSS scheduleFootprintsOneOffSync: not enable");
    }

    public static void h(Context context0, cxzx cxzx0) {
        if(!hvpp.as()) {
            ((ggtj)cyjh.a.g().ar(0x1FC7)).x("TSS startTriangleMonitor: not enable");
            return;
        }
        TaskSchedulerChimeraService.i(context0, cxzx0, true);
        ggtj ggtj0 = (ggtj)cyjh.a.d().ar(0x1FC6);
        long v = cxzx0.a;
        ggtj0.A("TSS startTriangleMonitor: id %s", v);
        hvpg hvpg0 = hvpg.a;
        long v1 = TimeUnit.MINUTES.toMillis(hvpg0.aY().bK());
        if(cxzx0.k(v1)) {
            Bundle bundle0 = new Bundle();
            bundle0.putInt("KEY_TRIANGLE_MONITOR_TYPE", cxzx0.b - 1);
            cljp cljp0 = cljp.a(context0);
            long v2 = TimeUnit.MILLISECONDS.toSeconds(v1);
            clkn clkn0 = new clkn();
            clkn0.w("com.google.android.gms.nearby.fastpair.service.TaskSchedulerChimeraService");
            clkn0.t(a.u(v, "TAG_TRIANGLE_STOP_TRIANGLE_MONITOR_"));
            clkn0.v(1);
            clkn0.r(false);
            clkn0.i(false);
            clkn0.g(2);
            clkn0.e(v2, TimeUnit.MINUTES.toSeconds(hvpg0.aY().em()) + v2);
            clkn0.u = bundle0;
            cljp0.f(clkn0.a());
        }
    }

    public static void i(Context context0, cxzx cxzx0, boolean z) {
        if(!hvpp.as()) {
            ((ggtj)cyjh.a.d().ar(8140)).x("TSS stopTriangleMonitor: not enable");
            return;
        }
        ((ggtj)cyjh.a.d().ar(0x1FCB)).A("TSS stopTriangleMonitor: id %s", cxzx0.a);
        cljp.a(context0).d(a.u(cxzx0.a, "TAG_TRIANGLE_STOP_TRIANGLE_MONITOR_"), "com.google.android.gms.nearby.fastpair.service.TaskSchedulerChimeraService");
        cxzx0.j(new cunt(context0), z);
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final gmcd iL(cllr cllr0) {
        cust cust0 = cyjh.a;
        ggtj ggtj0 = (ggtj)cust0.d().ar(0x1FC1);
        String s = cllr0.a;
        ggtj0.B("TSS onRunTask: tag = %s", s);
        Integer integer0 = (int)0;
        Integer integer1 = (int)2;
        if(s.startsWith("TAG_FOOTPRINTS_")) {
            switch(s) {
                case "TAG_FOOTPRINTS_ONE_OFF_SCHEDULE": 
                case "TAG_FOOTPRINTS_PERIODIC_SCHEDULE": {
                    cysr.b(this, "com.google.android.gms.nearby.fastpair.service.ACTION_FOOTPRINTS_FORCE_SYNC", null);
                    return gmbu.i(integer0);
                }
                case "TAG_FOOTPRINTS_RECON_SYNC_SCHEDULE": {
                    cysr.b(this, "com.google.android.gms.nearby.fastpair.service.ACTION_FOOTPRINTS_RECON_SYNC", null);
                    return gmbu.i(integer0);
                }
                default: {
                    ((ggtj)cust0.g().ar(0x1FBF)).B("TSS onRunFootprintsTask: unknown tag %s", s);
                    return gmbu.i(integer1);
                }
            }
        }
        if(s.startsWith("TAG_TRIANGLE_")) {
            Bundle bundle0 = cllr0.b;
            if(s.startsWith("TAG_TRIANGLE_STOP_TRIANGLE_MONITOR_") && bundle0 != null) {
                cyss cyss0 = new cyss(this, s, bundle0);
                return this.b.e(cyss0);
            }
            ((ggtj)cust0.g().ar(0x1FC3)).B("TSS onRunTriangleTask: unknown triangle monitor tag %s or extras is null", s);
            return gmbu.i(integer1);
        }
        if(s.startsWith("TAG_SASS_")) {
            if("TAG_SASS_DEVICE_SETTINGS_PERIODIC_SCHEDULE".equals(s)) {
                cysr.b(this, "com.google.android.gms.nearby.fastpair.service.ACTION_REPORT_SASS_DEVICE_SETTINGS", null);
                return gmbu.i(integer0);
            }
            ((ggtj)cust0.g().ar(0x1FC0)).B("TSS onRunSassTask: unknown tag %s", s);
            return gmbu.i(integer1);
        }
        ((ggtj)cust0.g().ar(8130)).B("TSS onRunTaskAsync: unknown tag %s", s);
        return gmbu.i(integer1);
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final void onDestroy() {
        ((ggtj)cyjh.a.d().ar(0x1FBE)).x("TSS destroyed");
        this.b.shutdown();
        super.onDestroy();
    }
}

