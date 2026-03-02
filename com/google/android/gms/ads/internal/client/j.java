package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baua;

public final class j implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        int v2 = 0;
        boolean z = false;
        int v3 = 0;
        int v4 = 0;
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        String s = null;
        AdSizeParcel[] arr_adSizeParcel = null;
        while(parcel0.dataPosition() < v) {
            int v5 = parcel0.readInt();
            switch(((char)v5)) {
                case 2: {
                    s = baua.s(parcel0, v5);
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v5);
                    break;
                }
                case 4: {
                    v2 = baua.f(parcel0, v5);
                    break;
                }
                case 5: {
                    z = baua.D(parcel0, v5);
                    break;
                }
                case 6: {
                    v3 = baua.f(parcel0, v5);
                    break;
                }
                case 7: {
                    v4 = baua.f(parcel0, v5);
                    break;
                }
                case 8: {
                    arr_adSizeParcel = (AdSizeParcel[])baua.J(parcel0, v5, AdSizeParcel.CREATOR);
                    break;
                }
                case 9: {
                    z1 = baua.D(parcel0, v5);
                    break;
                }
                case 10: {
                    z2 = baua.D(parcel0, v5);
                    break;
                }
                case 11: {
                    z3 = baua.D(parcel0, v5);
                    break;
                }
                case 12: {
                    z4 = baua.D(parcel0, v5);
                    break;
                }
                case 13: {
                    z5 = baua.D(parcel0, v5);
                    break;
                }
                case 14: {
                    z6 = baua.D(parcel0, v5);
                    break;
                }
                case 15: {
                    z7 = baua.D(parcel0, v5);
                    break;
                }
                case 16: {
                    z8 = baua.D(parcel0, v5);
                    break;
                }
                default: {
                    baua.C(parcel0, v5);
                }
            }
        }
        baua.A(parcel0, v);
        return new AdSizeParcel(s, v1, v2, z, v3, v4, arr_adSizeParcel, z1, z2, z3, z4, z5, z6, z7, z8);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AdSizeParcel[v];
    }
}

