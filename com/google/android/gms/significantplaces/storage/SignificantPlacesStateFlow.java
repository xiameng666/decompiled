package com.google.android.gms.significantplaces.storage;

import android.content.Context;
import android.content.Intent;
import cclv;
import cclw;
import clhr;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import epnv;
import epnw;
import ibps;
import ibrl;
import ibuq;
import ibuz;
import icbb;
import icck;
import iccl;
import icih;
import icir;
import iclv;
import icmp;
import icnj;
import icnl;
import icnm;
import java.util.List;

public final class SignificantPlacesStateFlow extends TracingBroadcastReceiver implements icnj {
    public final Context a;
    public final icnl b;
    private final icnj c;
    private final icck d;

    public SignificantPlacesStateFlow(icck icck0, Context context0) {
        ibuq.f(context0, "context");
        icnl icnl0 = icnm.a(ibps.a);
        super(context0);
        this.c = new icmp(icnl0);
        this.a = context0;
        this.b = icnl0;
        icck icck1 = iccl.d(icck0, cclv.d(clhr.b));
        this.d = icck1;
        ibuz ibuz0 = new ibuz();
        icir.d(new iclv(icnl0.d(), new epnv(ibuz0, this, icck1, null)), iccl.d(icck1, cclw.f));
    }

    @Override  // icnj
    public final Object b() {
        return (List)this.c.b();
    }

    @Override  // icmq
    public final List c() {
        return this.c.c();
    }

    public final void d() {
        epnw epnw0 = new epnw(this, null);
        icbb.b(this.d, null, null, epnw0, 3);
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        ibuq.f(context0, "context");
        ibuq.f(intent0, "intent");
        synchronized(this) {
            this.d();
        }
    }

    @Override  // icmq
    public final Object oR(icih icih0, ibrl ibrl0) {
        return this.c.oR(icih0, ibrl0);
    }
}

