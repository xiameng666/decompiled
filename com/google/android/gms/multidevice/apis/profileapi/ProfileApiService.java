package com.google.android.gms.multidevice.apis.profileapi;

import bbdg;
import bbmq;
import ccmq;
import cjtn;
import cjts;
import com.google.android.gms.chimera.modules.multidevice.AppContextProvider;
import com.google.android.gms.common.internal.GetServiceRequest;
import cssf;
import csxk;
import ctcg;
import cume;
import ggnj;
import hvmm;
import ibnf;
import ibuk;
import ibuq;

public final class ProfileApiService extends cssf {
    public ibnf a;

    static {
        cume.a(new ibuk(ProfileApiService.class));
    }

    public ProfileApiService() {
        super(356, "com.google.android.gms.multidevice.apis.profileapi.ProfileApiService.START", ggnj.a, 0, 10);
    }

    @Override  // cjtg
    public final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        ibuq.f(getServiceRequest0, "request");
        ccmq.a().a(bbdg.qa);
        ibnf ibnf0 = null;
        if(hvmm.c()) {
            if(bbmq.Q(AppContextProvider.b())) {
                cjtn0.a(23, null);
                return;
            }
            cjts cjts0 = this.l();
            ibnf ibnf1 = this.a;
            if(ibnf1 == null) {
                ibuq.j("settingsManager");
            }
            else {
                ibnf0 = ibnf1;
            }
            Object object0 = ibnf0.get();
            ibuq.e(object0, "get(...)");
            String s = getServiceRequest0.f;
            ibuq.e(s, "getCallingPackage(...)");
            cjtn0.c(new ctcg(cjts0, ((csxk)object0), s, getServiceRequest0.p));
            return;
        }
        cjtn0.a(16, null);
    }
}

