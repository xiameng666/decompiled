package com.google.android.gms.cobalt.api;

import azit;
import aziu;
import aziw;
import azkw;
import bbcu;
import bboh;
import cjtn;
import cjts;
import com.google.android.gms.common.internal.GetServiceRequest;
import ggnj;

public class CobaltLoggerApiService extends aziw {
    public static final bboh a;
    public aziu b;

    static {
        CobaltLoggerApiService.a = bboh.b("CobaltLoggerImpl", bbcu.fZ);
    }

    public CobaltLoggerApiService() {
        super(364, "com.google.android.gms.cobalt.api.CobaltLoggerApiService.START", ggnj.a, 1, 10);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        azit azit0 = this.b.a;
        String s = getServiceRequest0.f;
        cjtn0.c(new azkw(((cjts)azit0.a.get()), azit0.b, s));
    }
}

