package com.google.android.gms.quickstart.xos.api;

import android.content.Intent;
import baun;
import bbdg;
import bxwm;
import ccmq;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import ejlu;
import ejne;
import ggfp;
import ggnj;
import hxrq;

public final class SourceXosApiService extends ejne {
    public static final baun a;
    public bxwm b;

    static {
        SourceXosApiService.a = new baun("QuickStart", new String[]{"SourceXosApiService"});
    }

    public SourceXosApiService() {
        ggfp ggfp0 = ggfp.G(hxrq.a.b().c().b);
        super(328, "com.google.android.gms.quickstart.xos.api.SourceXosApiService.START", ggnj.a, 0, 9, ggfp0);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        SourceXosApiService.a.d("onGetService()", new Object[0]);
        cjtn0.c(new ejlu(this, this.l(), this.b, getServiceRequest0.f, getServiceRequest0.p));
    }

    @Override  // ejne
    public final void onCreate() {
        ccmq.a().a(bbdg.ks);
        SourceXosApiService.a.d("onCreate()", new Object[0]);
        this.d();
    }

    @Override  // com.google.android.chimera.BoundService
    public final boolean onUnbind(Intent intent0) {
        SourceXosApiService.a.d("onUnbind()", new Object[0]);
        return false;
    }
}

