package com.google.android.gms.auth.folsom.service;

import ajth;
import akbl;
import akea;
import android.os.Bundle;
import baun;
import bbdg;
import bbmq;
import ccmq;
import cjtg;
import cjtn;
import com.google.android.gms.chimera.modules.auth.folsom.AppContextProvider;
import com.google.android.gms.common.internal.GetServiceRequest;
import ggfn;
import ggfp;
import ggnj;
import hput;
import hpvv;

public class KeyRetrievalApiChimeraService extends cjtg {
    private static final baun a;

    static {
        KeyRetrievalApiChimeraService.a = akea.a("KeyRetrievalApi");
    }

    public KeyRetrievalApiChimeraService() {
        ggfn ggfn0 = new ggfn();
        ggfn0.k(hput.a.c().s().b);
        ggfn0.k(hput.a.c().t().b);
        ggfp ggfp0 = ggfn0.h();
        super(0xAC, "com.google.android.gms.auth.key.retrieval.service.START", ggnj.a, 0, 10, ggfp0);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        Bundle bundle0 = getServiceRequest0.i;
        String s = bundle0.getString("SECURITY_DOMAIN");
        String s1 = bundle0.getString("UTM_SOURCE");
        String s2 = bundle0.getString("UTM_MEDIUM");
        String s3 = bundle0.getString("UTM_CAMPAIGN");
        String s4 = bundle0.getString("SESSION_ID");
        int v = bundle0.getInt("CALLER_ID", 0);
        boolean z = bundle0.getBoolean("OFFER_RESET");
        if(s == null) {
            KeyRetrievalApiChimeraService.a.d("Security domain is not set", new Object[0]);
            cjtn0.a(10, new Bundle());
            return;
        }
        if(akbl.A(s) && !s.isEmpty() && !akbl.A(s)) {
            KeyRetrievalApiChimeraService.a.d("KeyRetrievalApi is disabled by a flag.", new Object[0]);
            cjtn0.a(16, new Bundle());
            return;
        }
        cjtn0.c(new ajth(this.l(), s, (!hpvv.o() || getServiceRequest0.f.equals("com.google.android.gms.auth.diagnostic") ? true : bbmq.Y(AppContextProvider.a())), s1, s2, s3, s4, v, z, getServiceRequest0.f, getServiceRequest0.p));
    }

    @Override  // com.google.android.chimera.BoundService
    public final void onCreate() {
        ccmq.a().a(bbdg.mN);
    }
}

