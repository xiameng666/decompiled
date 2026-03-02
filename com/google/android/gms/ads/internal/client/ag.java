package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.client.n;
import com.google.android.gms.ads.internal.formats.client.o;
import com.google.android.gms.ads.internal.formats.client.p;
import com.google.android.gms.ads.internal.formats.client.q;
import com.google.android.gms.ads.internal.formats.client.r;
import com.google.android.gms.ads.internal.formats.client.s;
import com.google.android.gms.ads.internal.instream.InstreamAdConfigurationParcel;
import com.google.android.gms.ads.internal.instream.client.a;
import wby;
import wbz;

public final class ag extends wby implements ah {
    public aa a;

    public ag() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override  // com.google.android.gms.ads.internal.client.ah
    public final ae a() {
        return new ad(this);
    }

    @Override  // com.google.android.gms.ads.internal.client.ah
    public final void b(aa aa0) {
        this.a = aa0;
    }

    @Override  // com.google.android.gms.ads.internal.client.ah
    public final void c(NativeAdOptionsParcel nativeAdOptionsParcel0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.ah
    public final void d(String s, q q0, p p0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.ah
    public final void e(s s0) {
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        aa aa0;
        switch(v) {
            case 1: {
                ad ad0 = new ad(this);
                parcel1.writeNoException();
                wbz.h(parcel1, ad0);
                return true;
            }
            case 2: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    aa0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    aa0 = (iInterface0 instanceof aa) ? ((aa)iInterface0) : new y(iBinder0);
                }
                ag.gr(parcel0);
                this.a = aa0;
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    if((iInterface1 instanceof n)) {
                        n n0 = (n)iInterface1;
                    }
                }
                ag.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    if((iInterface2 instanceof o)) {
                        o o0 = (o)iInterface2;
                    }
                }
                ag.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                parcel0.readString();
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    if((iInterface3 instanceof q)) {
                        q q0 = (q)iInterface3;
                    }
                }
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                    if((iInterface4 instanceof p)) {
                        p p0 = (p)iInterface4;
                    }
                }
                ag.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                NativeAdOptionsParcel nativeAdOptionsParcel0 = (NativeAdOptionsParcel)wbz.a(parcel0, NativeAdOptionsParcel.CREATOR);
                ag.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if((iInterface5 instanceof az)) {
                        az az0 = (az)iInterface5;
                    }
                }
                ag.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
                    if((iInterface6 instanceof r)) {
                        r r0 = (r)iInterface6;
                    }
                }
                AdSizeParcel adSizeParcel0 = (AdSizeParcel)wbz.a(parcel0, AdSizeParcel.CREATOR);
                ag.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                PublisherAdViewOptions publisherAdViewOptions0 = (PublisherAdViewOptions)wbz.a(parcel0, PublisherAdViewOptions.CREATOR);
                ag.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 10: {
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
                    if((iInterface7 instanceof s)) {
                        s s0 = (s)iInterface7;
                    }
                }
                ag.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 13: {
                InstreamAdConfigurationParcel instreamAdConfigurationParcel0 = (InstreamAdConfigurationParcel)wbz.a(parcel0, InstreamAdConfigurationParcel.CREATOR);
                ag.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 14: {
                IBinder iBinder8 = parcel0.readStrongBinder();
                if(iBinder8 != null) {
                    IInterface iInterface8 = iBinder8.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
                    if((iInterface8 instanceof a)) {
                        a a0 = (a)iInterface8;
                    }
                }
                ag.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 15: {
                AdManagerAdViewOptions adManagerAdViewOptions0 = (AdManagerAdViewOptions)wbz.a(parcel0, AdManagerAdViewOptions.CREATOR);
                ag.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

