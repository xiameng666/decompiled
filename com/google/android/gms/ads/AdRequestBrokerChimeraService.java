package com.google.android.gms.ads;

import abaf;
import abbm;
import android.content.Intent;
import android.os.IBinder;
import bbdg;
import ccmq;
import cjtg;
import cjtn;
import com.google.android.gms.ads.eventattestation.b;
import com.google.android.gms.ads.internal.config.s;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.common.internal.GetServiceRequest;
import ggnj;

public final class AdRequestBrokerChimeraService extends cjtg {
    public static final int a;

    public AdRequestBrokerChimeraService() {
        super(8, "com.google.android.gms.ads.service.START", ggnj.a, 3, 10);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        this.c();
        cjtn0.c(new abaf(abbm.f(this)));
    }

    private final void c() {
        b.a(this).a();
    }

    @Override  // cjtg
    public final IBinder onBind(Intent intent0) {
        ccmq.a().a(bbdg.xm);
        s.c(this);
        this.c();
        h.d("Binding to the ad request service.");
        return super.onBind(intent0);
    }
}

