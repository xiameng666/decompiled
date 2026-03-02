package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baua;
import java.util.List;

public final class g implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        long v1 = 0L;
        long v2 = 0L;
        long v3 = 0L;
        int v4 = 0;
        int v5 = 0;
        boolean z = false;
        int v6 = 0;
        boolean z1 = false;
        boolean z2 = false;
        int v7 = 0;
        int v8 = 0;
        int v9 = 0;
        Bundle bundle0 = null;
        List list0 = null;
        String s = null;
        SearchAdRequestParcel searchAdRequestParcel0 = null;
        Location location0 = null;
        String s1 = null;
        Bundle bundle1 = null;
        Bundle bundle2 = null;
        List list1 = null;
        String s2 = null;
        String s3 = null;
        AdDataParcel adDataParcel0 = null;
        String s4 = null;
        List list2 = null;
        String s5 = null;
        while(parcel0.dataPosition() < v) {
            int v10 = parcel0.readInt();
            switch(((char)v10)) {
                case 1: {
                    v4 = baua.f(parcel0, v10);
                    break;
                }
                case 2: {
                    v1 = baua.i(parcel0, v10);
                    break;
                }
                case 3: {
                    bundle0 = baua.j(parcel0, v10);
                    break;
                }
                case 4: {
                    v5 = baua.f(parcel0, v10);
                    break;
                }
                case 5: {
                    list0 = baua.x(parcel0, v10);
                    break;
                }
                case 6: {
                    z = baua.D(parcel0, v10);
                    break;
                }
                case 7: {
                    v6 = baua.f(parcel0, v10);
                    break;
                }
                case 8: {
                    z1 = baua.D(parcel0, v10);
                    break;
                }
                case 9: {
                    s = baua.s(parcel0, v10);
                    break;
                }
                case 10: {
                    searchAdRequestParcel0 = (SearchAdRequestParcel)baua.m(parcel0, v10, SearchAdRequestParcel.CREATOR);
                    break;
                }
                case 11: {
                    location0 = (Location)baua.m(parcel0, v10, Location.CREATOR);
                    break;
                }
                case 12: {
                    s1 = baua.s(parcel0, v10);
                    break;
                }
                case 13: {
                    bundle1 = baua.j(parcel0, v10);
                    break;
                }
                case 14: {
                    bundle2 = baua.j(parcel0, v10);
                    break;
                }
                case 15: {
                    list1 = baua.x(parcel0, v10);
                    break;
                }
                case 16: {
                    s2 = baua.s(parcel0, v10);
                    break;
                }
                case 17: {
                    s3 = baua.s(parcel0, v10);
                    break;
                }
                case 18: {
                    z2 = baua.D(parcel0, v10);
                    break;
                }
                case 19: {
                    adDataParcel0 = (AdDataParcel)baua.m(parcel0, v10, AdDataParcel.CREATOR);
                    break;
                }
                case 20: {
                    v7 = baua.f(parcel0, v10);
                    break;
                }
                case 21: {
                    s4 = baua.s(parcel0, v10);
                    break;
                }
                case 22: {
                    list2 = baua.x(parcel0, v10);
                    break;
                }
                case 23: {
                    v8 = baua.f(parcel0, v10);
                    break;
                }
                case 24: {
                    s5 = baua.s(parcel0, v10);
                    break;
                }
                case 25: {
                    v9 = baua.f(parcel0, v10);
                    break;
                }
                case 26: {
                    v2 = baua.i(parcel0, v10);
                    break;
                }
                case 27: {
                    v3 = baua.i(parcel0, v10);
                    break;
                }
                default: {
                    baua.C(parcel0, v10);
                }
            }
        }
        baua.A(parcel0, v);
        return new AdRequestParcel(v4, v1, bundle0, v5, list0, z, v6, z1, s, searchAdRequestParcel0, location0, s1, bundle1, bundle2, list1, s2, s3, z2, adDataParcel0, v7, s4, list2, v8, s5, v9, v2, v3);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AdRequestParcel[v];
    }
}

