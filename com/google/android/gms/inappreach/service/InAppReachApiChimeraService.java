package com.google.android.gms.inappreach.service;

import bbcu;
import bboh;
import bzsp;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import ggnj;
import hufv;

public class InAppReachApiChimeraService extends cjtg {
    public static final bboh a = null;
    private static final String b = "com.google.android.gms.inappreach.service.InAppReachApiChimeraService";

    static {
        InAppReachApiChimeraService.a = bboh.b(InAppReachApiChimeraService.class.getName(), bbcu.fh);
    }

    public InAppReachApiChimeraService() {
        super(315, "com.google.android.gms.inappreach.service.START", ggnj.a, 1, 10);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        if(!hufv.d()) {
            cjtn0.a(23, null);
        }
        cjtn0.c(new bzsp(this.l(), getServiceRequest0.f, getServiceRequest0.p));
    }
}

