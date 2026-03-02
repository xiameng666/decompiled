package com.google.android.gms.credential.manager.service.firstparty;

import beck;
import bgfk;
import bgfm;
import bgfu;
import cjtn;
import cjts;
import com.google.android.gms.common.internal.GetServiceRequest;
import dagger.internal.DoubleCheck;
import ejaz;
import ggdx;
import ggfp;
import ggnj;
import hfuo;
import hsab;
import ibuq;

public final class CredentialManagerApiChimeraService extends bgfm {
    public bgfk a;

    public CredentialManagerApiChimeraService() {
        hfuo hfuo0 = hsab.a.d().d().b;
        ibuq.e(hfuo0, "getElementList(...)");
        ggfp ggfp0 = ggdx.d(hfuo0);
        super(0xC4, "com.google.android.gms.credential.manager.service.firstparty.START", ggnj.a, 0, 10, ggfp0);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        ibuq.f(getServiceRequest0, "request");
        bgfk bgfk0 = this.a;
        if(bgfk0 == null) {
            ibuq.j("apiStubFactory");
            bgfk0 = null;
        }
        cjts cjts0 = this.l();
        String s = getServiceRequest0.f;
        ibuq.e(s, "getCallingPackage(...)");
        cjtn0.c(new beck(s, getServiceRequest0.p, ((bgfu)bgfk0.a.a).a(), DoubleCheck.a(bgfk0.a.b), ((ejaz)bgfk0.a.c).a(), cjts0));
    }
}

