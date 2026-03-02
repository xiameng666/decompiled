package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.Parcel;
import wby;
import wbz;

public final class bg extends wby implements IInterface {
    public bg() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                AdValueParcel adValueParcel0 = (AdValueParcel)wbz.a(parcel0, AdValueParcel.CREATOR);
                bg.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                parcel1.writeNoException();
                parcel1.writeInt(1);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

