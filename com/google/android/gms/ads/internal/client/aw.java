package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.ads.mediation.a;
import wby;

public final class aw extends wby implements ax {
    private final a a;

    public aw() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public aw(a a0) {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
        this.a = a0;
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            String s = parcel0.readString();
            String s1 = parcel0.readString();
            aw.gr(parcel0);
            this.a.a.q(s, s1);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

