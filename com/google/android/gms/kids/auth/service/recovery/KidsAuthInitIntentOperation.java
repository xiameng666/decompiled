package com.google.android.gms.kids.auth.service.recovery;

import android.content.Intent;
import avzf;
import bbdg;
import bboh;
import capv;
import cavv;
import ccmq;
import cljp;
import clks;
import clkz;
import com.google.android.gms.kids.auth.tasks.PeriodicHealthMetricsBoundService;
import ggtj;
import huix;
import ibuq;

public final class KidsAuthInitIntentOperation extends avzf {
    private static final bboh a;

    static {
        KidsAuthInitIntentOperation.a = capv.a("KidsAuthInitIntentOperation");
    }

    @Override  // avzf
    protected final void b(Intent intent0, int v) {
        ibuq.f(intent0, "intent");
        huix huix0 = huix.a;
        if(huix0.b().i()) {
            ((ggtj)KidsAuthInitIntentOperation.a.h()).B("Received intent to recover supervision setup: %s", intent0.getAction());
            new cavv(this).a();
        }
        if(huix0.b().l()) {
            clks clks0 = new clks();
            clks0.w(PeriodicHealthMetricsBoundService.a);
            clks0.a = clkz.m;
            clks0.q("PERIODIC_HEALTH_METRICS_TASK");
            clks0.l(false);
            cljp.a(this).f(clks0.a());
        }
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        ccmq.a().a(bbdg.mD);
    }
}

