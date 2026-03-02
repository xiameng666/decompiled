package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baua;

public final class l implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        AdErrorParcel adErrorParcel0 = null;
        Bundle bundle0 = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        long v1 = 0L;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 2: {
                    v1 = baua.i(parcel0, v2);
                    break;
                }
                case 3: {
                    adErrorParcel0 = (AdErrorParcel)baua.m(parcel0, v2, AdErrorParcel.CREATOR);
                    break;
                }
                case 4: {
                    bundle0 = baua.j(parcel0, v2);
                    break;
                }
                case 5: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 6: {
                    s2 = baua.s(parcel0, v2);
                    break;
                }
                case 7: {
                    s3 = baua.s(parcel0, v2);
                    break;
                }
                case 8: {
                    s4 = baua.s(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new AdapterResponseInfoParcel(s, v1, adErrorParcel0, bundle0, s1, s2, s3, s4);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AdapterResponseInfoParcel[v];
    }
}

