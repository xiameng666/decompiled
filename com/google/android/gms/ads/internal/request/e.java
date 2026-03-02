package com.google.android.gms.ads.internal.request;

import abap;
import abbc;
import abbm;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.config.s;
import com.google.android.gms.ads.internal.flag.r;
import com.google.android.gms.ads.internal.js.function.k;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.a;
import com.google.android.gms.ads.nonagon.load.service.c;
import com.google.android.gms.ads.nonagon.load.service.d;
import com.google.android.gms.ads.nonagon.load.service.h;
import com.google.android.gms.ads.nonagon.load.service.m;
import com.google.android.gms.ads.nonagon.load.service.n;
import com.google.android.gms.ads.nonagon.load.service.p;
import com.google.android.gms.ads.nonagon.load.service.t;
import com.google.android.gms.ads.nonagon.load.service.v;
import com.google.android.gms.ads.nonagon.load.service.w;
import com.google.android.gms.ads.nonagon.load.service.x;
import com.google.android.gms.ads.nonagon.signals.gmscore.ac;
import com.google.android.gms.ads.nonagon.signals.gmscore.f;
import com.google.android.gms.ads.nonagon.signals.gmscore.i;
import com.google.android.gms.ads.nonagon.util.cache.PoolConfiguration;
import com.google.android.gms.ads.nonagon.util.logging.cui.b;
import com.google.android.gms.ads.nonagon.util.logging.cui.g;
import com.google.android.gms.ads.nonagon.util.logging.cui.j;
import com.google.android.gms.ads.nonagon.util.logging.cui.l;
import com.google.android.gms.ads.nonagon.util.logging.cui.o;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import glzd;
import gmbt;
import gmbu;
import gmcd;
import gmcg;
import hopm;
import hosg;
import j..util.Objects;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import wby;
import wbz;

public final class e extends wby implements IInterface {
    private final Context a;
    private final gmcg b;
    private final x c;
    private final a d;
    private final ArrayDeque e;
    private final o f;

    public e() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    public e(Context context0, gmcg gmcg0, a a0, x x0, ArrayDeque arrayDeque0, o o0) {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
        s.c(context0);
        this.a = context0;
        this.b = gmcg0;
        this.c = x0;
        this.d = a0;
        this.e = arrayDeque0;
        this.f = o0;
    }

    public final void a(n n0) {
        synchronized(this) {
            this.d();
            this.e.addLast(n0);
        }
    }

    private final n c(String s) {
        synchronized(this) {
            Iterator iterator0 = this.e.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                n n0 = (n)object0;
                if(n0.c.equals(s)) {
                    iterator0.remove();
                    return n0;
                }
            }
        }
        return null;
    }

    private final void d() {
        synchronized(this) {
            int v1 = ((Long)r.b.d()).intValue();
            while(true) {
                ArrayDeque arrayDeque0 = this.e;
                if(arrayDeque0.size() < v1) {
                    break;
                }
                arrayDeque0.removeFirst();
            }
        }
    }

    private static gmcd e(gmcd gmcd0, com.google.android.gms.ads.nonagon.util.concurrent.o o0, k k0, l l0, b b0) {
        h h0 = new h();
        com.google.android.gms.ads.internal.js.function.o o1 = k0.a("AFMA_getAdDictionary", com.google.android.gms.ads.internal.js.function.h.b, h0);
        com.google.android.gms.ads.nonagon.util.logging.cui.k.c(gmcd0, b0);
        gmcd gmcd1 = o0.b(com.google.android.gms.ads.nonagon.util.event.a.g, gmcd0).c(o1).a();
        if(((Boolean)com.google.android.gms.ads.internal.flag.h.c.d()).booleanValue()) {
            gmbu.t(gmbt.h(gmcd1), new j(l0, b0), com.google.android.gms.ads.internal.util.future.e.d);
        }
        return gmcd1;
    }

    private static gmcd f(NonagonRequestParcel nonagonRequestParcel0, com.google.android.gms.ads.nonagon.util.concurrent.o o0, f f0) {
        com.google.android.gms.ads.nonagon.load.service.b b0 = new com.google.android.gms.ads.nonagon.load.service.b(f0, nonagonRequestParcel0);
        c c0 = new c();
        gmcd gmcd0 = gmbu.i(nonagonRequestParcel0.a);
        return o0.b(com.google.android.gms.ads.nonagon.util.event.a.e, gmcd0).c(b0).b(c0).a();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        gmcd gmcd9;
        com.google.android.gms.ads.internal.request.j j2;
        NonagonRequestParcel nonagonRequestParcel3;
        gmcd gmcd6;
        gmcd gmcd4;
        com.google.android.gms.ads.nonagon.util.concurrent.h h1;
        com.google.android.gms.ads.internal.request.j j1;
        com.google.android.gms.ads.internal.request.j j0 = null;
        switch(v) {
            case 1: {
                AdRequestInfoParcel adRequestInfoParcel0 = (AdRequestInfoParcel)wbz.a(parcel0, AdRequestInfoParcel.CREATOR);
                e.gr(parcel0);
                parcel1.writeNoException();
                wbz.g(parcel1, null);
                return true;
            }
            case 2: {
                AdRequestInfoParcel adRequestInfoParcel1 = (AdRequestInfoParcel)wbz.a(parcel0, AdRequestInfoParcel.CREATOR);
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if((iInterface0 instanceof com.google.android.gms.ads.internal.request.f)) {
                        com.google.android.gms.ads.internal.request.f f0 = (com.google.android.gms.ads.internal.request.f)iInterface0;
                    }
                }
                e.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                NonagonRequestParcel nonagonRequestParcel0 = (NonagonRequestParcel)wbz.a(parcel0, NonagonRequestParcel.CREATOR);
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 == null) {
                    j1 = null;
                }
                else {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    j1 = (iInterface1 instanceof com.google.android.gms.ads.internal.request.j) ? ((com.google.android.gms.ads.internal.request.j)iInterface1) : new com.google.android.gms.ads.internal.request.j(iBinder1);
                }
                e.gr(parcel0);
                if(((Boolean)s.Q.g()).booleanValue()) {
                    Bundle bundle0 = nonagonRequestParcel0.m;
                    if(bundle0 != null) {
                        bundle0.putLong(com.google.android.gms.ads.nonagon.csi.a.g.an, System.currentTimeMillis());
                    }
                }
                Context context0 = this.a;
                int v1 = Binder.getCallingUid();
                k k0 = com.google.android.gms.ads.internal.c.b().a(context0, new VersionInfoParcel(0xF1B18AD, 0xF1B18AD), this.f);
                f f1 = this.d.g(nonagonRequestParcel0, v1);
                com.google.android.gms.ads.internal.js.function.o o0 = k0.a("google.afma.response.normalize", p.a, com.google.android.gms.ads.internal.js.function.h.c);
                if(((Boolean)r.a.d()).booleanValue()) {
                    j0 = this.c(nonagonRequestParcel0.h);
                }
                b b0 = j0 == null ? com.google.android.gms.ads.nonagon.util.logging.cui.a.a(context0, 9) : j0.d;
                l l0 = f1.c();
                l0.c(nonagonRequestParcel0.a.getStringArrayList("ad_types"));
                w w0 = new w(nonagonRequestParcel0.g, l0, b0);
                t t0 = new t(context0, nonagonRequestParcel0.b.a, v1);
                com.google.android.gms.ads.nonagon.util.concurrent.o o1 = f1.d();
                b b1 = com.google.android.gms.ads.nonagon.util.logging.cui.a.a(context0, 11);
                if(j0 == null) {
                    gmcd gmcd0 = e.f(nonagonRequestParcel0, o1, f1);
                    gmcd gmcd1 = e.e(gmcd0, o1, k0, l0, b0);
                    b b2 = com.google.android.gms.ads.nonagon.util.logging.cui.a.a(context0, 10);
                    com.google.android.gms.ads.nonagon.util.concurrent.h h0 = o1.a(com.google.android.gms.ads.nonagon.util.event.a.i, new gmcd[]{gmcd1, gmcd0}).a(new d(gmcd1, nonagonRequestParcel0, gmcd0)).b(w0).b(new g(b2)).b(t0).a();
                    com.google.android.gms.ads.nonagon.util.logging.cui.k.a(h0, l0, b2);
                    com.google.android.gms.ads.nonagon.util.logging.cui.k.c(h0, b1);
                    h1 = o1.a(com.google.android.gms.ads.nonagon.util.event.a.k, new gmcd[]{gmcd0, gmcd1, h0}).a(new com.google.android.gms.ads.nonagon.load.service.e(nonagonRequestParcel0, h0, gmcd0, gmcd1)).c(o0).a();
                }
                else {
                    v v2 = new v(j0.b, j0.a);
                    b b3 = com.google.android.gms.ads.nonagon.util.logging.cui.a.a(context0, 10);
                    gmcd gmcd2 = gmbu.i(v2);
                    com.google.android.gms.ads.nonagon.util.concurrent.h h2 = o1.b(com.google.android.gms.ads.nonagon.util.event.a.i, gmcd2).b(w0).b(new g(b3)).b(t0).a();
                    com.google.android.gms.ads.nonagon.util.logging.cui.k.a(h2, l0, b3);
                    gmcd gmcd3 = gmbu.i(j0);
                    com.google.android.gms.ads.nonagon.util.logging.cui.k.c(h2, b1);
                    h1 = o1.a(com.google.android.gms.ads.nonagon.util.event.a.k, new gmcd[]{h2, gmcd3}).a(new com.google.android.gms.ads.nonagon.load.service.a(h2, gmcd3)).c(o0).a();
                }
                com.google.android.gms.ads.nonagon.util.logging.cui.k.a(h1, l0, b1);
                this.g(h1, j1, nonagonRequestParcel0);
                if(((Boolean)com.google.android.gms.ads.internal.flag.n.g.d()).booleanValue()) {
                    Objects.requireNonNull(this.c);
                    h1.hB(new com.google.android.gms.ads.nonagon.load.service.g(this.c), this.b);
                }
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                NonagonRequestParcel nonagonRequestParcel1 = (NonagonRequestParcel)wbz.a(parcel0, NonagonRequestParcel.CREATOR);
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    j0 = (iInterface2 instanceof com.google.android.gms.ads.internal.request.j) ? ((com.google.android.gms.ads.internal.request.j)iInterface2) : new com.google.android.gms.ads.internal.request.j(iBinder2);
                }
                e.gr(parcel0);
                if(((Boolean)s.Q.g()).booleanValue()) {
                    Bundle bundle1 = nonagonRequestParcel1.m;
                    if(bundle1 != null) {
                        bundle1.putLong(com.google.android.gms.ads.nonagon.csi.a.g.an, System.currentTimeMillis());
                    }
                }
                Context context1 = this.a;
                int v3 = Binder.getCallingUid();
                k k1 = com.google.android.gms.ads.internal.c.b().a(context1, new VersionInfoParcel(0xF1B18AD, 0xF1B18AD), this.f);
                if(((Boolean)com.google.android.gms.ads.internal.flag.v.a.d()).booleanValue()) {
                    f f2 = this.d.g(nonagonRequestParcel1, v3);
                    Context context2 = abbc.b(((abap)f2).b.a);
                    ((abap)f2).b.c();
                    ((abap)f2).b.d();
                    Object object0 = ((abap)f2).b.p.get();
                    i i0 = ((abap)f2).a();
                    ac ac0 = ((abap)f2).b();
                    Lazy lazy0 = DoubleCheck.a(((abap)f2).g);
                    Lazy lazy1 = DoubleCheck.a(((abap)f2).h);
                    Lazy lazy2 = DoubleCheck.a(((abap)f2).j);
                    Lazy lazy3 = DoubleCheck.a(((abap)f2).k);
                    Lazy lazy4 = DoubleCheck.a(((abap)f2).l);
                    Lazy lazy5 = DoubleCheck.a(((abap)f2).o);
                    Lazy lazy6 = DoubleCheck.a(((abap)f2).p);
                    gmcg gmcg0 = com.google.android.gms.ads.nonagon.util.concurrent.c.a();
                    l l1 = (l)((abap)f2).c.get();
                    com.google.android.gms.ads.nonagon.csi.d d0 = (com.google.android.gms.ads.nonagon.csi.d)((abap)f2).b.t.get();
                    HashSet hashSet0 = new HashSet();
                    hashSet0.add(((com.google.android.gms.ads.nonagon.signals.gmscore.v)object0));
                    hashSet0.add(i0);
                    hashSet0.add(ac0);
                    if(((Boolean)s.aL.g()).booleanValue()) {
                        hashSet0.add(((com.google.android.gms.ads.nonagon.signals.e)lazy0.get()));
                    }
                    if(((Boolean)s.aM.g()).booleanValue()) {
                        hashSet0.add(((com.google.android.gms.ads.nonagon.signals.e)lazy1.get()));
                    }
                    if(!hopm.a.e().o() && ((Boolean)s.aN.g()).booleanValue()) {
                        hashSet0.add(((com.google.android.gms.ads.nonagon.signals.e)lazy2.get()));
                    }
                    if(((Boolean)s.aQ.g()).booleanValue()) {
                        hashSet0.add(((com.google.android.gms.ads.nonagon.signals.e)lazy3.get()));
                    }
                    if(((Boolean)s.aR.g()).booleanValue()) {
                        hashSet0.add(((com.google.android.gms.ads.nonagon.signals.e)lazy4.get()));
                    }
                    if(hosg.e()) {
                        hashSet0.add(((com.google.android.gms.ads.nonagon.signals.e)lazy5.get()));
                    }
                    if(((Boolean)s.ab.g()).booleanValue()) {
                        hashSet0.add(((com.google.android.gms.ads.nonagon.signals.e)lazy6.get()));
                    }
                    com.google.android.gms.ads.nonagon.signals.h h3 = new com.google.android.gms.ads.nonagon.signals.h(context2, gmcg0, hashSet0, l1, d0);
                    com.google.android.gms.ads.internal.js.function.o o2 = k1.a("google.afma.request.getSignals", com.google.android.gms.ads.internal.js.function.h.b, com.google.android.gms.ads.internal.js.function.h.c);
                    b b4 = com.google.android.gms.ads.nonagon.util.logging.cui.a.a(context1, 22);
                    com.google.android.gms.ads.nonagon.util.concurrent.o o3 = f2.d();
                    gmcd gmcd5 = gmbu.i(nonagonRequestParcel1.a);
                    com.google.android.gms.ads.nonagon.util.concurrent.n n0 = o3.b(com.google.android.gms.ads.nonagon.util.event.a.l, gmcd5).b(new g(b4)).c(new com.google.android.gms.ads.nonagon.load.service.j(h3, nonagonRequestParcel1));
                    com.google.android.gms.ads.nonagon.util.concurrent.h h4 = n0.a();
                    com.google.android.gms.ads.nonagon.util.concurrent.h h5 = n0.a.b(com.google.android.gms.ads.nonagon.util.event.a.m, h4).c(o2).a();
                    l l2 = f2.c();
                    l2.c(nonagonRequestParcel1.a.getStringArrayList("ad_types"));
                    l2.d(nonagonRequestParcel1.a.getBundle("extras"));
                    com.google.android.gms.ads.nonagon.util.logging.cui.k.b(h5, l2, b4, true);
                    if(((Boolean)com.google.android.gms.ads.internal.flag.n.h.d()).booleanValue()) {
                        Objects.requireNonNull(this.c);
                        h5.hB(new com.google.android.gms.ads.nonagon.load.service.g(this.c), this.b);
                    }
                    gmcd4 = h5;
                }
                else {
                    gmcd4 = gmbu.h(new Exception("Signal collection disabled."));
                }
                this.g(gmcd4, j0, nonagonRequestParcel1);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                NonagonRequestParcel nonagonRequestParcel2 = (NonagonRequestParcel)wbz.a(parcel0, NonagonRequestParcel.CREATOR);
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    j0 = (iInterface3 instanceof com.google.android.gms.ads.internal.request.j) ? ((com.google.android.gms.ads.internal.request.j)iInterface3) : new com.google.android.gms.ads.internal.request.j(iBinder3);
                }
                e.gr(parcel0);
                int v4 = Binder.getCallingUid();
                if(((Boolean)r.a.d()).booleanValue()) {
                    PoolConfiguration poolConfiguration0 = nonagonRequestParcel2.i;
                    if(poolConfiguration0 == null) {
                        gmcd6 = gmbu.h(new Exception("Pool configuration missing from request."));
                        nonagonRequestParcel3 = nonagonRequestParcel2;
                    }
                    else if(poolConfiguration0.b != 0 && poolConfiguration0.c != 0) {
                        VersionInfoParcel versionInfoParcel0 = new VersionInfoParcel(0xF1B18AD, 0xF1B18AD);
                        f f3 = this.d.g(nonagonRequestParcel2, v4);
                        com.google.android.gms.ads.nonagon.util.concurrent.o o4 = f3.d();
                        gmcd gmcd7 = e.f(nonagonRequestParcel2, o4, f3);
                        l l3 = f3.c();
                        b b5 = com.google.android.gms.ads.nonagon.util.logging.cui.a.a(this.a, 9);
                        gmcd gmcd8 = e.e(gmcd7, o4, com.google.android.gms.ads.internal.c.b().a(this.a, versionInfoParcel0, this.f), l3, b5);
                        nonagonRequestParcel3 = nonagonRequestParcel2;
                        gmcd6 = o4.a(com.google.android.gms.ads.nonagon.util.event.a.z, new gmcd[]{gmcd7, gmcd8}).a(new com.google.android.gms.ads.nonagon.load.service.f(this, gmcd8, gmcd7, nonagonRequestParcel3, b5)).a();
                    }
                    else {
                        nonagonRequestParcel3 = nonagonRequestParcel2;
                        gmcd6 = gmbu.h(new Exception("Caching is disabled."));
                    }
                }
                else {
                    gmcd6 = gmbu.h(new Exception("Split request is disabled."));
                    nonagonRequestParcel3 = nonagonRequestParcel2;
                }
                this.g(gmcd6, j0, nonagonRequestParcel3);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                String s = parcel0.readString();
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 == null) {
                    j2 = null;
                }
                else {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    j2 = (iInterface4 instanceof com.google.android.gms.ads.internal.request.j) ? ((com.google.android.gms.ads.internal.request.j)iInterface4) : new com.google.android.gms.ads.internal.request.j(iBinder4);
                }
                e.gr(parcel0);
                if(((Boolean)r.a.d()).booleanValue()) {
                    com.google.android.gms.ads.nonagon.load.service.l l4 = new com.google.android.gms.ads.nonagon.load.service.l(this);
                    gmcd9 = this.c(s) == null ? gmbu.h(new Exception("URL to be removed not found for cache key: " + s)) : gmbu.i(l4);
                }
                else {
                    gmcd9 = gmbu.h(new Exception("Split request is disabled."));
                }
                this.g(gmcd9, j2, null);
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                DecagonRequestParcel decagonRequestParcel0 = (DecagonRequestParcel)wbz.a(parcel0, DecagonRequestParcel.CREATOR);
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    j0 = (iInterface5 instanceof com.google.android.gms.ads.internal.request.k) ? ((com.google.android.gms.ads.internal.request.k)iInterface5) : new com.google.android.gms.ads.internal.request.k(iBinder5);
                }
                e.gr(parcel0);
                if(((Boolean)com.google.android.gms.ads.internal.flag.w.a.d()).booleanValue()) {
                    gmbu.t(((abbm)this.d).d().b(decagonRequestParcel0.a), new com.google.android.gms.ads.nonagon.load.service.k(this, ((com.google.android.gms.ads.internal.request.k)j0), decagonRequestParcel0), com.google.android.gms.ads.internal.util.future.e.d);
                }
                else {
                    try {
                        ((com.google.android.gms.ads.internal.request.k)j0).a("", decagonRequestParcel0);
                    }
                    catch(RemoteException unused_ex) {
                    }
                }
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }

    private final void g(gmcd gmcd0, com.google.android.gms.ads.internal.request.j j0, NonagonRequestParcel nonagonRequestParcel0) {
        gmbu.t(glzd.g(gmcd0, new com.google.android.gms.ads.nonagon.load.service.i(), com.google.android.gms.ads.internal.util.future.e.a), new m(this, nonagonRequestParcel0, j0), com.google.android.gms.ads.internal.util.future.e.d);
    }
}

