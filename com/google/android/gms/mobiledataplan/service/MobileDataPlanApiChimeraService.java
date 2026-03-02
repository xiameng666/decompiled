package com.google.android.gms.mobiledataplan.service;

import bbcu;
import bbdg;
import bboh;
import ccmq;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import crvw;
import crxd;
import crxk;
import cslm;
import ggfp;
import hvko;
import java.util.logging.Level;

public class MobileDataPlanApiChimeraService extends cjtg {
    public static final ggfp a;
    private static final ggfp b;
    private static final bboh c;

    static {
        MobileDataPlanApiChimeraService.b = ggfp.K("android.permission-group.PHONE", "android.permission-group.STORAGE");
        MobileDataPlanApiChimeraService.c = bboh.b("MobileDataPlan", bbcu.ck);
        MobileDataPlanApiChimeraService.a = ggfp.N("com.google.android.youtube", "com.google.android.apps.youtube.unplugged", "com.google.android.apps.subscriptions.red", "com.android.vending", "com.google.android.apps.youtube.music");
    }

    public MobileDataPlanApiChimeraService() {
        super(0x9E, "com.google.android.gms.mobiledataplan.service.START", MobileDataPlanApiChimeraService.b, 0, 10, MobileDataPlanApiChimeraService.a);
        Level level0 = cslm.h();
        MobileDataPlanApiChimeraService.c.g(level0).x("Service is created.");
        Level level1 = cslm.h();
        MobileDataPlanApiChimeraService.c.g(level1).H("Service visibility is: %d, with allowList: %s", 0, MobileDataPlanApiChimeraService.a);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        if(hvko.G()) {
            crxd.a().c(this);
        }
        cjtn0.c(new crxk(this.l(), getServiceRequest0.f, getServiceRequest0.p));
    }

    @Override  // com.google.android.chimera.BoundService
    public final void onCreate() {
        ccmq.a().a(bbdg.pN);
    }

    @Override  // cjtg
    public final void onDestroy() {
        Level level0 = cslm.h();
        MobileDataPlanApiChimeraService.c.g(level0).x("Service is being destroyed.");
        crvw crvw0 = crvw.c();
        synchronized(crvw.b) {
            synchronized(crvw0.d.b) {
                crvw0.d.a.getDatabaseName();
                crvw0.d.a.close();
            }
            crvw.a = null;
        }
        super.onDestroy();
    }
}

