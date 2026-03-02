package com.google.android.gms.tapandpay.service;

import bbcu;
import bbdg;
import bboh;
import ccmq;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import esgb;
import eszu;
import ggoh;

public class TapAndPayChimeraService extends cjtg {
    public static final bboh a;

    static {
        TapAndPayChimeraService.a = bboh.b("TapAndPay", bbcu.aM);
    }

    public TapAndPayChimeraService() {
        ggoh ggoh0 = new ggoh("android.permission-group.PHONE");
        super(new int[]{0x4F}, new String[]{"com.google.android.gms.tapandpay.service.BIND"}, ggoh0, 3, 9, 4, null);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        if(!esgb.a(this)) {
            cjtn0.b(16, null, null);
            return;
        }
        cjtn0.c(new eszu(this, this.l(), getServiceRequest0.i, getServiceRequest0.f, getServiceRequest0.p));
    }

    @Override  // com.google.android.chimera.BoundService
    public final void onCreate() {
        ccmq.a().a(bbdg.t);
    }
}

