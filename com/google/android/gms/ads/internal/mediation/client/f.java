package com.google.android.gms.ads.internal.mediation.client;

import aazy;
import abag;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import bjgu;
import bjgw;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.config.s;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.initialization.MediationConfigurationParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.a;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.ads.mediation.c;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.ads.mediation.g;
import com.google.android.gms.ads.mediation.o;
import com.google.android.gms.dynamic.ObjectWrapper;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import wby;
import wbz;

public final class f extends wby implements IInterface {
    private final Object a;
    private m b;
    private bjgw c;
    private a d;

    public f() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public f(com.google.android.gms.ads.mediation.a a0) {
        this.a = a0;
    }

    public f(c c0) {
        this.a = c0;
    }

    public final void a(bjgw bjgw0, AdSizeParcel adSizeParcel0, AdRequestParcel adRequestParcel0, String s, String s1, i i0) {
        abag abag1;
        Object object0 = this.a;
        if(!(object0 instanceof d) && !(object0 instanceof com.google.android.gms.ads.mediation.a)) {
            String s2 = object0.getClass().getCanonicalName();
            h.k((d.class.getCanonicalName() + " or " + com.google.android.gms.ads.mediation.a.class.getCanonicalName() + " #009 Class mismatch: " + s2));
            throw new RemoteException();
        }
        h.d("Requesting banner ad from adapter.");
        if(adSizeParcel0.n) {
            abag abag0 = new abag(adSizeParcel0.e, adSizeParcel0.b);
            abag0.f = true;
            abag0.g = adSizeParcel0.b;
            abag1 = abag0;
        }
        else {
            abag1 = new abag(adSizeParcel0.e, adSizeParcel0.b, adSizeParcel0.a);
        }
        HashSet hashSet0 = null;
        if((object0 instanceof d)) {
            try {
                List list0 = adRequestParcel0.e;
                if(list0 != null) {
                    hashSet0 = new HashSet(list0);
                }
                long v = adRequestParcel0.b;
                if(v != -1L) {
                    new Date(v);
                }
                boolean z = f.i(adRequestParcel0);
                f.j(s, adRequestParcel0);
                l l0 = new l(hashSet0, z, adRequestParcel0.g, adRequestParcel0.r);
                String s3 = ((d)object0).getClass().getName();
                Bundle bundle0 = adRequestParcel0.m.getBundle(s3);
                ((d)object0).requestBannerAd(((Context)ObjectWrapper.a(bjgw0)), new m(i0), this.g(s, adRequestParcel0, s1), abag1, l0, bundle0);
                return;
            }
            catch(Throwable throwable0) {
                h.g(throwable0);
                b.a(bjgw0, throwable0, "adapter.requestBannerAd");
                throw new RemoteException();
            }
        }
        Object object1 = this.a;
        if(!(object1 instanceof com.google.android.gms.ads.mediation.a)) {
            return;
        }
        try {
            com.google.android.gms.ads.mediation.a a0 = (com.google.android.gms.ads.mediation.a)object1;
            Objects.requireNonNull(this);
            Context context0 = (Context)ObjectWrapper.a(bjgw0);
            this.g(s, adRequestParcel0, s1);
            this.h(adRequestParcel0);
            f.i(adRequestParcel0);
            f.j(s, adRequestParcel0);
            throw null;
        }
        catch(Throwable throwable1) {
            h.g(throwable1);
            b.a(bjgw0, throwable1, "adapter.loadBannerAd");
            throw new RemoteException();
        }
    }

    public final void c(bjgw bjgw0, AdRequestParcel adRequestParcel0, String s, String s1, i i0) {
        Object object0 = this.a;
        if(!(object0 instanceof g) && !(object0 instanceof com.google.android.gms.ads.mediation.a)) {
            String s2 = object0.getClass().getCanonicalName();
            h.k((g.class.getCanonicalName() + " or " + com.google.android.gms.ads.mediation.a.class.getCanonicalName() + " #009 Class mismatch: " + s2));
            throw new RemoteException();
        }
        h.d("Requesting interstitial ad from adapter.");
        HashSet hashSet0 = null;
        if((object0 instanceof g)) {
            try {
                List list0 = adRequestParcel0.e;
                if(list0 != null) {
                    hashSet0 = new HashSet(list0);
                }
                long v = adRequestParcel0.b;
                if(v != -1L) {
                    new Date(v);
                }
                boolean z = f.i(adRequestParcel0);
                f.j(s, adRequestParcel0);
                l l0 = new l(hashSet0, z, adRequestParcel0.g, adRequestParcel0.r);
                String s3 = ((g)object0).getClass().getName();
                Bundle bundle0 = adRequestParcel0.m.getBundle(s3);
                ((g)object0).requestInterstitialAd(((Context)ObjectWrapper.a(bjgw0)), new m(i0), this.g(s, adRequestParcel0, s1), l0, bundle0);
                return;
            }
            catch(Throwable throwable0) {
                h.g(throwable0);
                b.a(bjgw0, throwable0, "adapter.requestInterstitialAd");
                throw new RemoteException();
            }
        }
        Object object1 = this.a;
        if(!(object1 instanceof com.google.android.gms.ads.mediation.a)) {
            return;
        }
        try {
            com.google.android.gms.ads.mediation.a a0 = (com.google.android.gms.ads.mediation.a)object1;
            Objects.requireNonNull(this);
            Context context0 = (Context)ObjectWrapper.a(bjgw0);
            this.g(s, adRequestParcel0, s1);
            this.h(adRequestParcel0);
            f.i(adRequestParcel0);
            f.j(s, adRequestParcel0);
            throw null;
        }
        catch(Throwable throwable1) {
            h.g(throwable1);
            b.a(bjgw0, throwable1, "adapter.loadInterstitialAd");
            throw new RemoteException();
        }
    }

    public final void d() {
        Object object0 = this.a;
        if((object0 instanceof g)) {
            h.d("Showing interstitial from adapter.");
            try {
                ((g)object0).showInterstitial();
                return;
            }
            catch(Throwable throwable0) {
                h.g(throwable0);
                throw new RemoteException();
            }
        }
        h.k(b.b(object0, g.class));
        throw new RemoteException();
    }

    public final void e(AdRequestParcel adRequestParcel0, String s) {
        Object object0 = this.a;
        if((object0 instanceof com.google.android.gms.ads.mediation.a)) {
            bjgw bjgw0 = this.c;
            new com.google.android.gms.ads.internal.mediation.client.h(((com.google.android.gms.ads.mediation.a)object0), this.d);
            this.f(bjgw0, adRequestParcel0, s);
            return;
        }
        h.k(b.b(object0, com.google.android.gms.ads.mediation.a.class));
        throw new RemoteException();
    }

    public final void f(bjgw bjgw0, AdRequestParcel adRequestParcel0, String s) {
        Object object0 = this.a;
        if(!(object0 instanceof com.google.android.gms.ads.mediation.a)) {
            h.k(b.b(object0, com.google.android.gms.ads.mediation.a.class));
            throw new RemoteException();
        }
        h.d("Requesting rewarded ad from adapter.");
        try {
            com.google.android.gms.ads.mediation.a a0 = (com.google.android.gms.ads.mediation.a)object0;
            Objects.requireNonNull(this);
            Context context0 = (Context)ObjectWrapper.a(bjgw0);
            this.g(s, adRequestParcel0, null);
            this.h(adRequestParcel0);
            f.i(adRequestParcel0);
            f.j(s, adRequestParcel0);
            throw null;
        }
        catch(Exception exception0) {
            h.g(exception0);
            b.a(bjgw0, exception0, "adapter.loadRewardedAd");
            throw new RemoteException();
        }
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        bjgw bjgw15;
        bjgw bjgw13;
        bjgw bjgw12;
        aazy aazy0;
        bjgw bjgw11;
        i i0;
        bjgw bjgw8;
        bjgw bjgw7;
        bjgw bjgw5;
        bjgw bjgw4;
        bjgw bjgw2;
        ObjectWrapper objectWrapper0;
        bjgw bjgw0;
        int v1 = 0;
        a a0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    bjgw0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bjgw bjgw1 = (iInterface0 instanceof bjgw) ? ((bjgw)iInterface0) : new bjgu(iBinder0);
                    bjgw0 = bjgw1;
                }
                AdSizeParcel adSizeParcel0 = (AdSizeParcel)wbz.a(parcel0, AdSizeParcel.CREATOR);
                AdRequestParcel adRequestParcel0 = (AdRequestParcel)wbz.a(parcel0, AdRequestParcel.CREATOR);
                String s = parcel0.readString();
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    a0 = (iInterface1 instanceof i) ? ((i)iInterface1) : new com.google.android.gms.ads.internal.mediation.client.g(iBinder1);
                }
                f.gr(parcel0);
                this.a(bjgw0, adSizeParcel0, adRequestParcel0, s, null, ((i)a0));
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                Object object0 = this.a;
                if((object0 instanceof d)) {
                    try {
                        objectWrapper0 = new ObjectWrapper(((d)object0).getBannerView());
                        goto label_37;
                    }
                    catch(Throwable throwable0) {
                        h.g(throwable0);
                        throw new RemoteException();
                    }
                }
                if((object0 instanceof com.google.android.gms.ads.mediation.a)) {
                    objectWrapper0 = new ObjectWrapper(null);
                label_37:
                    parcel1.writeNoException();
                    wbz.h(parcel1, objectWrapper0);
                    return true;
                }
                String s1 = object0.getClass().getCanonicalName();
                h.k((d.class.getCanonicalName() + " or " + com.google.android.gms.ads.mediation.a.class.getCanonicalName() + " #009 Class mismatch: " + s1));
                throw new RemoteException();
            }
            case 3: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 == null) {
                    bjgw2 = null;
                }
                else {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bjgw bjgw3 = (iInterface2 instanceof bjgw) ? ((bjgw)iInterface2) : new bjgu(iBinder2);
                    bjgw2 = bjgw3;
                }
                AdRequestParcel adRequestParcel1 = (AdRequestParcel)wbz.a(parcel0, AdRequestParcel.CREATOR);
                String s2 = parcel0.readString();
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    a0 = (iInterface3 instanceof i) ? ((i)iInterface3) : new com.google.android.gms.ads.internal.mediation.client.g(iBinder3);
                }
                f.gr(parcel0);
                this.c(bjgw2, adRequestParcel1, s2, null, ((i)a0));
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                this.d();
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                Object object1 = this.a;
                if((object1 instanceof c)) {
                    try {
                        ((c)object1).onDestroy();
                    }
                    catch(Throwable throwable1) {
                        h.g(throwable1);
                        throw new RemoteException();
                    }
                }
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 == null) {
                    bjgw4 = null;
                }
                else {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bjgw4 = (iInterface4 instanceof bjgw) ? ((bjgw)iInterface4) : new bjgu(iBinder4);
                }
                AdSizeParcel adSizeParcel1 = (AdSizeParcel)wbz.a(parcel0, AdSizeParcel.CREATOR);
                AdRequestParcel adRequestParcel2 = (AdRequestParcel)wbz.a(parcel0, AdRequestParcel.CREATOR);
                String s3 = parcel0.readString();
                String s4 = parcel0.readString();
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    a0 = (iInterface5 instanceof i) ? ((i)iInterface5) : new com.google.android.gms.ads.internal.mediation.client.g(iBinder5);
                }
                f.gr(parcel0);
                this.a(bjgw4, adSizeParcel1, adRequestParcel2, s3, s4, ((i)a0));
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 == null) {
                    bjgw5 = null;
                }
                else {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bjgw bjgw6 = (iInterface6 instanceof bjgw) ? ((bjgw)iInterface6) : new bjgu(iBinder6);
                    bjgw5 = bjgw6;
                }
                AdRequestParcel adRequestParcel3 = (AdRequestParcel)wbz.a(parcel0, AdRequestParcel.CREATOR);
                String s5 = parcel0.readString();
                String s6 = parcel0.readString();
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    a0 = (iInterface7 instanceof i) ? ((i)iInterface7) : new com.google.android.gms.ads.internal.mediation.client.g(iBinder7);
                }
                f.gr(parcel0);
                this.c(bjgw5, adRequestParcel3, s5, s6, ((i)a0));
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                Object object2 = this.a;
                if((object2 instanceof c)) {
                    try {
                        ((c)object2).onPause();
                    }
                    catch(Throwable throwable2) {
                        h.g(throwable2);
                        throw new RemoteException();
                    }
                }
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                Object object3 = this.a;
                if((object3 instanceof c)) {
                    try {
                        ((c)object3).onResume();
                    }
                    catch(Throwable throwable3) {
                        h.g(throwable3);
                        throw new RemoteException();
                    }
                }
                parcel1.writeNoException();
                return true;
            }
            case 10: {
                IBinder iBinder8 = parcel0.readStrongBinder();
                if(iBinder8 == null) {
                    bjgw7 = null;
                }
                else {
                    IInterface iInterface8 = iBinder8.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bjgw7 = (iInterface8 instanceof bjgw) ? ((bjgw)iInterface8) : new bjgu(iBinder8);
                }
                AdRequestParcel adRequestParcel4 = (AdRequestParcel)wbz.a(parcel0, AdRequestParcel.CREATOR);
                parcel0.readString();
                IBinder iBinder9 = parcel0.readStrongBinder();
                if(iBinder9 != null) {
                    IInterface iInterface9 = iBinder9.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    a0 = (iInterface9 instanceof a) ? ((a)iInterface9) : new a(iBinder9);
                }
                parcel0.readString();
                f.gr(parcel0);
                Object object4 = this.a;
                if(!(object4 instanceof com.google.android.gms.ads.mediation.a) && !Objects.equals(object4.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
                    h.k(b.b(object4, com.google.android.gms.ads.mediation.a.class));
                    throw new RemoteException();
                }
                this.c = bjgw7;
                this.d = a0;
                ObjectWrapper objectWrapper1 = new ObjectWrapper(object4);
                Parcel parcel2 = a0.jo();
                wbz.h(parcel2, objectWrapper1);
                a0.jp(1, parcel2);
                parcel1.writeNoException();
                return true;
            }
            case 11: {
                AdRequestParcel adRequestParcel5 = (AdRequestParcel)wbz.a(parcel0, AdRequestParcel.CREATOR);
                String s7 = parcel0.readString();
                f.gr(parcel0);
                this.e(adRequestParcel5, s7);
                parcel1.writeNoException();
                return true;
            }
            case 12: {
                Object object5 = this.a;
                if(!(object5 instanceof com.google.android.gms.ads.mediation.a)) {
                    h.k(b.b(object5, com.google.android.gms.ads.mediation.a.class));
                    throw new RemoteException();
                }
                h.f("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
            case 13: {
                Object object6 = this.a;
                if(!(object6 instanceof com.google.android.gms.ads.mediation.a) && !Objects.equals(object6.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
                    h.k(b.b(object6, com.google.android.gms.ads.mediation.a.class));
                    throw new RemoteException();
                }
                if(this.d != null) {
                    v1 = 1;
                }
                parcel1.writeNoException();
                parcel1.writeInt(v1);
                return true;
            }
            case 14: {
                IBinder iBinder10 = parcel0.readStrongBinder();
                if(iBinder10 == null) {
                    bjgw8 = null;
                }
                else {
                    IInterface iInterface10 = iBinder10.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bjgw8 = (iInterface10 instanceof bjgw) ? ((bjgw)iInterface10) : new bjgu(iBinder10);
                }
                AdRequestParcel adRequestParcel6 = (AdRequestParcel)wbz.a(parcel0, AdRequestParcel.CREATOR);
                String s8 = parcel0.readString();
                String s9 = parcel0.readString();
                IBinder iBinder11 = parcel0.readStrongBinder();
                if(iBinder11 == null) {
                    i0 = null;
                }
                else {
                    IInterface iInterface11 = iBinder11.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    i0 = (iInterface11 instanceof i) ? ((i)iInterface11) : new com.google.android.gms.ads.internal.mediation.client.g(iBinder11);
                }
                NativeAdOptionsParcel nativeAdOptionsParcel0 = (NativeAdOptionsParcel)wbz.a(parcel0, NativeAdOptionsParcel.CREATOR);
                ArrayList arrayList0 = parcel0.createStringArrayList();
                f.gr(parcel0);
                Object object7 = this.a;
                if(!(object7 instanceof com.google.android.gms.ads.mediation.i) && !(object7 instanceof com.google.android.gms.ads.mediation.a)) {
                    String s10 = object7.getClass().getCanonicalName();
                    h.k((com.google.android.gms.ads.mediation.i.class.getCanonicalName() + " or " + com.google.android.gms.ads.mediation.a.class.getCanonicalName() + " #009 Class mismatch: " + s10));
                    throw new RemoteException();
                }
                h.d("Requesting native ad from adapter.");
                if((object7 instanceof com.google.android.gms.ads.mediation.i)) {
                    try {
                        List list0 = adRequestParcel6.e;
                        if(list0 != null) {
                            a0 = new HashSet(list0);
                        }
                        long v2 = adRequestParcel6.b;
                        if(v2 != -1L) {
                            new Date(v2);
                        }
                        boolean z = f.i(adRequestParcel6);
                        f.j(s8, adRequestParcel6);
                        n n0 = new n(((Set)a0), z, adRequestParcel6.g, nativeAdOptionsParcel0, arrayList0, adRequestParcel6.r);
                        String s11 = ((com.google.android.gms.ads.mediation.i)object7).getClass().getName();
                        Bundle bundle0 = adRequestParcel6.m.getBundle(s11);
                        this.b = new m(i0);
                        ((com.google.android.gms.ads.mediation.i)object7).requestNativeAd(((Context)ObjectWrapper.a(bjgw8)), this.b, this.g(s8, adRequestParcel6, s9), n0, bundle0);
                        goto label_245;
                    }
                    catch(Throwable throwable4) {
                        h.g(throwable4);
                        b.a(bjgw8, throwable4, "adapter.requestNativeAd");
                        throw new RemoteException();
                    }
                }
                Object object8 = this.a;
                if(!(object8 instanceof com.google.android.gms.ads.mediation.a)) {
                label_245:
                    parcel1.writeNoException();
                    return true;
                }
                try {
                    com.google.android.gms.ads.mediation.a a1 = (com.google.android.gms.ads.mediation.a)object8;
                    Objects.requireNonNull(this);
                    Context context0 = (Context)ObjectWrapper.a(bjgw8);
                    this.g(s8, adRequestParcel6, s9);
                    this.h(adRequestParcel6);
                    f.i(adRequestParcel6);
                    f.j(s8, adRequestParcel6);
                    throw null;
                }
                catch(Throwable throwable5) {
                    h.g(throwable5);
                    b.a(bjgw8, throwable5, "adapter.loadNativeAdMapper");
                    String s12 = throwable5.getMessage();
                    if(!TextUtils.isEmpty(s12) && s12.equals("Method is not found")) {
                        try {
                            com.google.android.gms.ads.mediation.a a2 = (com.google.android.gms.ads.mediation.a)this.a;
                            Objects.requireNonNull(this);
                            Context context1 = (Context)ObjectWrapper.a(bjgw8);
                            this.g(s8, adRequestParcel6, s9);
                            this.h(adRequestParcel6);
                            f.i(adRequestParcel6);
                            f.j(s8, adRequestParcel6);
                            throw null;
                        }
                        catch(Throwable throwable6) {
                            h.g(throwable6);
                            b.a(bjgw8, throwable6, "adapter.loadNativeAd");
                            throw new RemoteException();
                        }
                    }
                    throw new RemoteException();
                }
            }
            case 15: {
                parcel1.writeNoException();
                wbz.h(parcel1, null);
                return true;
            }
            case 16: {
                parcel1.writeNoException();
                wbz.h(parcel1, null);
                return true;
            }
            case 17: {
                Bundle bundle1 = new Bundle();
                parcel1.writeNoException();
                wbz.g(parcel1, bundle1);
                return true;
            }
            case 18: {
                Bundle bundle2 = new Bundle();
                parcel1.writeNoException();
                wbz.g(parcel1, bundle2);
                return true;
            }
            case 19: {
                Bundle bundle3 = new Bundle();
                parcel1.writeNoException();
                wbz.g(parcel1, bundle3);
                return true;
            }
            case 20: {
                AdRequestParcel adRequestParcel7 = (AdRequestParcel)wbz.a(parcel0, AdRequestParcel.CREATOR);
                String s13 = parcel0.readString();
                parcel0.readString();
                f.gr(parcel0);
                this.e(adRequestParcel7, s13);
                parcel1.writeNoException();
                return true;
            }
            case 21: {
                IBinder iBinder12 = parcel0.readStrongBinder();
                if(iBinder12 != null) {
                    IInterface iInterface12 = iBinder12.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    a0 = (iInterface12 instanceof bjgw) ? ((bjgw)iInterface12) : new bjgu(iBinder12);
                }
                f.gr(parcel0);
                Context context2 = (Context)ObjectWrapper.a(((bjgw)a0));
                Object object9 = this.a;
                if((object9 instanceof com.google.android.gms.ads.mediation.l)) {
                    ((com.google.android.gms.ads.mediation.l)object9).a();
                }
                parcel1.writeNoException();
                return true;
            }
            case 22: {
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 23: {
                IBinder iBinder13 = parcel0.readStrongBinder();
                if(iBinder13 != null) {
                    IInterface iInterface13 = iBinder13.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if((iInterface13 instanceof bjgw)) {
                        bjgw bjgw9 = (bjgw)iInterface13;
                    }
                }
                IBinder iBinder14 = parcel0.readStrongBinder();
                if(iBinder14 != null) {
                    IInterface iInterface14 = iBinder14.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    if((iInterface14 instanceof a)) {
                        a a3 = (a)iInterface14;
                    }
                }
                parcel0.createStringArrayList();
                f.gr(parcel0);
                h.k("Could not initialize rewarded video adapter.");
                throw new RemoteException();
            }
            case 24: {
                m m0 = this.b;
                if(m0 != null) {
                    com.google.android.gms.ads.internal.formats.client.m m1 = m0.b;
                    if((m1 instanceof com.google.android.gms.ads.internal.formats.client.m)) {
                        a0 = m1.a;
                    }
                }
                parcel1.writeNoException();
                wbz.h(parcel1, a0);
                return true;
            }
            case 25: {
                boolean z1 = wbz.i(parcel0);
                f.gr(parcel0);
                Object object10 = this.a;
                if((object10 instanceof com.google.android.gms.ads.mediation.m)) {
                    try {
                        ((com.google.android.gms.ads.mediation.m)object10).onImmersiveModeUpdated(z1);
                    }
                    catch(Throwable throwable7) {
                        h.g(throwable7);
                    }
                }
                else {
                    h.d(b.b(object10, com.google.android.gms.ads.mediation.m.class));
                }
                parcel1.writeNoException();
                return true;
            }
            case 26: {
                Object object11 = this.a;
                if((object11 instanceof o)) {
                    try {
                        a0 = ((o)object11).getVideoController();
                    }
                    catch(Throwable throwable8) {
                        h.g(throwable8);
                    }
                }
                parcel1.writeNoException();
                wbz.h(parcel1, a0);
                return true;
            }
            case 27: {
                if((this.a instanceof com.google.android.gms.ads.mediation.i)) {
                    m m2 = this.b;
                    if(m2 != null) {
                        com.google.android.gms.ads.mediation.n n1 = m2.a;
                        if(n1 != null) {
                            a0 = new k(n1);
                        }
                    }
                }
                parcel1.writeNoException();
                wbz.h(parcel1, a0);
                return true;
            }
            case 28: {
                IBinder iBinder15 = parcel0.readStrongBinder();
                if(iBinder15 != null) {
                    IInterface iInterface15 = iBinder15.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    a0 = (iInterface15 instanceof bjgw) ? ((bjgw)iInterface15) : new bjgu(iBinder15);
                }
                AdRequestParcel adRequestParcel8 = (AdRequestParcel)wbz.a(parcel0, AdRequestParcel.CREATOR);
                String s14 = parcel0.readString();
                IBinder iBinder16 = parcel0.readStrongBinder();
                if(iBinder16 != null) {
                    IInterface iInterface16 = iBinder16.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if((iInterface16 instanceof i)) {
                        i i1 = (i)iInterface16;
                    }
                }
                f.gr(parcel0);
                this.f(((bjgw)a0), adRequestParcel8, s14);
                parcel1.writeNoException();
                return true;
            }
            case 30: {
                IBinder iBinder17 = parcel0.readStrongBinder();
                if(iBinder17 != null) {
                    IInterface iInterface17 = iBinder17.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if((iInterface17 instanceof bjgw)) {
                        bjgw bjgw10 = (bjgw)iInterface17;
                    }
                }
                f.gr(parcel0);
                Object object12 = this.a;
                if(!(object12 instanceof com.google.android.gms.ads.mediation.a)) {
                    h.k(b.b(object12, com.google.android.gms.ads.mediation.a.class));
                    throw new RemoteException();
                }
                h.d("Show rewarded ad from adapter.");
                h.f("Can not show null mediation rewarded ad.");
                throw new RemoteException();
            }
            case 0x1F: {
                IBinder iBinder18 = parcel0.readStrongBinder();
                if(iBinder18 == null) {
                    bjgw11 = null;
                }
                else {
                    IInterface iInterface18 = iBinder18.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bjgw11 = (iInterface18 instanceof bjgw) ? ((bjgw)iInterface18) : new bjgu(iBinder18);
                }
                IBinder iBinder19 = parcel0.readStrongBinder();
                if(iBinder19 != null) {
                    IInterface iInterface19 = iBinder19.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
                    if((iInterface19 instanceof com.google.android.gms.ads.internal.initialization.a)) {
                        com.google.android.gms.ads.internal.initialization.a a4 = (com.google.android.gms.ads.internal.initialization.a)iInterface19;
                    }
                }
                ArrayList arrayList1 = parcel0.createTypedArrayList(MediationConfigurationParcel.CREATOR);
                f.gr(parcel0);
                Object object13 = this.a;
                if(!(object13 instanceof com.google.android.gms.ads.mediation.a)) {
                    throw new RemoteException();
                }
                Objects.requireNonNull(this);
                ArrayList arrayList2 = new ArrayList();
                for(Object object14: arrayList1) {
                    String s15 = ((MediationConfigurationParcel)object14).a;
                    switch(s15.hashCode()) {
                        case 0xACC57F2C: {
                            if(s15.equals("banner")) {
                                aazy0 = aazy.a;
                                goto label_447;
                            }
                            break;
                        }
                        case 0xC1425017: {
                            if(s15.equals("native")) {
                                aazy0 = aazy.e;
                                goto label_447;
                            }
                            break;
                        }
                        case 0xF1B84C0E: {
                            if(s15.equals("rewarded")) {
                                aazy0 = aazy.c;
                                goto label_447;
                            }
                            break;
                        }
                        case 604727084: {
                            if(s15.equals("interstitial")) {
                                aazy0 = aazy.b;
                                goto label_447;
                            }
                            break;
                        }
                        case 1167692200: {
                            if(s15.equals("app_open")) {
                                aazy0 = aazy.f;
                                goto label_447;
                            }
                            break;
                        }
                        case 0x69FE9E1A: {
                            if(s15.equals("app_open_ad") && ((Boolean)s.bT.g()).booleanValue()) {
                                aazy0 = aazy.f;
                                goto label_447;
                            }
                            break;
                        }
                        case 0x71EF0BBD: {
                            if(s15.equals("rewarded_interstitial")) {
                                aazy0 = aazy.d;
                                goto label_447;
                            }
                        }
                    }
                    aazy0 = null;
                label_447:
                    if(aazy0 != null) {
                        arrayList2.add(new com.google.android.gms.ads.mediation.f());
                    }
                }
                Context context3 = (Context)ObjectWrapper.a(bjgw11);
                ((com.google.android.gms.ads.mediation.a)object13).a();
                parcel1.writeNoException();
                return true;
            }
            case 0x20: {
                IBinder iBinder20 = parcel0.readStrongBinder();
                if(iBinder20 == null) {
                    bjgw12 = null;
                }
                else {
                    IInterface iInterface20 = iBinder20.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bjgw12 = (iInterface20 instanceof bjgw) ? ((bjgw)iInterface20) : new bjgu(iBinder20);
                }
                AdRequestParcel adRequestParcel9 = (AdRequestParcel)wbz.a(parcel0, AdRequestParcel.CREATOR);
                String s16 = parcel0.readString();
                IBinder iBinder21 = parcel0.readStrongBinder();
                if(iBinder21 != null) {
                    IInterface iInterface21 = iBinder21.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if((iInterface21 instanceof i)) {
                        i i2 = (i)iInterface21;
                    }
                }
                f.gr(parcel0);
                Object object15 = this.a;
                if(!(object15 instanceof com.google.android.gms.ads.mediation.a)) {
                    h.k(b.b(object15, com.google.android.gms.ads.mediation.a.class));
                    throw new RemoteException();
                }
                h.d("Requesting rewarded interstitial ad from adapter.");
                try {
                    com.google.android.gms.ads.mediation.a a5 = (com.google.android.gms.ads.mediation.a)object15;
                    Objects.requireNonNull(this);
                    Context context4 = (Context)ObjectWrapper.a(bjgw12);
                    this.g(s16, adRequestParcel9, null);
                    this.h(adRequestParcel9);
                    f.i(adRequestParcel9);
                    f.j(s16, adRequestParcel9);
                    throw null;
                }
                catch(Exception exception0) {
                    b.a(bjgw12, exception0, "adapter.loadRewardedInterstitialAd");
                    throw new RemoteException();
                }
            }
            case 33: {
                Object object16 = this.a;
                if(!(object16 instanceof com.google.android.gms.ads.mediation.a)) {
                    parcel1.writeNoException();
                    wbz.g(parcel1, null);
                    return true;
                }
                ((com.google.android.gms.ads.mediation.a)object16).c();
                throw null;
            }
            case 34: {
                Object object17 = this.a;
                if(!(object17 instanceof com.google.android.gms.ads.mediation.a)) {
                    parcel1.writeNoException();
                    wbz.g(parcel1, null);
                    return true;
                }
                ((com.google.android.gms.ads.mediation.a)object17).b();
                throw null;
            }
            case 35: {
                IBinder iBinder22 = parcel0.readStrongBinder();
                if(iBinder22 == null) {
                    bjgw13 = null;
                }
                else {
                    IInterface iInterface22 = iBinder22.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bjgw13 = (iInterface22 instanceof bjgw) ? ((bjgw)iInterface22) : new bjgu(iBinder22);
                }
                AdSizeParcel adSizeParcel2 = (AdSizeParcel)wbz.a(parcel0, AdSizeParcel.CREATOR);
                AdRequestParcel adRequestParcel10 = (AdRequestParcel)wbz.a(parcel0, AdRequestParcel.CREATOR);
                String s17 = parcel0.readString();
                String s18 = parcel0.readString();
                IBinder iBinder23 = parcel0.readStrongBinder();
                if(iBinder23 != null) {
                    IInterface iInterface23 = iBinder23.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if((iInterface23 instanceof i)) {
                        i i3 = (i)iInterface23;
                    }
                }
                f.gr(parcel0);
                Object object18 = this.a;
                if(!(object18 instanceof com.google.android.gms.ads.mediation.a)) {
                    h.k(b.b(object18, com.google.android.gms.ads.mediation.a.class));
                    throw new RemoteException();
                }
                h.d("Requesting interscroller ad from adapter.");
                try {
                    com.google.android.gms.ads.mediation.a a6 = (com.google.android.gms.ads.mediation.a)object18;
                    Objects.requireNonNull(this);
                    Context context5 = (Context)ObjectWrapper.a(bjgw13);
                    this.g(s17, adRequestParcel10, s18);
                    this.h(adRequestParcel10);
                    f.i(adRequestParcel10);
                    f.j(s17, adRequestParcel10);
                    abag abag0 = new abag(adSizeParcel2.e, adSizeParcel2.b);
                    abag0.h = true;
                    abag0.i = adSizeParcel2.b;
                    throw null;
                }
                catch(Exception exception1) {
                    h.g(exception1);
                    b.a(bjgw13, exception1, "adapter.loadInterscrollerAd");
                    throw new RemoteException();
                }
            }
            case 36: {
                parcel1.writeNoException();
                wbz.h(parcel1, null);
                return true;
            }
            case 37: {
                IBinder iBinder24 = parcel0.readStrongBinder();
                if(iBinder24 != null) {
                    IInterface iInterface24 = iBinder24.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if((iInterface24 instanceof bjgw)) {
                        bjgw bjgw14 = (bjgw)iInterface24;
                    }
                }
                f.gr(parcel0);
                Object object19 = this.a;
                if(!(object19 instanceof com.google.android.gms.ads.mediation.a) && !(object19 instanceof g)) {
                    String s19 = object19.getClass().getCanonicalName();
                    h.k((g.class.getCanonicalName() + " or " + com.google.android.gms.ads.mediation.a.class.getCanonicalName() + " #009 Class mismatch: " + s19));
                    throw new RemoteException();
                }
                if((object19 instanceof g)) {
                    this.d();
                    parcel1.writeNoException();
                    return true;
                }
                h.d("Show interstitial ad from adapter.");
                h.f("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
            case 38: {
                IBinder iBinder25 = parcel0.readStrongBinder();
                if(iBinder25 == null) {
                    bjgw15 = null;
                }
                else {
                    IInterface iInterface25 = iBinder25.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bjgw15 = (iInterface25 instanceof bjgw) ? ((bjgw)iInterface25) : new bjgu(iBinder25);
                }
                AdRequestParcel adRequestParcel11 = (AdRequestParcel)wbz.a(parcel0, AdRequestParcel.CREATOR);
                String s20 = parcel0.readString();
                IBinder iBinder26 = parcel0.readStrongBinder();
                if(iBinder26 != null) {
                    IInterface iInterface26 = iBinder26.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if((iInterface26 instanceof i)) {
                        i i4 = (i)iInterface26;
                    }
                }
                f.gr(parcel0);
                Object object20 = this.a;
                if(!(object20 instanceof com.google.android.gms.ads.mediation.a)) {
                    h.k(b.b(object20, com.google.android.gms.ads.mediation.a.class));
                    throw new RemoteException();
                }
                h.d("Requesting app open ad from adapter.");
                try {
                    com.google.android.gms.ads.mediation.a a7 = (com.google.android.gms.ads.mediation.a)object20;
                    Objects.requireNonNull(this);
                    Context context6 = (Context)ObjectWrapper.a(bjgw15);
                    this.g(s20, adRequestParcel11, null);
                    this.h(adRequestParcel11);
                    f.i(adRequestParcel11);
                    f.j(s20, adRequestParcel11);
                    throw null;
                }
                catch(Exception exception2) {
                    h.g(exception2);
                    b.a(bjgw15, exception2, "adapter.loadAppOpenAd");
                    throw new RemoteException();
                }
            }
            case 39: {
                IBinder iBinder27 = parcel0.readStrongBinder();
                if(iBinder27 != null) {
                    IInterface iInterface27 = iBinder27.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if((iInterface27 instanceof bjgw)) {
                        bjgw bjgw16 = (bjgw)iInterface27;
                    }
                }
                f.gr(parcel0);
                Object object21 = this.a;
                if(!(object21 instanceof com.google.android.gms.ads.mediation.a)) {
                    h.k(b.b(object21, com.google.android.gms.ads.mediation.a.class));
                    throw new RemoteException();
                }
                h.d("Show app open ad from adapter.");
                h.f("Can not show null mediation app open ad.");
                throw new RemoteException();
            }
            default: {
                return false;
            }
        }
    }

    private final Bundle g(String s, AdRequestParcel adRequestParcel0, String s1) {
        h.d(("Server parameters: " + s));
        try {
            Bundle bundle0 = new Bundle();
            if(s != null) {
                JSONObject jSONObject0 = new JSONObject(s);
                Bundle bundle1 = new Bundle();
                Iterator iterator0 = jSONObject0.keys();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    bundle1.putString(((String)object0), jSONObject0.getString(((String)object0)));
                }
                bundle0 = bundle1;
            }
            if((this.a instanceof AdMobAdapter)) {
                bundle0.putString("adJson", s1);
                if(adRequestParcel0 != null) {
                    bundle0.putInt("tagForChildDirectedTreatment", adRequestParcel0.g);
                }
            }
            bundle0.remove("max_ad_content_rating");
            return bundle0;
        }
        catch(Throwable throwable0) {
            h.g(throwable0);
            throw new RemoteException();
        }
    }

    private final void h(AdRequestParcel adRequestParcel0) {
        String s = this.a.getClass().getName();
        if(adRequestParcel0.m.getBundle(s) != null) {
            return;
        }
        new Bundle();
    }

    private static boolean i(AdRequestParcel adRequestParcel0) {
        return adRequestParcel0.f || com.google.android.gms.ads.internal.util.client.f.i();
    }

    private static void j(String s, AdRequestParcel adRequestParcel0) {
        try {
            new JSONObject(s).getString("max_ad_content_rating");
        }
        catch(JSONException unused_ex) {
        }
    }
}

