package com.google.android.gms.ads.internal.client;

import abag;
import abbq;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import bjgw;
import com.google.android.gms.ads.internal.config.s;
import com.google.android.gms.ads.internal.flag.m;
import com.google.android.gms.ads.internal.util.client.f;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.dynamic.ObjectWrapper;
import gftb;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public final class br {
    public final abbq a;
    public final v b;
    public a c;
    public abag[] d;
    public an e;
    public String f;
    public final ViewGroup g;
    public com.google.ads.mediation.a h;
    private final com.google.android.gms.ads.internal.mediation.client.a i;
    private final i j;
    private final AtomicLong k;

    public br(ViewGroup viewGroup0) {
        this.i = new com.google.android.gms.ads.internal.mediation.client.a();
        this.a = new abbq();
        this.b = new bq(this);
        this.k = new AtomicLong();
        this.g = viewGroup0;
        this.j = i.a;
        this.e = null;
        new AtomicBoolean(false);
    }

    public final bk a() {
        an an0 = this.e;
        if(an0 != null) {
            try {
                return an0.b();
            }
            catch(RemoteException remoteException0) {
                h.o("#007 Could not call remote method.", remoteException0);
            }
        }
        return null;
    }

    public final void b() {
        try {
            an an0 = this.e;
            if(an0 != null) {
                an0.d();
            }
        }
        catch(RemoteException remoteException0) {
            h.o("#007 Could not call remote method.", remoteException0);
        }
    }

    public final void c(bo bo0) {
        try {
            long v = System.currentTimeMillis();
            if(this.e == null) {
                if(this.d == null || this.f == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                ViewGroup viewGroup0 = this.g;
                Context context0 = viewGroup0.getContext();
                AdSizeParcel adSizeParcel0 = br.f(context0, this.d);
                an an0 = "search_v2".equals(adSizeParcel0.a) ? ((an)new o(u.a(), context0, adSizeParcel0, this.f).d(context0)) : ((an)new n(u.a(), context0, adSizeParcel0, this.f, this.i).d(context0));
                this.e = an0;
                an0.g(new z(this.b));
                a a0 = this.c;
                if(a0 != null) {
                    this.e.p(new x(a0));
                }
                com.google.ads.mediation.a a1 = this.h;
                if(a1 != null) {
                    this.e.i(new aw(a1));
                }
                this.e.v(new bg());
                this.e.n();
                an an1 = this.e;
                if(an1 != null) {
                    try {
                        bjgw bjgw0 = an1.c();
                        if(bjgw0 != null) {
                            if(((Boolean)m.c.d()).booleanValue() && ((Boolean)s.bF.g()).booleanValue()) {
                                bp bp0 = new bp(this, bjgw0);
                                f.a.post(bp0);
                            }
                            else {
                                viewGroup0.addView(((View)ObjectWrapper.a(bjgw0)));
                            }
                        }
                    }
                    catch(RemoteException remoteException1) {
                        h.o("#007 Could not call remote method.", remoteException1);
                    }
                }
            }
            bo0.i = v;
            gftb.check(this.e);
            an an2 = this.e;
            AtomicLong atomicLong0 = this.k;
            if(atomicLong0.get() != 0L) {
                an2.k(atomicLong0.get());
            }
            Context context1 = this.g.getContext();
            an2.m(this.j.a(context1, bo0));
        }
        catch(RemoteException remoteException0) {
            h.o("#007 Could not call remote method.", remoteException0);
        }
    }

    public final void d() {
        try {
            an an0 = this.e;
            if(an0 != null) {
                an0.e();
            }
        }
        catch(RemoteException remoteException0) {
            h.o("#007 Could not call remote method.", remoteException0);
        }
    }

    public final void e() {
        try {
            an an0 = this.e;
            if(an0 != null) {
                an0.f();
            }
        }
        catch(RemoteException remoteException0) {
            h.o("#007 Could not call remote method.", remoteException0);
        }
    }

    public static AdSizeParcel f(Context context0, abag[] arr_abag) {
        if(arr_abag[0].equals(abag.b)) {
            return new AdSizeParcel("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
        }
        AdSizeParcel adSizeParcel0 = new AdSizeParcel(context0, arr_abag);
        adSizeParcel0.j = false;
        return adSizeParcel0;
    }
}

