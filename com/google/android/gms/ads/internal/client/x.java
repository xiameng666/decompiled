package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.Parcel;
import wby;

public final class x extends wby implements IInterface {
    private final a a;

    public x() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    public x(a a0) {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
        this.a = a0;
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            this.a.a();
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

