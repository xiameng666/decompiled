package com.google.android.gms.mobilesubscription.service;

import bbcu;
import bboh;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import csmr;
import ggfp;
import ggtj;
import hvlm;

public class MobileSubscriptionApiChimeraService extends cjtg {
    private static final ggfp a;
    private static final bboh b;

    static {
        MobileSubscriptionApiChimeraService.a = ggfp.K("android.permission-group.PHONE", "android.permission-group.STORAGE");
        MobileSubscriptionApiChimeraService.b = bboh.b("MobileSubscription", bbcu.db);
    }

    public MobileSubscriptionApiChimeraService() {
        ggfp ggfp0 = ggfp.G(hvlm.a.d().d().b);
        super(200, "com.google.android.gms.mobilesubscription.service.START", MobileSubscriptionApiChimeraService.a, 0, 10, ggfp0);
        ((ggtj)MobileSubscriptionApiChimeraService.b.h()).x("Service is created.");
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        cjtn0.c(new csmr(this.l(), getServiceRequest0.f, getServiceRequest0.p));
    }
}

