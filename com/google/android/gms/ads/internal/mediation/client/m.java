package com.google.android.gms.ads.internal.mediation.client;

import aazx;
import abbq;
import android.os.Parcel;
import android.os.RemoteException;
import batl;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.AdErrorParcel;
import com.google.android.gms.ads.internal.client.bj;
import com.google.android.gms.ads.mediation.e;
import com.google.android.gms.ads.mediation.h;
import com.google.android.gms.ads.mediation.j;
import com.google.android.gms.ads.mediation.n;

public final class m implements e, h, j {
    public n a;
    public com.google.android.gms.ads.internal.formats.client.m b;
    private final i c;

    public m(i i0) {
        this.c = i0;
    }

    @Override  // com.google.android.gms.ads.mediation.j
    public final void a(com.google.android.gms.ads.mediation.i i0, n n0) {
        batl.h("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.h.d("Adapter called onAdLoaded.");
        this.a = n0;
        if(!(i0 instanceof AdMobAdapter)) {
            new abbq().b(new bj(null));
        }
        try {
            this.c.e();
        }
        catch(RemoteException remoteException0) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.e
    public final void b() {
        batl.h("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.h.d("Adapter called onAdClicked.");
        try {
            this.c.a();
        }
        catch(RemoteException remoteException0) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.j
    public final void c() {
        batl.h("#008 Must be called on the main UI thread.");
        n n0 = this.a;
        if(this.b == null) {
            if(n0 == null) {
                com.google.android.gms.ads.internal.util.client.h.n("#007 Could not call remote method.");
                return;
            }
            if(!n0.n) {
                com.google.android.gms.ads.internal.util.client.h.d("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.h.d("Adapter called onAdClicked.");
        try {
            this.c.a();
        }
        catch(RemoteException remoteException0) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.e
    public final void d() {
        batl.h("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.h.d("Adapter called onAdClosed.");
        try {
            this.c.b();
        }
        catch(RemoteException remoteException0) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.h
    public final void e() {
        batl.h("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.h.d("Adapter called onAdClosed.");
        try {
            this.c.b();
        }
        catch(RemoteException remoteException0) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.j
    public final void f() {
        batl.h("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.h.d("Adapter called onAdClosed.");
        try {
            this.c.b();
        }
        catch(RemoteException remoteException0) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.e
    public final void g(aazx aazx0) {
        batl.h("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.h.d(("Adapter called onAdFailedToLoad with error. ErrorCode: " + aazx0.a + ". ErrorMessage: " + aazx0.b + ". ErrorDomain: " + aazx0.c));
        try {
            AdErrorParcel adErrorParcel0 = aazx0.a();
            this.c.c(adErrorParcel0);
        }
        catch(RemoteException remoteException0) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.h
    public final void h(aazx aazx0) {
        batl.h("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.h.d(("Adapter called onAdFailedToLoad with error. ErrorCode: " + aazx0.a + ". ErrorMessage: " + aazx0.b + ". ErrorDomain: " + aazx0.c));
        try {
            AdErrorParcel adErrorParcel0 = aazx0.a();
            this.c.c(adErrorParcel0);
        }
        catch(RemoteException remoteException0) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.j
    public final void i(aazx aazx0) {
        batl.h("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.h.d(("Adapter called onAdFailedToLoad with error. ErrorCode: " + aazx0.a + ". ErrorMessage: " + aazx0.b + ". ErrorDomain: " + aazx0.c));
        try {
            AdErrorParcel adErrorParcel0 = aazx0.a();
            this.c.c(adErrorParcel0);
        }
        catch(RemoteException remoteException0) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.j
    public final void j() {
        batl.h("#008 Must be called on the main UI thread.");
        n n0 = this.a;
        if(this.b == null) {
            if(n0 == null) {
                com.google.android.gms.ads.internal.util.client.h.n("#007 Could not call remote method.");
                return;
            }
            if(!n0.m) {
                com.google.android.gms.ads.internal.util.client.h.d("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.h.d("Adapter called onAdImpression.");
        try {
            this.c.d();
        }
        catch(RemoteException remoteException0) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.e
    public final void k() {
        batl.h("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.h.d("Adapter called onAdLoaded.");
        try {
            this.c.e();
        }
        catch(RemoteException remoteException0) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.h
    public final void l() {
        batl.h("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.h.d("Adapter called onAdLoaded.");
        try {
            this.c.e();
        }
        catch(RemoteException remoteException0) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.j
    public final void m(com.google.android.gms.ads.internal.formats.client.m m0) {
        String s;
        batl.h("#008 Must be called on the main UI thread.");
        try {
            Parcel parcel0 = m0.a.jo();
            Parcel parcel1 = m0.a.hM(4, parcel0);
            s = parcel1.readString();
            parcel1.recycle();
        }
        catch(RemoteException remoteException0) {
            com.google.android.gms.ads.internal.util.client.h.g(remoteException0);
            s = null;
        }
        com.google.android.gms.ads.internal.util.client.h.d(("Adapter called onAdLoaded with template id " + s));
        this.b = m0;
        try {
            this.c.e();
        }
        catch(RemoteException remoteException1) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", remoteException1);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.e
    public final void n() {
        batl.h("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.h.d("Adapter called onAdOpened.");
        try {
            this.c.f();
        }
        catch(RemoteException remoteException0) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.h
    public final void o() {
        batl.h("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.h.d("Adapter called onAdOpened.");
        try {
            this.c.f();
        }
        catch(RemoteException remoteException0) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.j
    public final void p() {
        batl.h("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.h.d("Adapter called onAdOpened.");
        try {
            this.c.f();
        }
        catch(RemoteException remoteException0) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.e
    public final void q(String s, String s1) {
        batl.h("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.h.d("Adapter called onAppEvent.");
        try {
            this.c.g(s, s1);
        }
        catch(RemoteException remoteException0) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.j
    public final void r(com.google.android.gms.ads.internal.formats.client.m m0, String s) {
        try {
            this.c.h(m0.a, s);
        }
        catch(RemoteException remoteException0) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", remoteException0);
        }
    }
}

