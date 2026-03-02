package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import bjgw;
import com.google.android.gms.ads.internal.purchase.client.a;
import com.google.android.gms.ads.internal.purchase.client.e;
import com.google.android.gms.ads.internal.reward.client.d;
import com.google.android.gms.ads.internal.util.client.f;
import com.google.android.gms.ads.internal.util.client.h;
import wby;
import wbz;

public final class am extends wby implements an {
    public aa a;

    public am() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override  // com.google.android.gms.ads.internal.client.an
    public final AdSizeParcel a() {
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.an
    public final bk b() {
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.an
    public final bjgw c() {
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.an
    public final void d() {
    }

    @Override  // com.google.android.gms.ads.internal.client.an
    public final void e() {
    }

    @Override  // com.google.android.gms.ads.internal.client.an
    public final void f() {
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        aa aa0 = null;
        switch(v) {
            case 1: {
                parcel1.writeNoException();
                wbz.h(parcel1, null);
                return true;
            }
            case 2: {
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 4: {
                AdRequestParcel adRequestParcel0 = (AdRequestParcel)wbz.a(parcel0, AdRequestParcel.CREATOR);
                am.gr(parcel0);
                this.m(adRequestParcel0);
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 5: {
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    aa0 = (iInterface0 instanceof aa) ? ((aa)iInterface0) : new y(iBinder0);
                }
                am.gr(parcel0);
                this.a = aa0;
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    if((iInterface1 instanceof ax)) {
                        ax ax0 = (ax)iInterface1;
                    }
                }
                am.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                parcel1.writeNoException();
                return true;
            }
            case 10: {
                parcel1.writeNoException();
                return true;
            }
            case 11: {
                parcel1.writeNoException();
                return true;
            }
            case 12: {
                parcel1.writeNoException();
                wbz.g(parcel1, null);
                return true;
            }
            case 13: {
                AdSizeParcel adSizeParcel0 = (AdSizeParcel)wbz.a(parcel0, AdSizeParcel.CREATOR);
                am.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 14: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                    if((iInterface2 instanceof a)) {
                        a a0 = (a)iInterface2;
                    }
                }
                am.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 15: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    if((iInterface3 instanceof e)) {
                        e e0 = (e)iInterface3;
                    }
                }
                parcel0.readString();
                am.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 18: {
                parcel1.writeNoException();
                parcel1.writeString(null);
                return true;
            }
            case 19: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                    if((iInterface4 instanceof com.google.android.gms.ads.internal.customrenderedad.client.a)) {
                        com.google.android.gms.ads.internal.customrenderedad.client.a a1 = (com.google.android.gms.ads.internal.customrenderedad.client.a)iInterface4;
                    }
                }
                am.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 20: {
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    if((iInterface5 instanceof x)) {
                        x x0 = (x)iInterface5;
                    }
                }
                am.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 21: {
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if((iInterface6 instanceof az)) {
                        az az0 = (az)iInterface6;
                    }
                }
                am.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 22: {
                wbz.i(parcel0);
                am.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 23: {
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 24: {
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    if((iInterface7 instanceof d)) {
                        d d0 = (d)iInterface7;
                    }
                }
                am.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 25: {
                parcel0.readString();
                am.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 26: {
                parcel1.writeNoException();
                wbz.h(parcel1, null);
                return true;
            }
            case 29: {
                VideoOptionsParcel videoOptionsParcel0 = (VideoOptionsParcel)wbz.a(parcel0, VideoOptionsParcel.CREATOR);
                am.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 30: {
                IconAdOptionsParcel iconAdOptionsParcel0 = (IconAdOptionsParcel)wbz.a(parcel0, IconAdOptionsParcel.CREATOR);
                am.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 0x1F: {
                parcel1.writeNoException();
                parcel1.writeString(null);
                return true;
            }
            case 0x20: {
                parcel1.writeNoException();
                wbz.h(parcel1, null);
                return true;
            }
            case 33: {
                parcel1.writeNoException();
                wbz.h(parcel1, null);
                return true;
            }
            case 34: {
                wbz.i(parcel0);
                am.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 35: {
                parcel1.writeNoException();
                parcel1.writeString(null);
                return true;
            }
            case 36: {
                IBinder iBinder8 = parcel0.readStrongBinder();
                if(iBinder8 != null) {
                    IInterface iInterface8 = iBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    if((iInterface8 instanceof ar)) {
                        ar ar0 = (ar)iInterface8;
                    }
                }
                am.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 37: {
                Bundle bundle0 = new Bundle();
                parcel1.writeNoException();
                wbz.g(parcel1, bundle0);
                return true;
            }
            case 38: {
                parcel0.readString();
                am.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 39: {
                AppOpenAdOptionsParcel appOpenAdOptionsParcel0 = (AppOpenAdOptionsParcel)wbz.a(parcel0, AppOpenAdOptionsParcel.CREATOR);
                am.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 40: {
                IBinder iBinder9 = parcel0.readStrongBinder();
                if(iBinder9 != null) {
                    IInterface iInterface9 = iBinder9.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
                    if((iInterface9 instanceof com.google.android.gms.ads.internal.appopen.client.a)) {
                        com.google.android.gms.ads.internal.appopen.client.a a2 = (com.google.android.gms.ads.internal.appopen.client.a)iInterface9;
                    }
                }
                am.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 41: {
                parcel1.writeNoException();
                wbz.h(parcel1, null);
                return true;
            }
            case 42: {
                IBinder iBinder10 = parcel0.readStrongBinder();
                if(iBinder10 != null) {
                    IInterface iInterface10 = iBinder10.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    if((iInterface10 instanceof bg)) {
                        bg bg0 = (bg)iInterface10;
                    }
                }
                am.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 43: {
                AdRequestParcel adRequestParcel1 = (AdRequestParcel)wbz.a(parcel0, AdRequestParcel.CREATOR);
                IBinder iBinder11 = parcel0.readStrongBinder();
                if(iBinder11 != null) {
                    IInterface iInterface11 = iBinder11.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    if((iInterface11 instanceof ab)) {
                        ab ab0 = (ab)iInterface11;
                    }
                }
                am.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 44: {
                IBinder iBinder12 = parcel0.readStrongBinder();
                if(iBinder12 != null) {
                    IInterface iInterface12 = iBinder12.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if((iInterface12 instanceof bjgw)) {
                        bjgw bjgw0 = (bjgw)iInterface12;
                    }
                }
                am.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 45: {
                IBinder iBinder13 = parcel0.readStrongBinder();
                if(iBinder13 != null) {
                    IInterface iInterface13 = iBinder13.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    if((iInterface13 instanceof ba)) {
                        ba ba0 = (ba)iInterface13;
                    }
                }
                am.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 46: {
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 0x2F: {
                parcel1.writeNoException();
                parcel1.writeLong(0L);
                return true;
            }
            case 0x30: {
                parcel0.readLong();
                am.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.an
    public final void g(aa aa0) {
        this.a = aa0;
    }

    @Override  // com.google.android.gms.ads.internal.client.an
    public final void h(AdSizeParcel adSizeParcel0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.an
    public final void i(ax ax0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.an
    public final void j(boolean z) {
    }

    @Override  // com.google.android.gms.ads.internal.client.an
    public final void k(long v) {
    }

    @Override  // com.google.android.gms.ads.internal.client.an
    public final void l(bjgw bjgw0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.an
    public final void m(AdRequestParcel adRequestParcel0) {
        h.f("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        bu bu0 = new bu(this);
        f.a.post(bu0);
    }

    @Override  // com.google.android.gms.ads.internal.client.an
    public final void n() {
    }

    @Override  // com.google.android.gms.ads.internal.client.an
    public final void o(AdRequestParcel adRequestParcel0, ab ab0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.an
    public final void p(x x0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.an
    public final void q(ba ba0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.an
    public final void v(bg bg0) {
    }
}

