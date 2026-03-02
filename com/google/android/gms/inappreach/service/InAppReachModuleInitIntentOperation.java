package com.google.android.gms.inappreach.service;

import android.content.Intent;
import avzf;
import bbcu;
import bboh;
import cljp;
import clkm;
import clkq;
import com.google.android.gms.inappreach.service.rps.FetchAccountMessagesTaskBoundService;
import hufv;

public class InAppReachModuleInitIntentOperation extends avzf {
    static {
        bboh.b("InAppReachModuleInit", bbcu.fh);
    }

    @Override  // avzf
    protected final void a(Intent intent0, boolean z) {
    }

    @Override  // avzf
    protected final void b(Intent intent0, int v) {
        cljp cljp0 = cljp.a(this.getApplicationContext());
        clkq clkq0 = new clkq();
        clkq0.j(clkm.a(hufv.a.b().a()));
        clkq0.w(FetchAccountMessagesTaskBoundService.a);
        clkq0.t("PERIODIC_FETCH_TASK");
        clkq0.g(1);
        clkq0.v(1);
        cljp0.f(clkq0.a());
    }

    @Override  // avzf
    protected final void d(Intent intent0, boolean z) {
    }
}

