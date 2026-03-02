package com.google.android.gms.recaptchabase.api.service;

import bbdg;
import ccmq;
import cjtg;
import cjtn;
import cjts;
import com.google.android.gms.common.internal.GetServiceRequest;
import ejqw;
import ejqz;
import ejra;
import ejsx;
import ggnj;
import ibuq;

public final class RecaptchaBaseApiService extends cjtg {
    public RecaptchaBaseApiService() {
        super(380, "com.google.android.gms.recaptchabase.service.START", ggnj.a, 3, 10);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        ibuq.f(getServiceRequest0, "request");
        cjts cjts0 = this.l();
        String s = getServiceRequest0.f;
        ibuq.e(s, "getCallingPackage(...)");
        ejra ejra0 = new ejra(s, ejqw.a());
        String s1 = getServiceRequest0.f;
        ibuq.e(s1, "getCallingPackage(...)");
        cjtn0.c(new ejsx(cjts0, ejra0, new ejqz(s1, ejqw.a())));
    }

    @Override  // com.google.android.chimera.BoundService
    public final void onCreate() {
        ccmq.a().a(bbdg.qR);
    }
}

