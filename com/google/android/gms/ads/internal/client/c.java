package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baua;

public final class c implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        AdErrorParcel adErrorParcel0 = null;
        IBinder iBinder0 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 4: {
                    adErrorParcel0 = (AdErrorParcel)baua.m(parcel0, v2, AdErrorParcel.CREATOR);
                    break;
                }
                case 5: {
                    iBinder0 = baua.k(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new AdErrorParcel(v1, s, s1, adErrorParcel0, iBinder0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AdErrorParcel[v];
    }
}

