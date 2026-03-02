package com.google.android.gms.ads.internal.consent;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import wby;
import wbz;

public abstract class b extends wby implements c {
    public b() {
        super("com.google.android.gms.ads.internal.consent.IConsentSdkService");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        a a0;
        if(v == 3) {
            parcel0.readString();
            Bundle bundle0 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
            IBinder iBinder0 = parcel0.readStrongBinder();
            if(iBinder0 == null) {
                a0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.consent.IConsentCallback");
                a0 = (iInterface0 instanceof a) ? ((a)iInterface0) : new a(iBinder0);
            }
            b.gr(parcel0);
            this.a(a0);
            return true;
        }
        return false;
    }
}

