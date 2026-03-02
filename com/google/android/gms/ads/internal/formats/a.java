package com.google.android.gms.ads.internal.formats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baua;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;

public final class a implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        boolean z = false;
        int v2 = 0;
        boolean z1 = false;
        int v3 = 0;
        boolean z2 = false;
        int v4 = 0;
        int v5 = 0;
        boolean z3 = false;
        int v6 = 0;
        VideoOptionsParcel videoOptionsParcel0 = null;
        while(parcel0.dataPosition() < v) {
            int v7 = parcel0.readInt();
            switch(((char)v7)) {
                case 1: {
                    v1 = baua.f(parcel0, v7);
                    break;
                }
                case 2: {
                    z = baua.D(parcel0, v7);
                    break;
                }
                case 3: {
                    v2 = baua.f(parcel0, v7);
                    break;
                }
                case 4: {
                    z1 = baua.D(parcel0, v7);
                    break;
                }
                case 5: {
                    v3 = baua.f(parcel0, v7);
                    break;
                }
                case 6: {
                    videoOptionsParcel0 = (VideoOptionsParcel)baua.m(parcel0, v7, VideoOptionsParcel.CREATOR);
                    break;
                }
                case 7: {
                    z2 = baua.D(parcel0, v7);
                    break;
                }
                case 8: {
                    v4 = baua.f(parcel0, v7);
                    break;
                }
                case 9: {
                    v5 = baua.f(parcel0, v7);
                    break;
                }
                case 10: {
                    z3 = baua.D(parcel0, v7);
                    break;
                }
                case 11: {
                    v6 = baua.f(parcel0, v7);
                    break;
                }
                default: {
                    baua.C(parcel0, v7);
                }
            }
        }
        baua.A(parcel0, v);
        return new NativeAdOptionsParcel(v1, z, v2, z1, v3, videoOptionsParcel0, z2, v4, v5, z3, v6);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new NativeAdOptionsParcel[v];
    }
}

