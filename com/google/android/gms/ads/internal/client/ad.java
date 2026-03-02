package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.ads.internal.util.client.f;
import com.google.android.gms.ads.internal.util.client.h;
import j..util.Objects;
import wby;
import wbz;

public final class ad extends wby implements ae {
    final ag a;

    public ad() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    public ad(ag ag0) {
        Objects.requireNonNull(ag0);
        this.a = ag0;
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override  // com.google.android.gms.ads.internal.client.ae
    public final void a(AdRequestParcel adRequestParcel0) {
        this.c();
    }

    public final void c() {
        h.f("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        bt bt0 = new bt(this);
        f.a.post(bt0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                AdRequestParcel adRequestParcel0 = (AdRequestParcel)wbz.a(parcel0, AdRequestParcel.CREATOR);
                ad.gr(parcel0);
                this.c();
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                parcel1.writeNoException();
                parcel1.writeString(null);
                return true;
            }
            case 3: {
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 4: {
                parcel1.writeNoException();
                parcel1.writeString(null);
                return true;
            }
            case 5: {
                AdRequestParcel adRequestParcel1 = (AdRequestParcel)wbz.a(parcel0, AdRequestParcel.CREATOR);
                parcel0.readInt();
                ad.gr(parcel0);
                this.c();
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

