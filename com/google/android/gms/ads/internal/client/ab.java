package com.google.android.gms.ads.internal.client;

import abaa;
import abat;
import android.os.IInterface;
import android.os.Parcel;
import com.google.ads.mediation.b;
import wby;
import wbz;

public final class ab extends wby implements IInterface {
    private final abaa a;
    private final Object b;

    public ab() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    public ab(abaa abaa0, Object object0) {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
        this.a = abaa0;
        this.b = object0;
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                abaa abaa0 = this.a;
                if(abaa0 != null) {
                    Object object0 = this.b;
                    if(object0 != null) {
                        ((b)abaa0).a.mInterstitialAd = (com.google.android.gms.ads.interstitial.b)object0;
                        ((b)abaa0).a.mInterstitialAd.b(new abat(((b)abaa0).b));
                        ((b)abaa0).b.l();
                    }
                }
                break;
            }
            case 2: {
                AdErrorParcel adErrorParcel0 = (AdErrorParcel)wbz.a(parcel0, AdErrorParcel.CREATOR);
                ab.gr(parcel0);
                abaa abaa1 = this.a;
                if(abaa1 != null) {
                    abaa1.a(adErrorParcel0.b());
                }
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

