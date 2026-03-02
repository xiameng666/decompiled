package com.google.android.gms.mdm.services;

import android.content.Intent;
import cljp;
import clkn;
import clko;
import cllr;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import cqix;
import cqjv;
import cqqt;
import hlud;
import hxwi;
import j..time.Duration;
import j..time.Instant;
import j..util.Objects;
import java.util.Random;

public final class PeriodicSitrepService extends GmsTaskBoundService {
    public static final int a;
    private final Random b;

    public PeriodicSitrepService() {
        this.b = new Random();
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final int a(cllr cllr0) {
        boolean z;
        String s = cllr0.a;
        if(!Objects.equals(s, "periodic_sitrep_check") && !Objects.equals(s, "jittered_sitrep")) {
            return 2;
        }
        if(hxwi.e()) {
            long v = (long)(((Long)cqix.c.c()));
            if(Long.compare(v, 0L) == 0) {
                cqqt.c("No sitrep timestamp yet", new Object[0]);
                z = hxwi.a.c().o();
            }
            else {
                long v1 = hxwi.a.c().b();
                if(v1 < 0L) {
                    z = false;
                }
                else if(Duration.between(Instant.ofEpochMilli(v), Instant.now()).toDays() >= v1) {
                    z = true;
                }
                else {
                    z = false;
                }
            }
            Intent intent0 = cqjv.a(this, z, hlud.o);
            if(intent0 == null) {
                cqqt.c("Sitrep not needed", new Object[0]);
                return 0;
            }
            cqqt.c("Sitrep needed, forced=%s", new Object[]{Boolean.valueOf(z)});
            if(Objects.equals(s, "periodic_sitrep_check")) {
                cqqt.c("Scheduling jittered sitrep", new Object[0]);
                float f = this.b.nextFloat();
                if(hxwi.e()) {
                    long v2 = hxwi.a.c().a() / 2L;
                    long v3 = (long)Math.round(f * ((float)v2));
                    clkn clkn0 = new clkn();
                    clkn0.w(PeriodicSitrepService.class.getName());
                    clkn0.q("jittered_sitrep");
                    clkn0.e(v3, v2 + v3);
                    clkn0.y(0, 1);
                    clkn0.x(0, 1);
                    clkn0.f(0, 1);
                    clkn0.v(2);
                    clko clko0 = clkn0.a();
                    cljp.a(this).f(clko0);
                    return 0;
                }
            }
            else if(Objects.equals(s, "jittered_sitrep")) {
                cqqt.c("Starting sitrep service", new Object[0]);
                this.startService(intent0);
            }
        }
        return 0;
    }
}

